/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import model.User;

/**
 *
 * @author int.thong.nk
 */
public class registerController extends HttpServlet {
    //private static final String PHONE_VALID = "^[0-9]{10}$";
    //private static final String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
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
            out.println("<title>Servlet registerController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registerController at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("view/user/register.jsp").forward(request, response);
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
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String rePass = request.getParameter("repass");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        boolean gender = request.getParameter("gender").equals("true") ? true : false;
        Date dob = Date.valueOf(request.getParameter("dob"));
        UserDao db = new UserDao();
        User u = db.findUser(email);
        if (u != null) {
            request.getRequestDispatcher("view/user/register.jsp").forward(request, response);
            return;
        }
        if (!pass.equals(rePass)) {
            request.getRequestDispatcher("view/user/register.jsp").forward(request, response);
            return;
        } else {
            db.register(name, email, pass, gender, phone, address, 1, null, dob);
            response.sendRedirect("loginController");
            return;
        }
    }
//    public String checkInputNumber(String num){
//        while (true) {
//            try {
//                if (num.matches(PHONE_VALID)) {
//                    return num;
//                } 
//            } catch (NumberFormatException ex) {
//                
//            }
//        }
//    }
//    public static String checkInputEmail( String email) {
//        while (true) {
//            if (email.matches(EMAIL_VALID)) {
//               return email;
//            } 
//        }
//    }

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
