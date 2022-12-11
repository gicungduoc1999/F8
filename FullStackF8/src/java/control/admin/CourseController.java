/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.admin;

import dao.CourseDao;
import entity.Course;
import entity.CourseRequestParam;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class CourseController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, String type)
            throws ServletException, IOException {
        CourseRequestParam params = getParameter(request);
        CourseDao dao = new CourseDao();
        List<Course> data = dao.getCourse(params);

        int totalCourse = dao.countCourse(params);
        List<Integer> pages = new ArrayList<>();
        for (int i = 0; i < totalCourse / params.pageSize; i++) {
            pages.add(i);
        }
        if (totalCourse % params.pageSize != 0) {

            pages.add(pages.size());
        }
        System.out.println(pages.size());
        request.setAttribute("pages", pages);
        request.setAttribute("data", data);
        request.setAttribute("page", params.index);
        request.setAttribute("keyword", params.keyword);
        request.setAttribute("orderBy", params.orderBy);
        request.setAttribute("orderType", params.orderType);
        request.getRequestDispatcher("../view/admin/course.jsp").forward(request, response);
    }

    private CourseRequestParam getParameter(HttpServletRequest request) {
        String orderBy = request.getParameter("orderBy");
        String orderType = request.getParameter("orderType");
        String keyword = request.getParameter("keyword");
        String pageRaw = request.getParameter("page");
        int page = 0;

        try {
            page = Integer.parseInt(pageRaw);
        } catch (Exception e) {

        }

        CourseRequestParam res = new CourseRequestParam();

        // neu khong sort theo gi thi sẽ sort theo course id
        res.orderBy = orderBy == null || orderBy.trim().equals("") ? "course_id" : orderBy;
        res.orderType = orderType == null || orderType.trim().equals("") || orderType.equals("desc") ? "asc" : "desc";
        //khong search theo keyword nao ca
        if (keyword == null || keyword.trim().equals("")) {
            res.keyword = "";
        } else {
            //search theo keyword
            res.keyword = keyword;
        }

        CourseDao dao = new CourseDao();
        int totalCourse = dao.countCourse(res);
        int totalPage = totalCourse/2;
        if(totalCourse % 2 != 0){
            totalPage += 1;
        }
        //vuot qua page sie (vi du co 5 page thoi ma user click >> de cho len 6 thi page se ve 0)
        if (page > totalPage) {
            res.index = 0;
        } else {
            res.index = page;
        }

        System.out.println("params = " + res.orderBy + " " + res.orderType + " " + res.keyword + " " + res.index);
        return res;
    }   // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response, "GET");
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
        processRequest(request, response, "POST");
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
