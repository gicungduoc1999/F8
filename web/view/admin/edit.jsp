<%-- 
    Document   : dashboard
    Created on : Dec 3, 2022, 9:42:22 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en" dir="ltr">

    <head>
        <meta charset="utf-8" />
        <title>Doctris - Doctor Appointment Booking System</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Premium Bootstrap 5 Landing Page Template" />
        <meta name="keywords" content="Appointment, Booking, System, Dashboard, Health" />
        <meta name="author" content="Shreethemes" />
        <meta name="email" content="support@shreethemes.in" />
        <meta name="website" content="https://shreethemes.in" />
        <meta name="Version" content="v1.4.0" />

        <!-- favicon -->
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
        <style>
            .pagination {
                display: inline-block;
            }

            .pagination a {
                color: black;
                float: left;
                padding: 8px 16px;
                text-decoration: none;
            }

            .pagination a.active {
                background-color: #4CAF50;
                color: white;
                border-radius: 5px;
            }

            .pagination a:hover:not(.active) {
                background-color: #ddd;
                border-radius: 5px;
            }
            body {font-family: Arial, Helvetica, sans-serif;}

            /* The Modal (background) */
            .modal {
                display: none; /* Hidden by default */
                position: fixed; /* Stay in place */
                z-index: 1; /* Sit on top */
                padding-top: 50px; /* Location of the box */
                left: 0;
                top: 0;
                width: 100%; /* Full width */
                height: 100%; /* Full height */
                overflow: auto; /* Enable scroll if needed */
                background-color: rgb(0,0,0); /* Fallback color */
                background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
            }

            /* Modal Content */
            .modal-content {
                background-color: #fefefe;
                margin: auto;
                padding: 20px;
                border: 1px solid #888;
                width: 80%;
            }

            /* The Close Button */
            .close {
                color: #aaaaaa;
                float: right;
                font-size: 28px;
                font-weight: bold;
            }

            .close:hover,
            .close:focus {
                color: #000;
                text-decoration: none;
                cursor: pointer;
            }
        </style>
    <body>
        <!-- Loader -->
        <!-- <div id="preloader">
            <div id="status">
                <div class="spinner">
                    <div class="double-bounce1"></div>
                    <div class="double-bounce2"></div>
                </div>
            </div>
        </div> -->
        <!-- Loader -->

        <div class="page-wrapper doctris-theme toggled">
            <!-- sidebar-wrapper -->
            <jsp:include page="common/sidemenu.jsp"/>

            <!-- sidebar-wrapper  -->
            <!-- sidebar-wrapper  -->

            <!-- Start Page Content -->
            <main class="page-content bg-light">

                <jsp:include page="common/header.jsp"/>


                <div class="container-fluid">
                    <div class="layout-specing">
                        <h5 class="mb-0">Course>Details</h5>
                        <br>
                        <form action="${pageContext.request.contextPath}/course/process" method="POST">
                            <input type="hidden" name="id" value="${data.getCourse_Id()}" />
                            <div class="form-group">
                                <label for="exampleInputEmail1">Course Name</label>
                                <input required type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Course name" name="name" value="${data.getCourse_Name()}">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Price</label>
                                <input required type="number" class="form-control" id="exampleInputPassword1" placeholder="Price" name="price" value="${data.getPrice()}">
                            </div>
                            <div class="form-group" style="margin-bottom: 10px">
                                <label for="exampleInputPassword1">Description</label>
                                <textarea  class="form-control" id="exampleInputPassword1" placeholder="Description" name="description">${data.getDes()}</textarea>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Chapter</label><br>
                                <table class="table table-bordered">
                                    <thead>
                                        <tr>
                                            <th scope="col" style="width: 20%">Content</th>
                                            <th>Lesson</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td style="width: 30%">aaaaaaaaaaaaaa</td>
                                            <td style="width: 70%">
                                                <table class="table table-bordered">
                                                    <thead>
                                                        <tr>
                                                            <th style="width: 20%">Title</th>
                                                            <th style="width: 15%">Type</th>
                                                            <th style="width: 15%">Status</th>
                                                            <th style="width: 25%">Question</th>
                                                            <th>Link Video</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <tr>
                                                            <td style="width: 20%">
                                                                OKKKKKKKKKKKK
                                                            </td>
                                                            <td>ok</td>
                                                            <td>ok</td>
                                                            <td><span style="color: #0D6EFD;cursor: pointer" id="myBtn">view</span></td>
                                                            <td>
                                                                <a href="#">
                                                                    go to
                                                                </a>
                                                            </td>
                                                        </tr>


                                                    </tbody>
                                                </table>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 30%">aaaaaaaaaaaaaa</td>
                                            <td style="width: 70%">
                                                <table class="table table-bordered">
                                                    <thead>
                                                        <tr>
                                                            <th style="width: 20%">Title</th>
                                                            <th style="width: 15%">Type</th>
                                                            <th style="width: 15%">Status</th>
                                                            <th style="width: 25%">Question</th>
                                                            <th>Link Video</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <tr>
                                                            <td style="width: 20%">
                                                                OKKKKKKKKKKKKKKKKKKKKKKKKKKKKK
                                                                
                                                            </td>
                                                            <td>ok</td>
                                                            <td>ok</td>
                                                            <td><span style="color: #0D6EFD;cursor: pointer" id="myBtn">view</span></td>
                                                            <td>
                                                                <a href="#">
                                                                    go to
                                                                </a>
                                                            </td>
                                                        </tr>


                                                    </tbody>
                                                </table>
                                            </td>
                                        </tr>


                                    </tbody>
                                </table>
                            </div>
                            <input type="hidden" value="edit" name="action"/>
                            <button type="submit" class="btn btn-primary">Save</button>
                            <a  class="btn btn-danger" href="javascript:void(0)" onclick="confirmDelete('${data.getCourse_Id()}')">Delete</a>
                            <a  class="btn btn-secondary" href="${pageContext.request.contextPath}/admin/course">Back</a>
                        </form>
                    </div>
                </div><!--end container-->
                <!-- The Modal -->
                <div id="myModal" class="modal">

                    <!-- Modal content -->
                    <div class="modal-content" style="width: 80%" id="model">
                        <span class="close">&times;</span>

                        <div class="form-group" id="c1_l1_1">
                            <label for="exampleFormControlTextarea1">Question 1:
                            </label>
                            <div class="form-control" id="exampleFormControlTextarea1" rows="2" readonly="">
                                aaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                a</div>
                        </div>
                        <button onclick="closeModel()" class="btn btn-secondary" style="margin: 10px 0px">Close</button>
                    </div>

                </div>

                <!-- Footer Start -->
                <footer class="bg-footer-color shadow py-3">
                    <div class="container-fluid">
                        <div class="row align-items-center">
                            <div class="col">
                                <div class="text-sm-start text-center">
                                    <p class="mb-0 text-muted"><script>document.write(new Date().getFullYear())</script> © F8. Design with <i class="mdi mdi-heart text-danger"></i> by <a href="https://shreethemes.in/" target="_blank" class="text-reset">Shreethemes</a>.</p>
                                </div>
                            </div><!--end col-->
                        </div><!--end row-->
                    </div><!--end container-->
                </footer><!--end footer-->
                <!-- End -->
            </main>
            <!--End page-content" -->
        </div>
        <!-- page-wrapper -->

        <!-- Offcanvas Start -->
        <div class="offcanvas offcanvas-end shadow border-0" tabindex="-1" id="offcanvasRight" aria-labelledby="offcanvasRightLabel">
            <div class="offcanvas-header p-4 border-bottom">
                <h5 id="offcanvasRightLabel" class="mb-0">
                    <img src="../assets/images/logo-dark.png" height="22" class="light-version" alt="">
                    <img src="../assets/images/logo-light.png" height="22" class="dark-version" alt="">
                </h5>
                <button type="button" class="btn-close d-flex align-items-center text-dark" data-bs-dismiss="offcanvas" aria-label="Close"><i class="uil uil-times fs-4"></i></button>
            </div>
            <div class="offcanvas-body p-4 px-md-5">
                <div class="row">
                    <div class="col-12">
                        <!-- Style switcher -->
                        <div id="style-switcher">
                            <div>
                                <ul class="text-center style-switcher list-unstyled mb-0">
                                    <li class="d-grid"><a href="javascript:void(0)" class="rtl-version t-rtl-light" onclick="setTheme('style-rtl')"><img src="../assets/images/layouts/light-dash-rtl.png" class="img-fluid rounded-md shadow-md d-block mx-auto" style="width: 240px;" alt=""><span class="text-dark fw-medium mt-3 d-block">RTL Version</span></a></li>
                                    <li class="d-grid"><a href="javascript:void(0)" class="ltr-version t-ltr-light" onclick="setTheme('style')"><img src="../assets/images/layouts/light-dash.png" class="img-fluid rounded-md shadow-md d-block mx-auto" style="width: 240px;" alt=""><span class="text-dark fw-medium mt-3 d-block">LTR Version</span></a></li>
                                    <li class="d-grid"><a href="javascript:void(0)" class="dark-rtl-version t-rtl-dark" onclick="setTheme('style-dark-rtl')"><img src="../assets/images/layouts/dark-dash-rtl.png" class="img-fluid rounded-md shadow-md d-block mx-auto" style="width: 240px;" alt=""><span class="text-dark fw-medium mt-3 d-block">RTL Version</span></a></li>
                                    <li class="d-grid"><a href="javascript:void(0)" class="dark-ltr-version t-ltr-dark" onclick="setTheme('style-dark')"><img src="../assets/images/layouts/dark-dash.png" class="img-fluid rounded-md shadow-md d-block mx-auto" style="width: 240px;" alt=""><span class="text-dark fw-medium mt-3 d-block">LTR Version</span></a></li>
                                    <li class="d-grid"><a href="javascript:void(0)" class="dark-version t-dark mt-4" onclick="setTheme('style-dark')"><img src="../assets/images/layouts/dark-dash.png" class="img-fluid rounded-md shadow-md d-block mx-auto" style="width: 240px;" alt=""><span class="text-dark fw-medium mt-3 d-block">Dark Version</span></a></li>
                                    <li class="d-grid"><a href="javascript:void(0)" class="light-version t-light mt-4" onclick="setTheme('style')"><img src="../assets/images/layouts/light-dash.png" class="img-fluid rounded-md shadow-md d-block mx-auto" style="width: 240px;" alt=""><span class="text-dark fw-medium mt-3 d-block">Light Version</span></a></li>
                                    <li class="d-grid"><a href="https://shreethemes.in/doctris/layouts/landing/index.html" target="_blank" class="mt-4"><img src="../assets/images/layouts/landing-light.png" class="img-fluid rounded-md shadow-md d-block mx-auto" style="width: 240px;" alt=""><span class="text-dark fw-medium mt-3 d-block">Landing Page</span></a></li>
                                </ul>
                            </div>
                        </div>
                        <!-- end Style switcher -->
                    </div><!--end col-->
                </div><!--end row-->
            </div>

            <div class="offcanvas-footer p-4 border-top text-center">
                <ul class="list-unstyled social-icon social mb-0">
                    <li class="list-inline-item mb-0"><a href="https://1.envato.market/doctris-template" target="_blank" class="rounded"><i class="uil uil-shopping-cart align-middle" title="Buy Now"></i></a></li>
                    <li class="list-inline-item mb-0"><a href="https://dribbble.com/shreethemes" target="_blank" class="rounded"><i class="uil uil-dribbble align-middle" title="dribbble"></i></a></li>
                    <li class="list-inline-item mb-0"><a href="https://www.behance.net/shreethemes" target="_blank" class="rounded"><i class="uil uil-behance align-middle" title="behance"></i></a></li>
                    <li class="list-inline-item mb-0"><a href="https://www.facebook.com/shreethemes" target="_blank" class="rounded"><i class="uil uil-facebook-f align-middle" title="facebook"></i></a></li>
                    <li class="list-inline-item mb-0"><a href="https://www.instagram.com/shreethemes/" target="_blank" class="rounded"><i class="uil uil-instagram align-middle" title="instagram"></i></a></li>
                    <li class="list-inline-item mb-0"><a href="https://twitter.com/shreethemes" target="_blank" class="rounded"><i class="uil uil-twitter align-middle" title="twitter"></i></a></li>
                    <li class="list-inline-item mb-0"><a href="mailto:support@shreethemes.in" class="rounded"><i class="uil uil-envelope align-middle" title="email"></i></a></li>
                    <li class="list-inline-item mb-0"><a href="https://shreethemes.in" target="_blank" class="rounded"><i class="uil uil-globe align-middle" title="website"></i></a></li>
                </ul><!--end icon-->
            </div>
        </div>

        <form id="form" action="${pageContext.request.contextPath}/admin/course" method="POST">
            <input type="hidden" name="orderBy" id="orderBy" value="${orderBy}"/>
            <input type="hidden" name="orderType" id="orderType" value="${orderType}"/>
            <input type="hidden" name="keyword" id="keyword" value="${keyword}"/>
            <input type="hidden" name="page" id="page"/>
        </form>
        <!-- Offcanvas End -->

        <!-- javascript -->
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
    <script>
                                        var modal = document.getElementById("myModal");

// Get the button that opens the modal
                                        var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
                                        var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal 
                                        btn.onclick = function () {
                                            modal.style.display = "block";
                                        }

// When the user clicks on <span> (x), close the modal
                                        span.onclick = function () {

                                            modal.style.display = "none";

                                        }




                                        function closeModel() {
                                            modal.style.display = "none";

                                        }
        <c:if test="${MESSAGE != null}">
                                        alert('${MESSAGE}')
        </c:if>
                                        function confirmDelete(id) {
                                            if (confirm("continue delete...?") === true) {
                                                window.location.href = '${pageContext.request.contextPath}/course/process?action=delete&id=' + id;
                                            }
                                        }
// When the user clicks anywhere outside of the modal, close it
//                                        window.onclick = function (event) {
//                                            if (event.target == modal) {
//                                                modal.style.display = "none";
//                                                
//                                                
//                                            }
//                                        }
    </script>
</html>
