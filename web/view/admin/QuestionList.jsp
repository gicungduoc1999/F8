s<%-- 
    Document   : QuestionList
    Created on : Dec 8, 2022, 9:45:40 AM
    Author     : PHANH
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <!-- Latest compiled and minified CSS -->
        <link
            rel="stylesheet"
            href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
            integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
            crossorigin="anonymous"
            />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="/SPM/css/styles.css" rel="stylesheet" />
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <link rel="shortcut icon" href="../assets/images/favicon.ico">

        <!-- Css -->
        <link href="${pageContext.request.contextPath}/assets/admin/libs/simplebar/simplebar.min.css" rel="stylesheet">
        <!-- Bootstrap Css -->
        <link href="${pageContext.request.contextPath}/assets/admin/css/bootstrap.min.css" class="theme-opt" rel="stylesheet" type="text/css" />
        <!-- Icons Css -->
        <link href="${pageContext.request.contextPath}/assets/admin/css/icons.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/admin/libs/remixicon/fonts/remixicon.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/admin/libs/@iconscout/unicons/css/line.css" type="text/css" rel="stylesheet" />
        <!-- Style Css-->
        <link href="${pageContext.request.contextPath}/assets/admin/css/style.min.css" class="theme-opt" rel="stylesheet" type="text/css" />
        <title>Question List</title>
    </head>
    <body>
        <div class="page-wrapper doctris-theme toggled">
            <!-- sidebar-wrapper -->
            <jsp:include page="common/sidemenu.jsp"/>

            <main class="page-content bg-light">

                <jsp:include page="common/header.jsp"/>
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 mb-4">
                            <h3>Question List</h3>
                        </div>
                        <div class="col-md-3 mb-3">
                            <a href="${pageContext.request.contextPath}/AddQuestionController" class="btn btn-link float-right">Add Question</a>
                        </div>
                        <c:if test="${listQues == null && keySearch == null}">
                            <form method="post" action="searchQuestion">
                                <div class="row d-flex ">
                                    <div class="right col-sm-12 pl-0">
                                        <div class="input-group mb-3 mt-3 justify-content-end">
                                            <input type="text" class="filter-search" placeholder="Search Question" name="search"
                                                   aria-label="Example text with button addon" aria-describedby="button-addon1" value="${keySearch}">
                                            <button class="btn btn-info float-right mb-0  ml-3" type="submit">
                                                Search
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </c:if>
                        <c:if test="${listQues == null && keySearch != null}">
                            <form method="post" action="searchQuestion">
                                <div class="row d-flex ">
                                    <div class="right col-sm-12 pl-0">
                                        <div class="input-group mb-3 mt-3 justify-content-end">
                                            <input type="text" class="filter-search" placeholder="Search Question" name="search"
                                                   aria-label="Example text with button addon" aria-describedby="button-addon1" value="${keySearch}">
                                            <button class="btn btn-info float-right mb-0  ml-3" type="submit">
                                                Search
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </c:if>
                        <c:if test="${listQues != null}">
                            <form method="post" action="searchQuestion">
                                <div class="row d-flex ">
                                    <div class="right col-sm-12 pl-0">
                                        <div class="input-group mb-3 mt-3 justify-content-end">
                                            <input type="text" class="filter-search" placeholder="Search Question" name="search"
                                                   aria-label="Example text with button addon" aria-describedby="button-addon1" value="${keySearch}">
                                            <button class="btn btn-info float-right mb-0  ml-3" type="submit">
                                                Search
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="col-md-12">
                            <table class="table table-bordered">
                                <thead class="thead-light">
                                    <tr>
                                        <th scope="col">ID</th>
                                        <th scope="col">Course</th>
                                        <th scope="col">Lesson</th>
                                        <th scope="col">Content</th>
                                        <th scope="col">Explanation</th>
                                        <th scope="col">Actions</th>
                                        <th scope="col"> </th>
                                    </tr>
                                </thead>
                                <c:forEach items="${listQues}" var="o">
                                    <tr>                  
                                        <td>${o.question_id}</td>
                                        <td>${o.course_name}</td>
                                        <td>${o.lesson_name}</td>
                                        <td>${o.content}</td>
                                        <td>${o.explanation}</td>
                                        <td>                       
                                            <div class="container">
                                                <div class="row">
                                                    <div class="col-sm">
                                                        <button>Edit</button>
                                                    </div>                             
                                                </div>
                                            </div>
                                        </td>
                                        <td>                       
                                            <div class="container">
                                                <div class="row">
                                                    <div class="col-sm">
                                                        <button>Delete</button>
                                                    </div>                              
                                                </div>
                                            </div>
                                        </td>

                                    </tr>
                                </c:forEach>

                            </table>
                            <div class="col-md-12">
                                <nav class="text-center">
                                    <ul class="pagination mt-4">
                                        <c:choose>
                                            <c:when test="${bulen==1}">
                                                <li class="page-item ${activeIndex == 1?"disabled":""}">
                                                    <a class="page-link "
                                                       href="searchQuestion?id=${activeIndex-1}&search=${keySearch}">Previous</a>
                                                </li>
                                            </c:when>
                                            <c:otherwise>
                                                <li class="page-item ${activeIndex == 1?"disabled":""}">
                                                    <a class="page-link " href="QuesTest?id=${activeIndex-1}">Previous</a>
                                                </li>
                                                <br/>
                                            </c:otherwise>
                                        </c:choose>
                                        <c:choose>
                                            <c:when test="${bulen==1}">
                                                <c:forEach begin="1" end="${sotrang }" var="i">
                                                    <li class="page-item ${activeIndex==i?"active":""}">
                                                        <a class="page-link"
                                                           href="searchQuestion?id=${i}&search=${keySearch}">${i }</a>
                                                    </li>
                                                </c:forEach>
                                            </c:when>
                                            <c:otherwise>
                                                <c:forEach begin="1" end="${sotrang }" var="i">
                                                    <li class="page-item ${activeIndex==i?"active":""}">
                                                        <a class="page-link" href="QuesTest?id=${i}">${i}</a>
                                                    </li>
                                                </c:forEach>
                                                <br/>
                                            </c:otherwise>
                                        </c:choose>
                                        <c:choose>
                                            <c:when test="${bulen==1}">
                                                <li class="page-item ${activeIndex == sotrang?"disabled":""}">
                                                    <a class="page-link"
                                                       href="searchQuestion?id=${activeIndex+1}&search=${keySearch}">Next</a>
                                                </li>
                                            </c:when>
                                            <c:otherwise>
                                                <li class="page-item ${activeIndex == sotrang?"disabled":""}">
                                                    <a class="page-link"
                                                       href="QuesTest?id=${activeIndex+1}">Next</a>
                                                </li>
                                                <br/>
                                            </c:otherwise>
                                        </c:choose>
                                    </ul>

                                </nav>
                            </div>
                        </c:if>
 
                    </div>
                </div>
            </main>

            <script src="${pageContext.request.contextPath}/assets/admin/assets/admin/libs/simplebar/simplebar.min.js"></script>
            <script src="${pageContext.request.contextPath}/assets/admin/libs/apexcharts/apexcharts.min.js"></script>
            <script src="${pageContext.request.contextPath}/assets/admin/js/admin-apexchart.init.js"></script>
            <script src="${pageContext.request.contextPath}/assets/admin/libs/feather-icons/feather.min.js"></script>
            <!-- Main Js -->
            <!-- JAVASCRIPT -->
            <script src="${pageContext.request.contextPath}/assets/admin/libs/bootstrap/js/bootstrap.bundle.min.js"></script>
            <script src="${pageContext.request.contextPath}/assets/admin/js/plugins.init.js"></script>
            <script src="${pageContext.request.contextPath}/assets/admin/js/app.js"></script>
    </body>
</html>
