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
import model.factories.MovieFacadeLocal;
import model.factories.UserFacadeLocal;

/**
 *
 * @author palmeiira
 */
public class controller extends HttpServlet {

    CartBeanLocal cartBean = lookupCartBeanLocal();

    @EJB
    private MovieFacadeLocal movieFactoryEJB;

    @EJB
    private UserFacadeLocal userFactoryEJB;  

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
            
        String jsp = null;
        listMovies(request);
        jsp = "index.jsp";
        
        request.getSession().setAttribute("cart", cartBean.getCart());
        
        if (request.getRequestURI().endsWith("/account")) {
            jsp = "account.jsp";
        } else if (request.getRequestURI().endsWith("/checkout")) {
            jsp = "checkout.jsp";
        } else if (request.getRequestURI().endsWith("/cart")) {
            jsp = "cart.jsp";
        } else if (request.getRequestURI().endsWith("/cinema")) {
            jsp = "cinema.jsp";
        } else if (request.getRequestURI().endsWith("/error")) {
            jsp = "error.jsp";
        } else if (request.getRequestURI().endsWith("/movie")) {
            jsp = "movie.jsp";
        } else if (request.getRequestURI().endsWith("/registration")) {
            jsp = "registration.jsp";
        }

        request.getRequestDispatcher(jsp).forward(request, response);
        
    }
    
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
        
        if (request.getParameter("movie_id") != null){
            int movie_id = Integer.parseInt(request.getParameter("movie_id"));
            cartBean.addMovie(movie_id);
        }
        
        if (request.getParameter("delete_movie_id") != null){
            int movie_id = Integer.parseInt(request.getParameter("delete_movie_id"));
            cartBean.removeMovie(movie_id);
        }
        
        processRequest(request, response);
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

}
