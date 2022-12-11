/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.UserControll;

import common.Pager;
import dao.UserDao;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hoanglong2310
 */
public class SearchUser extends HttpServlet {

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
            out.println("<title>Servlet SearchUser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchUser at " + request.getContextPath() + "</h1>");
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
        UserDao userDao = new UserDao();

            String search = request.getParameter("search");
            int id = Integer.parseInt(request.getParameter("filter"));
            List<User> f1 = null;
            List<User> f2 = null;
            final int INDEX_PAGE = Pager.getIndexPage(request.getParameter("id"));

            try {
                f1 = userDao.SearchEmployees(search, id);
                f2 = userDao.SearchEmployeeInPage(INDEX_PAGE, id, search);
                if (f2.isEmpty()) {
                    f2 = null;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            final int TOTAL = f1.size();
            final int END_PAGE = Pager.getEndPage(TOTAL);

            int issearch = 1;
            request.setAttribute("bulen", issearch);
            request.setAttribute("activeIndex", INDEX_PAGE);
            request.setAttribute("sotrang", END_PAGE);
            request.setAttribute("list", f2);
            request.setAttribute("keySearch", search);
            request.setAttribute("filter", id);

            request.getRequestDispatcher("/view/admin/UserManage/UserManagement.jsp").forward(request, response);
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
        doGet(request, response);
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
