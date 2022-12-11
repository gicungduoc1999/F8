<%-- 
    Document   : login
    Created on : Nov 29, 2022, 9:40:23 PM
    Author     : LongVH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="login-left">
                <div class="login-header">
                    <div class="anh">
                    <img src="../../img/f8.jpg" alt="" height="50px"" />
                    <img src="img/f8.jpg" alt="" height="50px"" />
                    </div>
                    <h1>Đăng nhập vào F8</h1>
                </div>
                <form class="login-form" method="post" action="login">
                    <div class="login-form-content">
                        <div class="form-item">
                            <label for="email">Enter email</label>
                            <input type="email" id="inputEmail" name="inputEmail">
                        </div>
                        <div class="form-item">
                            <label for="password">Enter password</label>
                            <input type="password" id="inputPassword" name="inputPassword">
                        </div>
                    </div>
                    <div class="form-item">
                        <button type="submit">Sign In</button>
                    </div>
                </form>

                <a target="_blank" href="register">
                    Bạn chưa có tài khoản? Đăng kí.
                </a>
                <div class="anh1">
                <p>Việc bạn tiếp tục sử dụng trang web này đồng nghĩa với bạn đồng ý với điều khoản sử dụng của chúng tôi.</p>
                </div>
            </div>
<!--            <div class="login-form-deep">
                
            </div>-->
        </div>
    </body>
</html>