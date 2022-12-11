<%-- 
    Document   : header_footer
    Created on : Nov 29, 2022, 1:02:20 PM
    Author     : Longvh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

    <head>
        <meta charset='utf-8'>
        <meta http-equiv='X-UA-Compatible' content='IE=edge'>
        <title>Page Title</title>
        <meta name='viewport' content='width=device-width, initial-scale=1'>
        <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
        <script src='main.js'></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">      
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <header>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">

                <a href="home">
                    <img src="img/f8.jpg" alt="Northern Lights" width="35" height="35">
                </a>   
                <a>
                    Học Lập Trình Để Đi Làm
                </a>
                <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
                    <form class="search">
                        <input class="form-control" type="search" placeholder="Search" aria-label="Search">
                        <!-- <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button> -->
                    </form>
                    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                        <a href="TraningDetailController">
                            <img src="img/lt.png" alt="Northern Lights" width="40" height="40">
                        </a>   
                        <a target="_blank" href="img/hoc.png">
                            <img src="img/hoc.png" alt="Northern Lights" width="40" height="40">
                        </a>  
                        <a target="_blank" href="img/bl.png">
                            <img src="img/bl.png" alt="Northern Lights" width="40" height="40">
                        </a>  
                        <a target="_blank" href="chooselogin.jsp">
                            <img src="img/addbl.png" alt="Northern Lights" width="40" height="40">
                        </a>
                        <c:if test="${sessionScope.user != null}">
                            <div class="dropdown">
                                <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenu2" data-bs-toggle="dropdown" aria-expanded="false">
                                    Hello ${sessionScope.user.name}
                                </button>
                                <ul class="dropdown-menu" aria-labelledby="dropdownMenu2">
                                    <li><button class="dropdown-item" type="button">Trang cá nhân</button></li>
                                    <li><button class="dropdown-item" type="button">Viết Blog</button></li>
                                    <li><button class="dropdown-item" type="button">bài viết của tôi</button></li>
                                    <li><button class="dropdown-item" type="button">Bài viết đã lưu</button></li>
                                    <!--<li><button class="dropdown-item" type="button">Thông tin cá nhân</button></li>-->

                                    <li><a class="dropdown-item" href="${pageContext.request.contextPath}/UserProfile?id=${user.getUser_id()}">Thông tin cá nhân</a></li>
                                    <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ChangePassword">Đổi mật khẩu</a></li>
                                    <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ChangePassword">Đơn hàng của tôi</a></li>
                                    <form action="LogOutController">
                                        <button class="dropdown-item" type="submit">Đăng xuất</button>
                                    </form>
                                </ul>
                            </div>
                        </c:if>
                        <c:if test="${sessionScope.user == null}">
                            <a href="login">
                                Đăng Nhập                        
                            </a>
                            <a href="register">
                                Đăng Kí
                            </a>
                        </c:if>

                    </ul>
                </div>
            </nav>
        </header>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    </body>

</html>
