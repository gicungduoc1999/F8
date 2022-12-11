<%-- 
    Document   : ChangePassword
    Created on : Dec 3, 2022, 9:57:57 PM
    Author     : PHANH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title> Change Password </title>
        <!-- Bootstrap 5 CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <link href="../../css/UserProfile.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="../../common/header.jsp"/>
        <div class="container-xl px-4 mt-4">
            <div class="card mb-4">
                <div class="card-header">Change password</div>
                <div class="card-body">
                    <form action="${pageContext.request.contextPath}/ChangePassword" method="POST">
                        <div class="mb-3">
                            <label class="small mb-1" for="inputPassword">Mật khẩu hiện tại</label>
                            <input class="form-control" id="OldPassword" name="OldPassword" type="password" placeholder="Nhập mật khẩu hiện tại" value="">
                        </div>
                        <div class="mb-3">
                            <label class="small mb-1" for="inputPassword">Mật khẩu mới</label>
                            <input class="form-control" id="Password" name="Password" type="password" placeholder="Nhập mật khẩu mới" value="">
                        </div>
                        <div class="mb-3">
                            <label class="small mb-1" for="inputRePass">Xác nhận mật khẩu mới</label>
                            <input class="form-control" id="RePass" name="RePass" type="password" placeholder="Nhập lại mật khẩu" value="">
                        </div>
                        <div>
                            <p class="${messageType}">${message}</p>
                        </div>
                        <button class="btn btn-primary" type="submit">Đổi mật khẩu</button>
                    </form>
                </div>
            </div>
        </div>

    </body>

    <%--<jsp:include page="../../common/footer.jsp"/>--%>
</html>