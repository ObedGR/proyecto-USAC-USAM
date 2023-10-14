/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.guatesalva.autentificaciones;

import com.guatesalva.controllers.usuarioEstudianteImplements;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author obedg
 */
@WebServlet(name = "validar", urlPatterns = {"/validar"})
public class autentificar extends HttpServlet {

    public autentificar() {
        super();
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //doGet(request, response);

        usuarioEstudianteImplements validacion = new usuarioEstudianteImplements();

        String user = request.getParameter("usuario");
        String password = request.getParameter("contrasenia");

        response.reset();

        response.setContentType("text/html");

        PrintWriter salida = response.getWriter();

        if (validacion.Autentificar(user, password)) {
            salida.print("<html><h1>Espere...</h1></html>");
            response.setHeader("Refresh", "0; URL=/proyecto/main.jsp");
        } else {
            salida.println("<html><h1>El usuario no existe</h1></html>");
        }
        destroy();
    }
    
    @Override
    public void destroy(){
        super.destroy();
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}
