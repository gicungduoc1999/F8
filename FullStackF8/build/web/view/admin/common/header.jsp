<%-- 
    Document   : header_footer
    Created on : Nov 29, 2022, 1:02:20 PM
    Author     : Longvh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/main.css'>
    <script src='${pageContext.request.contextPath}/main.js'></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css"/>
</head>

<body>
    <header>
        <div class="top-header">
                             <a id="close-sidebar" class="btn btn-icon btn-pills btn-soft-primary ms-2" href="#">
                              
                                 <img class="uil uil-bars" src="${pageContext.request.contextPath}/assets/admin/img/4587300.png" width="20"/>
                  </a>
        </div>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">

                <a target="_blank" href="${pageContext.request.contextPath}/img/f8.jpg">Học Lập Trình Để Đi Làm</a>
                <img src="${pageContext.request.contextPath}/img/f8.jpg" alt="Northern Lights" width="35" height="35">
                 
           
            
            <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
                <form class="search">
                    <input class="form-control" type="search" placeholder="Search" aria-label="Search">
                    <!-- <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button> -->
                </form>
                <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                    <a target="_blank" href="${pageContext.request.contextPath}/img/lt.png">
                        <img src="${pageContext.request.contextPath}/img/lt.png" alt="Northern Lights" width="40" height="40">
                      </a>   
                      <a target="_blank" href="${pageContext.request.contextPath}/img/hoc.png">
                        <img src="${pageContext.request.contextPath}/img/hoc.png" alt="Northern Lights" width="40" height="40">
                      </a>  
                      <a target="_blank" href="${pageContext.request.contextPath}/img/bl.png">
                        <img src="${pageContext.request.contextPath}/img/bl.png" alt="Northern Lights" width="40" height="40">
                      </a>  
                      <a target="_blank" href="chooselogin.jsp">
                        <img src="${pageContext.request.contextPath}/img/addbl.png" alt="Northern Lights" width="40" height="40">
                      </a>
                      <a target="_blank" href="logincontroller">
                        Đăng Nhập
                      </a>
                      <a target="_blank" href="registercontroller">
                        Đăng Kí
                      </a>
                </ul>
            </div>
        </nav>
    </header>
</body>

</html>
