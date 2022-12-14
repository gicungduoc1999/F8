/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.UserDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import stmp.Email;

/**
 *
 * @author PHANH
 */
public class PasswordResetController extends HttpServlet {

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
        //processRequest(request, response);
        request.getRequestDispatcher("view/user/PasswordReset.jsp").forward(request, response);
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
        UserDao user = new UserDao();
        Email e = new Email();
        String codeRandomNumber = e.getRandomNumber();//GET RANDOM CODE FOR USER
        String email = request.getParameter("email");
        if (user.getUserByEmail(email) != null) {//check email
            e.sendEmail(email, "Verify Your Code", "Hello !", codeRandomNumber);//Send code to email of user
//            user.updateCode(codeRandomNumber, email);//Update code to database
            HttpSession session = request.getSession();
            session.setAttribute("codeNumberRandom", codeRandomNumber);//save code to session
            session.setAttribute("emailForgotPass", email);//save email to session
            request.getRequestDispatcher("view/user/verifyCode.jsp").forward(request, response);
        } else {
            request.setAttribute("alert", "Email does not exist");
            request.getRequestDispatcher("view/PasswordReset.jsp").forward(request, response);
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
    
