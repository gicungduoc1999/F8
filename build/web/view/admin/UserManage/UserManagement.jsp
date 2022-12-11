<%-- 
Document   : UserManagement
Created on : Dec 4, 2022, 2:16:42 PM
Author     : hoanglong2310
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer List</title>
<link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/fcb595c1bc.js" crossorigin="anonymous"></script>
</head>

<body>
    <div class="container-fluid">
        <div class="row">
            <!--header admin-->

            <!--end header admin -->
            <div class="content container-fluid">
                <div class="row">
                    <!--sider menu-->
                    <!--end sider menu-->
                    <div class=" right col-sm-10">
                        <div class="right-content">
                            <h1>Customer list</h1>
                            <div class=" border-top">
                                <c:if test="${list==null && keySearch == null}">
                                    <div class="message text-center d-flex justify-content-center align-items-center"
                                         style="height: 350px;">
                                        <div class="ml-5">
                                            <p>Don't have any customer in system</p>
                                            <a href="#">Add new customer now.</a>
                                        </div>
                                    </div>
                                </c:if>
                                <c:if test="${list==null && keySearch != null}">
                                    <!-- filter start -->
                                    <div class="filter ">
                                        <form method="post" action="<%=request.getContextPath()%>/SearchUser">
                                            <div class="row d-flex ">
                                                <div class="col-sm-8 pr-0  ">
                                                    <div class="input-group mb-3 mt-3 justify-content-end">
                                                        <div class="input-group-prepend ">
                                                            <button class="btn button-search" type="submit"
                                                                    id="button-addon1"><i class="fas fa-search"></i>
                                                            </button>
                                                        </div>
                                                        <input type="text" class="filter-search" placeholder="Customer Search"
                                                               aria-label="Example text with button addon"
                                                               aria-describedby="button-addon1"
                                                               name="search"
                                                               value="${keySearch}">
                                                    </div>
                                                </div>
                                                <div class="col-sm-4 pl-0">
                                                    <div class="input-group mb-3 mt-3 justify-content-end">
                                                        <div class="input-group-prepend">
                                                            <span class="input-group-text" id="basic-addon2"><i
                                                                    class="fas fa-filter icon3"></i>Filter By</span>
                                                        </div>
                                                        <div class="input-group-append ">
                                                            <select class="form-control " name="filter">
                                                                <option value="1" ${filter==1?"selected":""}>Name</option>
                                                                <option value="2" ${filter==2?"selected":""}>Email
                                                                </option>
                                                                <option value="3" ${filter==3?"selected":""}>Phone</option>
                                                            </select>
                                                        </div>
                                                        <button class="btn btn-info float-right mb-0  ml-3" type="submit">
                                                            Search
                                                        </button>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                    <div class="message text-center d-flex justify-content-center align-items-center"
                                         style="height: 350px;">
                                        <div><i class="fas fa-file-excel fa-10x" style="color: #2a80dc"></i></div>
                                        <div class="ml-5">
                                            <p>No matches</p>
                                        </div>
                                    </div>
                                </c:if>

                                <c:if test="${list!=null}">
                                    <!-- filter start -->
                                    <div class="filter ">
                                        <form method="post" action="<%=request.getContextPath()%>/SearchUser">
                                            <div class="row d-flex ">
                                                <div class="col-sm-8 pr-0  ">
                                                    <div class="input-group mb-3 mt-3 justify-content-end">
                                                        <div class="input-group-prepend ">
                                                            <button class="btn button-search" type="submit"
                                                                    id="button-addon1">
                                                                <i class="fas fa-search"></i></button>
                                                        </div>
                                                        <input type="text" class="filter-search" placeholder="User Search"
                                                               name="search" aria-label="Example text with button addon"
                                                               aria-describedby="button-addon1"
                                                               value="${keySearch}">
                                                    </div>
                                                </div>
                                                <div class="col-sm-4 pl-0">
                                                    <div class="input-group mb-3 mt-3 justify-content-end">
                                                        <div class="input-group-prepend">
                                                            <span class="input-group-text" id="basic-addon1"><i
                                                                    class="fas fa-filter icon3"></i>Filter By</span>
                                                        </div>
                                                        <div class="input-group-append ">
                                                            <select class="form-control " name="filter">
                                                                <option value="1" ${filter==1?"selected":""}>Name</option>
                                                                <option value="2" ${filter==2?"selected":""}>Email
                                                                </option>
                                                                <option value="3" ${filter==3?"selected":""}>Phone</option>
                                                            </select>
                                                        </div>
                                                        <button class="btn btn-info float-right mb-0  ml-3" type="submit">
                                                            Search
                                                        </button>
                                                    </div>
                                                </div>

                                            </div>
                                            <a href="view/admin/UserManage/addNewUser.jsp"><button type="button" class="btn btn-success">Add new user</button></a>                
                                        </form>
                                    </div>
                                    <!-- filter end -->

                                    <%--message start--%>
                                    <c:if test="${success!=null}">
                                        <div class="col-sm-12 alert alert-success" role="alert">
                                            <p class="text-center">${success}</p>
                                        </div>
                                    </c:if>
                                    <c:if test="${fail!=null}">
                                        <div class="col-sm-12 alert alert-danger" role="alert">
                                            <p class="text-center">${fail}</p>
                                        </div>
                                    </c:if>
                                    <%--message end--%>
                                    <div class="content-list">
                                        <table class="table table-striped table-bordered" id="table">
                                            <thead>
                                                <tr>
                                                    <th>ID</th>
                                                    <th>Name</th>
                                                    <th>Email</th>
                                                    <th>Password</th>
                                                    <th>Phone</th>
                                                    <th>Address</th>
                                                    <th>Role</th>
                                                    <th>Gender</th>
                                                    <th>Status</th>                                            
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach items="${list}" var="a">
                                                    <tr>
                                                        <th class="user_id" scope="row">${a.user_id }</th>
                                                        <td class="name">${a.name }</td>
                                                        <td>${a.email }</td>
                                                        <td>${a.password }</td>
                                                        <td>${a.phone }</td>
                                                        <td>${a.address }</td>
                                                        <td>${a.role }</td>
                                                        <td>${a.gender }</td>
                                                        <td>${a.status }</td>
                                                        <td>
                                                            <a href="UserDetail?uid=${a.user_id }"><i class="fas fa-pen"></i>Detail</a>
                                                            <a class="delete" href="DeleteUser?uid=${a.user_id }" data-toggle="modal"><i
                                                                    class="fas fa-trash-alt"></i>Delete</a>
                                                        </td>
                                                    </tr>
                                                </c:forEach>
                                            </tbody>    
                                        </table>
                                    </div>


                                    <div class="modal fade" id="confirm" tabindex="-1" role="dialog"
                                         aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                                        <form  method="post"
                                              action="<%=request.getContextPath()%>/DeleteUser">
                                            <div class="modal-dialog modal-dialog-centered" role="document">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <h5 class="modal-title" id="exampleModalLongTitle">Confirm</h5>
                                                        <button type="button" class="close" data-dismiss="modal"
                                                                aria-label="Close"><span aria-hidden="true">&times;</span>
                                                        </button>
                                                    </div>
                                                    <div class="modal-body">
                                                        <input type="hidden" id="idE" value="" name="id">
                                                        <h6 id="modal_body"></h6>
                                                    </div>
                                                    <div class="modal-footer">
                                                        <button type="button" class="btn btn-secondary"
                                                                data-dismiss="modal">Close
                                                        </button>
                                                        <button type="submit" class="btn btn-danger" id="delete">Delete
                                                        </button>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                    </div>   
                                    <!-- Confirm end-->


                                    <!-- paging start -->
                                    <nav class="text-center">
                                        <ul class="pagination mt-4">
                                            <c:choose>
                                                <c:when test="${bulen==1}">
                                                    <li class="page-item ${activeIndex == 1?"disabled":""}">
                                                        <a class="page-link "
                                                           href="SearchUser?id=${activeIndex-1}&search=${keySearch}&filter=${filter}">Previous</a>
                                                    </li>
                                                </c:when>
                                                <c:otherwise>
                                                    <li class="page-item ${activeIndex == 1?"disabled":""}">
                                                        <a class="page-link " href="ListUser?id=${activeIndex-1}">Previous</a>
                                                    </li>
                                                    <br/>
                                                </c:otherwise>
                                            </c:choose>
                                            <c:choose>
                                                <c:when test="${bulen==1}">
                                                    <c:forEach begin="1" end="${sotrang }" var="i">
                                                        <li class="page-item ${activeIndex==i?"active":""}">
                                                            <a class="page-link"
                                                               href="SearchUser?id=${i}&search=${keySearch}&filter=${filter}">${i }</a>
                                                        </li>
                                                    </c:forEach>
                                                </c:when>
                                                <c:otherwise>
                                                    <c:forEach begin="1" end="${sotrang }" var="i">
                                                        <li class="page-item ${activeIndex==i?"active":""}">
                                                            <a class="page-link" href="ListUser?id=${i}">${i}</a>
                                                        </li>
                                                    </c:forEach>
                                                    <br/>
                                                </c:otherwise>
                                            </c:choose>
                                            <c:choose>
                                                <c:when test="${bulen==1}">
                                                    <li class="page-item ${activeIndex == sotrang?"disabled":""}">
                                                        <a class="page-link"
                                                           href="SearchUser?id=${activeIndex+1}&search=${keySearch}&filter=${filter}">Next</a>
                                                    </li>
                                                </c:when>
                                                <c:otherwise>
                                                    <li class="page-item ${activeIndex == sotrang?"disabled":""}">
                                                        <a class="page-link"
                                                           href="ListUser?id=${activeIndex+1}">Next</a>
                                                    </li>
                                                    <br/>
                                                </c:otherwise>
                                            </c:choose>
                                        </ul>

                                    </nav>
                                    <!-- paging end -->
                                </c:if>

                            </div>
                        </div>
                    </div>

                </div>
            </div>

        </div>
    </div>

</body>

<script src="js/jquery_3.6.0.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(".delete").click(function (event) {
        var $row = $(this).closest("tr");
        var $id = $row.find(".user_id").text();
        var $name = $row.find(".name").text();

        // var id = $("#empID").val();
        $("#user_id").val($.trim($id));
        
        var str = "Are you sure to delete (User  " + $id + " - " + "Name: " + $name + ")?";
        $("#modal_body").html(str);
    }); 
</script>
</html>