<%-- 
    Document   : OrderUpdate
    Created on : Dec 11, 2022, 3:23:56 PM
    Author     : PHANH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title> User Profile</title>
        <!-- Bootstrap 5 CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <link href="../../css/UserProfile.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <div class="container-xl px-4 mt-4">
            <hr class="mt-0 mb-4">
            <div class="row">
                <div class="col-xl-4">
                    <!-- Profile picture card-->
                    <div class="card mb-4 mb-xl-0">
                        <div class="card-header">User Avatar</div>
                        <div class="card-body text-center">
                            <!-- Profile picture image-->
                            <img class="img-account-profile rounded-circle mb-2" src="${user.getAvatar()}" alt="">
                            <!-- Profile picture help block-->
                            <div class="small font-italic text-muted mb-4">JPG or PNG no larger than 5 MB</div>
                            <!-- Profile picture upload button-->
                            <button class="btn btn-primary" type="button">Change</button>
                            <!--<input type="file" class="text-center center-block file-upload">-->
                        </div>
                    </div>
                </div>
                <div class="col-xl-8">
                    <div class="card mb-4">
                        <h2>Thay đổi thông tin cá nhân</h2>
                        <div class="card-body">
                            <form action="UserProfile" method="POST">
                                <!-- Form Group (username)-->
                                <div class="mb-3">
                                    <label class="small mb-1" for="inputID">ID</label>
                                    <input class="form-control" id="ID" type="text" value="${user.getUser_id()}" disabled>
                                </div>
                                <!-- Form Group (email address)-->
                                <div class="mb-3">
                                    <label class="small mb-1" for="inputName">Họ tên</label>
                                    <input class="form-control" id="Name" name="Name" type="text" placeholder="Nhập họ tên" value="${user.getName()}">
                                </div>
                                <div class="mb-3">
                                    <label class="small mb-1" for="inputEmail">Email</label>
                                    <input class="form-control" id="Email" name="Email" type="email" value="${user.getEmail()}" disabled>
                                </div>
                                <!-- Form Row-->
                                <div class="mb-3">
                                    <!-- Form Group (phone number)-->                                
                                    <label class="small mb-1" for="inputPhone">Điện thoại di dộng</label>
                                    <input class="form-control" id="Phone" name="Phone" type="tel" placeholder="Nhập điện thoại di dộng" value="${user.getPhone()}">                                                        
                                </div>
                                <div class="mb-3">
                                    <!-- Form Group (phone number)-->                                
                                    <label class="small mb-1" for="inputAddress">Điạ chỉ</label>
                                    <input class="form-control" id="Address" name="Address" type="text" placeholder="Nhập địa chỉ" value="${user.getAddress()}">                                                        
                                </div>
                                <div class="mb-3">
                                    <!-- Form Group (phone number)-->                                
                                    <label class="small mb-1" for="inputPosition">Chức danh</label>
                                    <input class="form-control" id="Position" name="Position" type="text" placeholder="Nhập chức danh" value="${user.getPosition()}">                                                        
                                </div>
                                <div class="mb-3">
                                    <!-- Form Group (phone number)-->                                
                                    <label class="small mb-1" for="inputCompany">Công ty</label>
                                    <input class="form-control" id="Company" name="Company" type="text" placeholder="Nhập công ty" value="${user.getCompany()}">                                                        
                                </div>
                                <div>
                                    <p class="${messageType}">${message}</p>
                                </div>
                                <!-- Save changes button-->
                                <button class="btn btn-primary" type="submit">Xác nhận thay đổi</button>
                            </form>
                        </div>
                    </div>
                </div>

                </body>
                <script>
                    var mess = '${message}'
                    if (mess != '') {
                        alert(mess);
                    }
                </script>
                </html>