/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.factories.CartBeanLocal;
import model.factories.CupponFacadeLocal;
import model.factories.MovieBeanLocal;
import model.factories.MovieFacadeLocal;
import model.factories.RentItemFacadeLocal;
import model.factories.UserBeanLocal;
import model.factories.UserFacadeLocal;

/**
 *
 * @author palmeiira
 */
public class controller extends HttpServlet {

    @EJB
    private RentItemFacadeLocal rentItemFacade;

    UserBeanLocal userBean = lookupUserBeanLocal();

    CartBeanLocal cartBean = lookupCartBeanLocal();

    @EJB
    private MovieBeanLocal movieBean;

    @EJB
    private CupponFacadeLocal cupponFactoryEJB;

    @EJB
    private MovieFacadeLocal movieFactoryEJB;

    @EJB
    private UserFacadeLocal userFactoryEJB;

    private boolean shouldRedirect;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String jsp = "index.jsp";
        listMovies(request);
        shouldRedirect = false;
        // Create a Cart
        request.getSession().setAttribute("cart", cartBean.getCart());
        // Sets a user to simulate login.
        userBean.setUser(userFactoryEJB.find(2));  
        // Fetch data from "logged" user
        request.getSession().setAttribute("user", userBean.getUser());
        
//        System.out.println(rentItemFacade.findByOwnerId(userBean.getUser()));
        // Redireciona de acordo com a requisição
        if (request.getRequestURI().endsWith("/account")) {
            jsp = "account.jsp";
        } else if (request.getRequestURI().endsWith("/checkout")) {
            jsp = "checkout.jsp";
        } else if (request.getRequestURI().endsWith("/cart")) {
            jsp = "cart.jsp";
        } else if (request.getRequestURI().endsWith("/cinema")) {
            // When there's a selected movie to watch (default flow)
            if (extractMovieIdAndSetBean(request)) {
                jsp = "cinema.jsp";
            } else {
                // Otherwise (user trying to acess /cinema from adress bar)
                response.sendRedirect(request.getContextPath() + "/");
                shouldRedirect = true;
            }
        } else if (request.getRequestURI().endsWith("/error")) {
            jsp = "error.jsp";
        } else if (request.getRequestURI().endsWith("/movie")) {
            // When there's a selected movie to go to its page (default flow)
            if (extractMovieIdAndSetBean(request)) {
                jsp = "movie.jsp";
            } else {
                // Otherwise (user trying to acess /movie from adress bar)
                response.sendRedirect(request.getContextPath() + "/");
                shouldRedirect = true;
            }
        } else if (request.getRequestURI().endsWith("/registration")) {
            jsp = "registration.jsp";
        }

        if (!shouldRedirect) {
            request.getRequestDispatcher(jsp).forward(request, response);
        }

    }
    /**
     *
     * @param request
     * @return true if movie id is in database. Besides returning true, sets the
     * movie managed by movieBean. If the movie id isn't in the database, return
     * false.
     */
    private boolean extractMovieIdAndSetBean(HttpServletRequest request) {
        if (request.getParameter("id") != null) {
            movieBean.setMovie(Integer.parseInt(request.getParameter("id")));
            request.getSession().setAttribute("movie", movieBean.getMovie());
            return true;
        }
        return false;
    }
    /**
     * 
     * @param request 
     * @return all movies stored in the database
     */
    private void listMovies(HttpServletRequest request) {
        List registro = movieFactoryEJB.findAll();
        request.setAttribute("lista", registro);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        boolean processRequest = true;

        if (request.getParameter("movie_id") != null) {
            int movie_id = Integer.parseInt(request.getParameter("movie_id"));
            cartBean.addMovie(movie_id);
        }

        if (request.getParameter("delete_movie_id") != null) {
            int movie_id = Integer.parseInt(request.getParameter("delete_movie_id"));
            cartBean.removeMovie(movie_id);
        }

        if (request.getParameter("cuppon") != null) {
            cartBean.getCart().setCuppon(cupponFactoryEJB.find(request.getParameter("cuppon")));
            request.getRequestDispatcher("cart.jsp").forward(request, response);
        }

        if (request.getParameter("proceed-to-checkout") != null) {
            if (userBean.getUser().getFname() != "") {
                request.getRequestDispatcher("checkout.jsp").forward(request, response);                
            }
            response.sendRedirect(request.getContextPath() + "/login");
            processRequest = false;
        }
        
        if (request.getParameter("pay-checkout") != null) {
            cartBean.newTransaction(userBean.getCardByIndex(Integer.valueOf(request.getParameter("inlineCardOptions"))), cartBean.getCart().getTotal());
            cartBean.finish(userBean.getUser());
            response.sendRedirect(request.getContextPath());
            processRequest = false;            
        }
        
        if (request.getParameter("cancel-checkout") != null || request.getParameter("clear-cart") != null) {
            cartBean.clearCart();
            response.sendRedirect(request.getContextPath());
            processRequest = false;
        }

        if (processRequest) {
            processRequest(request, response);
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private CartBeanLocal lookupCartBeanLocal() {
        try {
            Context c = new InitialContext();
            return (CartBeanLocal) c.lookup("java:global/CineOnline/CineOnline-ejb/CartBean!model.factories.CartBeanLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    private UserBeanLocal lookupUserBeanLocal() {
        try {
            Context c = new InitialContext();
            return (UserBeanLocal) c.lookup("java:global/CineOnline/CineOnline-ejb/UserBean!model.factories.UserBeanLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
