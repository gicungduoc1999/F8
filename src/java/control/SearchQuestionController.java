/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import common.Pager;
import dao.QuestionDao;
import entity.Question;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PHANH
 */
public class SearchQuestionController extends HttpServlet {

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
            out.println("<title>Servlet SearchQuestionController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchQuestionController at " + request.getContextPath() + "</h1>");
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
        QuestionDao dao = new QuestionDao();
        String search = request.getParameter("search");
        List<Question> f1 = null;
        List<Question> f2 = null;
        final int INDEX_PAGE = Pager.getIndexPage(request.getParameter("id"));

        if (search == null || search.equalsIgnoreCase("")) {
            f1 = dao.getAllQuestion();
            f2 = dao.GetQuestionFollowPage(INDEX_PAGE);
            if (f2.isEmpty()) {
                f2 = null;
            }
        } else {
            f1 = dao.searchQustion(search);
            f2 = dao.GetQuestionFollowPage(INDEX_PAGE, search);
            if (f2.isEmpty()) {
                f2 = null;
            }
        }
        final int TOTAL = f1.size();
        final int END_PAGE = Pager.getEndPage(TOTAL);

        int issearch = 1;
        request.setAttribute("bulen", issearch);
        request.setAttribute("activeIndex", INDEX_PAGE);
        request.setAttribute("sotrang", END_PAGE);
        request.setAttribute("listQues", f2);
        request.setAttribute("keySearch", search);

        request.getRequestDispatcher("/view/admin/QuestionList.jsp").forward(request, response);
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
