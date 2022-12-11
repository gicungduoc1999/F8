/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.loginDao;
import dao.registerDao;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
public class RegisterController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("view/user/register.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String name = request.getParameter("inputName");
        String email = request.getParameter("inputEmail");
        String password = request.getParameter("inputPassword");

        registerDao dao = new registerDao();
        User checkEmail = dao.checkEmail(email);

        if (checkEmail == null) {

            Boolean checkRegister = dao.addUser(name, email, password);
            if (checkRegister.equals(false)) {
                String errorEmail = "Tao tai khoan loi";
                request.setAttribute("errorMessage", errorEmail);
                //response.sendRedirect("view/user/home.jsp");
                request.getRequestDispatcher("view/user/register.jsp").forward(request, response);
            } else {
                String success = "Tao tai khoan thanh cong";
                request.setAttribute("errorMessage", success);
                //response.sendRedirect("view/user/home.jsp");
                request.getRequestDispatcher("view/user/login.jsp").forward(request, response);
            }
        } else {
            String errorEmail = "Da ton tai Email";
            request.setAttribute("errorMessage", errorEmail);
            request.getRequestDispatcher("view/user/register.jsp").forward(request, response);
        }

    }

}
