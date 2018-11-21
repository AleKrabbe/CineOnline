/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.factories.UserFacadeLocal;

/**
 *
 * @author palmeiira
 */
public class controller extends HttpServlet {

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

        if (request.getRequestURI().endsWith("/home")) {
//            listaUser(request);
            jsp = "index.jsp";
        } else if (request.getRequestURI().endsWith("/account")) {
            jsp = "account.jsp";
        } else if (request.getRequestURI().endsWith("/cart")) {
            jsp = "cart.jsp";
        } else if (request.getRequestURI().endsWith("/checkout")) {
            jsp = "checkout.jsp";
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
    
    private void listaUser(HttpServletRequest request) {
        List registro = userFactoryEJB.findAll();
        request.setAttribute("list", registro);
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

}
