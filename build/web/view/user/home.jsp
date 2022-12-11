<%-- 
    Document   : home
    Created on : Nov 29, 2022, 3:29:39 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomePage</title>
    </head>
    <body>
        <jsp:include page="../../common/header.jsp"/>
        <div class="container">
            <div class="container" style="margin-top: 100px">
                <div class="row">
                    <h2>List Course Premium: </h2>
                    <c:forEach items="${listC}" var="o">
                        <div class="col-sm-3" style="margin-top: 30px">
                            <div class="col-6 col-md-4">
                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src="${o.image}" style="width: 286px; height: 160px" alt="Card image cap">
                                    <div class="card-body">
                                        <p class="card-text" style="text-align: center">${o.course_Name}</p>
                                        <p class="card-text"><small class="text-muted">$= ${o.price}</small></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
                <div class="row" style="margin-top: 200px">
                    <h2>List Course Free: </h2>
                    <c:forEach items="${listF}" var="o">
                        <div class="col-sm-3" style="margin-top: 30px">
                            <div class="col-6 col-md-4">
                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src="${o.image}" style="width: 286px; height: 160px" alt="Card image cap">
                                    <div class="card-body">
                                        <p class="card-text" style="text-align: center">${o.course_Name}</p>
                                        <p class="card-text"><small class="text-muted">$= ${o.price}</small></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
                <div class="row" style="margin-top: 200px">
                    <h2>List Blog: </h2>
                    <c:forEach items="${listBlog}" var="o">
                        <div class="col-sm-3" style="margin-top: 30px">
                            <div class="col-6 col-md-4">
                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src="${o.image}" style="width: 286px; height: 160px" alt="Card image cap">
                                    <div class="card-body">
                                        <p class="card-text" style="text-align: center">${o.title}</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <div style="margin-top: 100px"><jsp:include page="../../common/footer.jsp"/></div>
            
    </body>
</html>