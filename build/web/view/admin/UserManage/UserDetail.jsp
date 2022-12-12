<%-- 
    Document   : UserDetail
    Created on : Dec 5, 2022, 1:12:51 AM
    Author     : hoanglong2310
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/fcb595c1bc.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="form-add">
            <c:if test="${success!=null}">
                <div>
                    <p>${success}</p>
                </div>
            </c:if>
            <c:if test="${fail!=null}">
                <div >
                    <p>${fail}</p>

                </div>
            </c:if>
            <form name="" method="POST" action="UserDetail">
                <input type="hidden" class="form-control" name="uid" required
                       placeholder="Enter full name" value="${user.user_id }" readonly>

                <div class="form-group row">
                    <label for="name" class="col-sm-2 col-form-label">Name <span
                            class="important"></span></label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="name" id="name" 
                               value="${user.name }" readonly>
                        <div id="messName" hidden class="invalid-feedback"></div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="phone" class="col-sm-2 col-form-label">Email<span class="important"></span></label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="email" id="phone"
                               value="${user.email }" readonly>
                        <div id="messPhone" hidden class="invalid-feedback"></div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="birhtdate" class="col-sm-2 col-form-label">Password<span
                            class="important"></span> </label>
                    <div class="col-sm-5">
                        <input id="birhtdate" class="form-control" name="password" type="text"

                               value="${user.password }" readonly>
                        <div id="messBirthDate" hidden class="invalid-feedback"></div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="sex" class="col-sm-2 col-form-label">Phone<span
                            class="important"></span></label>
                    <div class="col-sm-5">
                        <input id="birhtdate" class="form-control" name="phone" type="text"

                               value="${user.phone }" readonly>
                        <div id="messBirthDate" hidden class="invalid-feedback"></div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="address" class="col-sm-2 col-form-label">Address</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="address" id="address"
                               value="${user.address }" readonly>
                        <div id="messAddress" hidden class="invalid-feedback"></div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="address" class="col-sm-2 col-form-label">Position</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="position" id="address"
                               value="${user.position }" readonly>
                        <div id="messAddress" hidden class="invalid-feedback"></div>
                    </div>
                </div>        
                <div class="form-group row">
                    <label for="address" class="col-sm-2 col-form-label">Company</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="company" id="address"
                               value="${user.company }" readonly>
                        <div id="messAddress" hidden class="invalid-feedback"></div>
                    </div>
                </div>      
                <div class="form-group row">
                    <label for="address" class="col-sm-2 col-form-label">Gender</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="gender" id="address"
                               value="${user.gender }" readonly>
                        <div id="messAddress" hidden class="invalid-feedback"></div>
                    </div>
                </div> 
                <div class="form-group row">
                    <label for="address" class="col-sm-2 col-form-label">Role</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="role" id="address"
                               value="${user.role }">
                        <div id="messAddress" hidden class="invalid-feedback"></div>
                    </div>
                </div>         

                <div class="form-group row">
                    <label for="email" class="col-sm-2 col-form-label">Status</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" name="status" id="email"
                               value="${user.status }">
                        <div id="messEmail" hidden class="invalid-feedback"></div>
                    </div>
                </div>
                <div class="col-sm-7 text-center">
                    <a href="<%=request.getContextPath()%>/ListUser"
                       type="button" class="btn btn-info"><i class="fas fa-backward"></i>Back</a>
                    <button type="submit" class="btn btn-success mb-0"><i class="fas fa-plus"></i>Update
                    </button>
                </div>
            </form>
            
        </div>
    </body>
</html>
