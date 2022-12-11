/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.loginDao;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.taglibs.standard.lang.jstl.Logger;
import java.util.logging.*;

/**
 *
 * @author Longvh
 */

public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("view/user/login.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String email = request.getParameter("inputEmail");
        String password = request.getParameter("inputPassword");

        loginDao dao = new loginDao();
        User a = dao.getUser(email, password);
        if (a != null) {
            if(a.getRole().equals("admin")){
                session.setAttribute("user", a);
                request.getRequestDispatcher("view/admin/dashboard.jsp").forward(request, response);
            }
            session.setAttribute("user", a);
            response.sendRedirect("home");
            //request.getRequestDispatcher("view/user/home.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Ten dang nhap hoac mat khau sai");
            //response.sendRedirect("view/user/home.jsp");
            request.getRequestDispatcher("view/user/login.jsp").forward(request, response);
        }

    }

}
