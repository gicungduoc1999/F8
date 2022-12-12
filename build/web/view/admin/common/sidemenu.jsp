<%-- 
    Document   : sidemenu
    Created on : Dec 3, 2022, 10:04:54 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav id="sidebar" class="sidebar-wrapper">
            <div class="sidebar-content" data-simplebar style="height: calc(100% - 60px);">
                <div class="sidebar-brand">
                    <a href="index.html">
                        <img src="${pageContext.request.contextPath}/img/f8.jpg" height="22" class="logo-light-mode" alt="">
                        <img src="${pageContext.request.contextPath}/img/f8.jpg" height="22" class="logo-dark-mode" alt="">
                        <span class="sidebar-colored">
                            <img src="${pageContext.request.contextPath}/img/f8.jpg" height="22" alt="">
                        </span>
                    </a>
                </div>

                <ul class="sidebar-menu">
                    <li><a href="${pageContext.request.contextPath}/view/admin/dashboard.jsp"><i class="uil uil-dashboard me-2 d-inline-block"></i>DASHBOARD</a></li>

                    <li class="sidebar-dropdown">
                        <a href="javascript:void(0)"><i class="uil uil-apps me-2 d-inline-block"></i>COURSE</a>
                        <div class="sidebar-submenu">
                            <ul>
                                <li><a href="${pageContext.request.contextPath}/admin/course">Course</a></li>
                                <li><a href="email.html">Chapter</a></li>
                                <li><a href="calendar.html">Lesson</a></li>
                                <li><a href="${pageContext.request.contextPath}/QuesTest">Question</a></li>
                             
                            </ul>
                        </div>
                    </li>
                    <li><a href="appointment.html"><i class="uil uil-stethoscope me-2 d-inline-block"></i>ORDER</a></li>
                    <li><a href="appointment.html"><i class="uil uil-stethoscope me-2 d-inline-block"></i>USERS</a></li>
                    <li><a href="${pageContext.request.contextPath}/postlist"><i class="uil uil-stethoscope me-2 d-inline-block"></i>POST</a></li>

                </ul>
                <!-- sidebar-menu  -->
            </div>
            <!-- Sidebar Footer -->
            <ul class="sidebar-footer list-unstyled mb-0">
                <li class="list-inline-item mb-0 ms-1">
                    <a href="#" class="btn btn-icon btn-pills btn-soft-primary">
                        <i class="uil uil-comment"></i>
                    </a>
                </li>
            </ul>
            <!-- Sidebar Footer -->
        </nav>
    </body>
</html>
