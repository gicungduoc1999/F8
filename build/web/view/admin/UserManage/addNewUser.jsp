<%-- 
    Document   : addNewCustomer
    Created on : Dec 5, 2022, 3:37:35 AM
    Author     : hoanglong2310
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add User</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/fcb595c1bc.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="alert">
            <c:if test="${success!=null}">
                <div class="col-sm-7 alert alert-success text-center" role="alert">
                    <p>${success}</p>
                </div>
            </c:if>
            <c:if test="${fail!=null}">
                <div class="col-sm-7 alert alert-danger text-center" role="alert">
                    <p>${fail}</p>
                </div>
            </c:if>
        </div>
        <div class="form-add" style="margin-left: 40px; margin-top: 20px">
            <form method="POST" action="<%=request.getContextPath()%>/AddNewUser">

                <div class="form-group row">
                    <label for="name" class="col-sm-2 col-form-label">Name <span
                            class="important"></span></label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="name" id="name" 
                               placeholder="Enter name" >
                        <div id="messName" hidden class="invalid-feedback"></div>
                    </div>
                </div>
                <div class="form-group row">

                    <label for="phone" class="col-sm-2 col-form-label">Email<span class="important"></span></label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="email" id="phone"
                               placeholder="Enter email">
                        <div id="messAcc" hidden class="invalid-feedback"></div>
                        <div ${messAcc!=null?"":"hidden"} class="invalid-feedback">${messAcc}</div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="birhtdate" class="col-sm-2 col-form-label">Password<span
                            class="important"></span> </label>
                    <div class="col-sm-5">
                        <input id="birhtdate" class="form-control" name="password" type="text"

                               placeholder="Enter pasword">
                        <div id="messBirthDate" hidden class="invalid-feedback"></div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="sex" class="col-sm-2 col-form-label">Phone<span
                            class="important"></span></label>
                    <div class="col-sm-5">
                        <input id="birhtdate" class="form-control" name="phone" type="text"

                               placeholder="Enter phone">
                        <div id="messBirthDate" hidden class="invalid-feedback"></div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="address" class="col-sm-2 col-form-label">Address</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="address" id="address"
                               placeholder="Enter address">
                        <div id="messAddress" hidden class="invalid-feedback"></div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="address" class="col-sm-2 col-form-label">Position</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="position" id="address"
                               placeholder="Enter position">
                        <div id="messAddress" hidden class="invalid-feedback"></div>
                    </div>
                </div>        
                <div class="form-group row">
                    <label for="address" class="col-sm-2 col-form-label">Company</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="company" id="address"
                               placeholder="Enter company">
                        <div id="messAddress" hidden class="invalid-feedback"></div>
                    </div>
                </div>      
                <div class="form-group row">
                    <label for="address" class="col-sm-2 col-form-label">Gender</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="gender" id="address"
                               placeholder="Enter gender">
                        <div id="messAddress" hidden class="invalid-feedback"></div>
                    </div>
                </div> 
                <div class="form-group row">
                    <label for="address" class="col-sm-2 col-form-label">Role</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="role" id="address"
                               placeholder="Enter role">
                        <div id="messAddress" hidden class="invalid-feedback"></div>
                    </div>
                </div>         

                <div class="form-group row">
                    <label for="email" class="col-sm-2 col-form-label">Status</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="status" id="email"
                               placeholder="Enter status">
                        <div id="messEmail" hidden class="invalid-feedback"></div>
                    </div>
                </div>
                <div class="col-sm-7 text-center">
                    <a href="<%=request.getContextPath()%>/ListUser"
                       type="button" class="btn btn-info"><i class="fas fa-backward"></i>Back</a>
                    <button type="submit" class="btn btn-success mb-0"><i class="fas fa-plus"></i>Add
                    </button>
                </div>
            </form>

        </div>
    </body>
</html>
