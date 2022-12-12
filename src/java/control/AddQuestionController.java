/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.CourseDao;
import dao.LessonDao;
import dao.OptionDao;
import dao.QuestionDao;
import entity.Course;
import entity.Lesson;
import entity.LessonDto;
import entity.Option;
import entity.Question;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PHANH
 */
public class AddQuestionController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

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
        CourseDao couseDao = new CourseDao();
        LessonDao lessonDao = new LessonDao();
        List<String> listCouse = couseDao.getNameCourses();
        List<Lesson> listLesstion = lessonDao.getAllLesson();

        request.setAttribute("listCouseName", listCouse);
        request.setAttribute("listLesstion", listLesstion);

        request.getRequestDispatcher("view/admin/AddQuestion.jsp").forward(request, response);

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
        //get value question
        String content = request.getParameter("content");
        String couse = request.getParameter("couse");
        String lesson = request.getParameter("lesson");
        String explanation = request.getParameter("explanation");

        //get value option 
        int countText = Integer.parseInt(request.getParameter("countText"));
        HashMap<String, Boolean> optionMap = new HashMap<>();
        for (int i = 1; i <= countText; i++) {
            String nameText = "txt" + i;
            String nameIsTrue = "ckb" + i;
            String text = request.getParameter(nameText);
            String isTrueString = request.getParameter(nameIsTrue);
            Boolean isTrue = false;
            if (isTrueString != null) {
                isTrue = true;
            }
            optionMap.put(text, isTrue);
        }

   

        //add question
        Question question = new Question(-1, couse, lesson, content, explanation);
        question.setStatus(1);
        QuestionDao questionDao = new QuestionDao();
        int id = questionDao.addQuestion(question);
        if (id == -1) {
            request.setAttribute("mess", "add question fail");
            request.getRequestDispatcher("view/admin/AddQuestion.jsp").forward(request, response);
            return;
        }

        //add option
        OptionDao optionDao = new OptionDao();
        for (Map.Entry<String, Boolean> entry : optionMap.entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();

            Option option = new Option(-1, id, key, value);
            int idOption = optionDao.addOption(option);

            if (idOption == -1) {
                request.setAttribute("mess", "add option fail");
                request.getRequestDispatcher("view/admin/AddQuestion.jsp").forward(request, response);
                return;
            }
        }
        
         response.sendRedirect("QuesTest");
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
