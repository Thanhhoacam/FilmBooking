package controller;

import DAO.ShowDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Show;

/**
 *
 * @author Admin
 */
public class chooseShowController extends HttpServlet {

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
            out.println("<title>Servlet chooseShowController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet chooseShowController at " + request.getContextPath() + "</h1>");
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
        int movieId = Integer.valueOf(request.getParameter("filmId"));
        LocalDate now = LocalDate.now();
        Date dateNow = Date.valueOf(now);
        List<Date> date = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            Date sqlDate = Date.valueOf(now);
            date.add(sqlDate);
            now = now.plusDays(1);
        }
        ShowDao db = new ShowDao();
//        response.getWriter().print(dateNow);
        List<Show> show = db.getShow(movieId, dateNow);
        request.setAttribute("filmId", movieId);
        request.setAttribute("date", date);
        request.setAttribute("show", show);
        request.getRequestDispatcher("view/user/chooseShowMovie.jsp").forward(request, response);
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
        int movieId = Integer.valueOf(request.getParameter("filmId"));
        Date d = Date.valueOf(request.getParameter("date"));

        LocalDate now = LocalDate.now();
        Date dateNow = Date.valueOf(now);
        List<Date> date = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            Date sqlDate = Date.valueOf(now);
            date.add(sqlDate);
            now = now.plusDays(1);
        }
        ShowDao db = new ShowDao();
        List<Show> show = db.getShow(movieId, d);
        request.setAttribute("filmId", movieId);
        request.setAttribute("date", date);
        request.setAttribute("show", show);

        request.getRequestDispatcher("view/user/chooseShowMovie.jsp").forward(request, response);
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
