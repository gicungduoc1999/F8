<%-- 
    Document   : login
    Created on : Nov 29, 2022, 9:40:23 PM
    Author     : LongVH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../../css/register.css" rel="stylesheet" type="text/css"/>
        <link href="css/register.css" rel="stylesheet" type="text/css"/>
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
                    <h1>Đăng ký tài khoản F8</h1>
                </div>
                <form class="login-form" method="post" action="register">
                    <div class="login-form-content">
                        <div class="form-item">
                            <label for="name">Enter your name</label>
                            <input type="text" id="inputName" name="inputName">${errorMessage}
                        </div>
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
                        <button type="submit">Đăng ký</button>
                    </div>
                </form>

                <a target="_blank" href="login">
                    Bạn đã có tài khoản? Đăng nhập.
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
