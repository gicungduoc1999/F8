/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stmp;

import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Email {

    

    public String getRandomNumber() {
        Random random = new Random();
        String number = ((int) Math.floor(Math.random() * (99999999 - 10000000 + 1) + 10000000)) + "";
        return number;
    }

    public void sendEmail(String toEmailAddress, String subject, String message, String verificationCode) {

        String email = "phuongthuan2204@gmail.com";
        String password = "tqnsxbyzmascqkuh";

        try {
            // sets SMTP server properties
            Properties properties = new Properties();
            properties.setProperty("mail.smtp.host", "smtp.gmail.com");
            properties.setProperty("mail.smtp.port", "587");
            properties.setProperty("mail.smtp.auth", "true");
            properties.setProperty("mail.smtp.starttls.enable", "true");

            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");

            Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(email, password);
                }
            });

            //creates a new e-mail message
            Message msg = new MimeMessage(session);

            msg.setFrom(new InternetAddress(email));
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmailAddress));
            msg.setSubject(subject);
            String htmlContent = "<h1>" + message + "<h1><br><h3> Your Verification Code is " + verificationCode + ". Use this code to verify your account.<h3>";
            msg.setContent(htmlContent, "text/html; charset=utf-8");

            // sends the e-mail
            Transport.send(msg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
