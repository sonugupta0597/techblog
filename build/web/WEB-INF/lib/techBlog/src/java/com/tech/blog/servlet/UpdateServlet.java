/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.servlet;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.Message;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.helper.Helper;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author pc
 */
@MultipartConfig
public class UpdateServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateServlet</title>");
            out.println("</head>");
            out.println("<body>");
            String name = request.getParameter("user_name");
            String about = request.getParameter("about");
            String password = request.getParameter("user_password");

            String email = request.getParameter("user_email");

            Part p = request.getPart("user_profile");
            String profile = p.getSubmittedFileName();
            HttpSession session = request.getSession();

            User user = (User) session.getAttribute("currentSession");

            User updateUser = new User(user.getId(), name, email, password, user.getGender(), about, profile);

            UserDao userdao = new UserDao(ConnectionProvider.getConnection());
            if (userdao.UpdateUser(updateUser)) {
                String newPath = request.getRealPath("/") + "pics" + File.separator + updateUser.getProfile();
                String oldPath = request.getRealPath("/") + "pics" + File.separator + user.getProfile();
                if (!user.getProfile().equals("dedault.png")) {
                    Helper.deletePic(oldPath);
                }
                if (Helper.addPic(p.getInputStream(), newPath)) {

                    Message m = new Message("profile Updated Successfully", "success", "alert-success");
                    HttpSession s = request.getSession();
                    s.setAttribute("msg", m);
                    
                } else {
                    Message m = new Message("profile Updation Failed", "success", "alert-danger");
                    HttpSession s = request.getSession();
                    s.setAttribute("msg", m);
                    
                }
            } else {
                
                    Message m = new Message("profile Updation Failed", "success", "alert-danger");
                    HttpSession s = request.getSession();
                    s.setAttribute("msg", m);
            }
            
            response.sendRedirect("profile.jsp");

            out.println("</body>");
            out.println("</html>");
        }
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
