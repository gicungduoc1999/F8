/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.admin;

import dao.CourseDao;
import entity.Course;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class CourseProcessController extends HttpServlet {

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

        String action = request.getParameter("action");
        System.out.println(request.getMethod() + action);
        if (action != null && (action.equals("add") || action.equals("edit") || action.equals("delete"))) {
            String idRaw = request.getParameter("id");
            switch (action) {
                case "add":
                    if (request.getMethod().equals("POST")) {
                        String message = "";
                        if (add(request)) {
                            message = "Add success !";
                        } else {
                            message = "Add Fail !";
                        }
                        System.out.println(message);
                        request.setAttribute("MESSAGE", message);
                    }

                    request.getRequestDispatcher("../view/admin/addcourse.jsp").forward(request, response);
                    return;
                case "edit":
                    if (request.getMethod().equals("POST")) {
                        if (edit(request)) {
                            request.setAttribute("MESSAGE", "Edit success !");
                        } else {
                            request.setAttribute("MESSAGE", "Edit Fail");
                        }
                    }
                    Course data = new CourseDao().getById(Integer.parseInt(idRaw));
                    request.setAttribute("data", data);
                    System.out.println(data.getDes());
                    request.getRequestDispatcher("../view/admin/edit.jsp").forward(request, response);
                    return;
                default:
                    delete(Integer.parseInt(idRaw));
                    response.sendRedirect(request.getContextPath() + "/admin/course");
                    break;
            }
        } else {
            response.sendRedirect(request.getContextPath() + "/admin/course");
        }
    }

    private boolean add(HttpServletRequest request) {
        try {
            int id = (int) System.currentTimeMillis();
            id = id <= 0 ? id * -1 : id;
            String name = request.getParameter("name");
            String description = request.getParameter("description");
            String priceRaw = request.getParameter("price");
            CourseDao dao = new CourseDao();
            Course data = new Course();
            data.setCourse_Id(id);
            data.setCourse_Name(name);
            data.setDes(description);
            data.setPrice(priceRaw);
            dao.add(data);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean edit(HttpServletRequest request) {
        try {
            String idRaw = request.getParameter("id");
            String name = request.getParameter("name");
            String description = request.getParameter("description");
            String priceRaw = request.getParameter("price");
            int id = Integer.parseInt(idRaw);
            float price = Float.parseFloat(priceRaw);
            CourseDao dao = new CourseDao();
            Course data = dao.getById(id);
            data.setCourse_Name(name);
            data.setDes(description);
            data.setPrice(priceRaw);
            dao.update(data);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    private void delete(int id) {
        try {
            new CourseDao().delete(id);
        } catch (Exception e) {

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
