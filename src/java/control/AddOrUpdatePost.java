/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.postDao;
import dao.registerDao;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author legion
 */
public class AddOrUpdatePost extends HttpServlet {

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
            out.println("<title>Servlet NewServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
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
        HttpSession session = request.getSession();
        String title = request.getParameter("inputTitle");
        String excerpt = request.getParameter("inputExcerpt");
        String category = request.getParameter("inputCategory");
        String tags = request.getParameter("inputTags");
        String content = request.getParameter("inputContent");
        String author = request.getParameter("inputAuthor");
        String comment = request.getParameter("inputComment");
        String status = request.getParameter("inputStatus");
        int userId = Integer.parseInt(request.getParameter("userId"));
        postDao dao = new postDao();
        if (request.getParameter("id") != null) {
            int id = Integer.parseInt(request.getParameter("id"));
            if (request.getParameter("action").equals("update")) {
                Boolean checkUpdate = dao.updatePost(id, title, excerpt, category, tags, content, comment, userId, status);
                if (checkUpdate.equals(false)) {
                    String errorMesage = "Loi cap nhap";
                    request.setAttribute("errorMessage", errorMesage);
                    //response.sendRedirect("view/user/home.jsp");
                    request.getRequestDispatcher("view/user/postdetails.jsp").forward(request, response);
                } else {
                    String success = "Cap nhap bai viet thanh cong";
                    request.setAttribute("successMessage", success);
                    //response.sendRedirect("view/user/home.jsp");
                    request.getRequestDispatcher("view/user/postlist.jsp").forward(request, response);
                }
            }else{
                Boolean checkUpdate = dao.deletePost(id);
                if (checkUpdate.equals(false)) {
                    String errorMesage = "Loi xoa";
                    request.setAttribute("errorMessage", errorMesage);
                    //response.sendRedirect("view/user/home.jsp");
                    request.getRequestDispatcher("view/user/postdetails.jsp").forward(request, response);
                } else {
                    String success = "Xoa thanh cong";
                    request.setAttribute("successMessage", success);
                    //response.sendRedirect("view/user/home.jsp");
                    request.getRequestDispatcher("view/user/postlist.jsp").forward(request, response);
                }
            }

        } else {
            Boolean checkUpdate = dao.addPost(title, excerpt, category, tags, content, comment, userId, status);
            if (checkUpdate.equals(false)) {
                String errorMesage = "Loi them bai viet";
                request.setAttribute("errorMessage", errorMesage);
                //response.sendRedirect("view/user/home.jsp");
                request.getRequestDispatcher("view/user/postdetails.jsp").forward(request, response);
            } else {
                String success = "Tao bai viet thanh cong";
                request.setAttribute("successMessage", success);
                //response.sendRedirect("view/user/home.jsp");
                request.getRequestDispatcher("view/user/postlist.jsp").forward(request, response);
            }
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

}
