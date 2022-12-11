<%-- 
    Document   : QuestionDetails
    Created on : Dec 7, 2022, 5:43:34 PM
    Author     : PHANH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="layoutAuthentication">
            <div id="layoutAuthentication_content">
                <main>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-7">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header"><h3 class="text-center font-weight-light my-4">Question Details</h3></div>
                                    <div class="card-body">
                                        <form action="QuestionDetail" method="post">
                                            <<div class="row mb-2">
                                                <div class="col-md-12">
                                                    <label for="lesson_id" class="form-label">Lesson</label>
                                                    <input type="text" class="form-control" id="lesson_id" name="lesson_id" value="${question.getLesson_id()}" required>
                                                </div>
                                                <div class="col-md-12">
                                                    <label for="content" class="form-label">Question</label>
                                                    <input type="text" class="form-control" id="subject-code" name="content" value="${question.getContent}" required>
                                                </div>
                                                <div class="col-md-12">
                                                    <label>Option 1</label>
                                                    <input name="op1" type="text" class="form-control" required>
                                                </div>
                                                <div class="col-md-12">
                                                    <label>Option 2</label>
                                                    <input name="op2" type="text" class="form-control" required>
                                                </div>
                                                <div class="col-md-12">
                                                    <label>Option 3</label>
                                                    <input name="op3" type="text" class="form-control" required>>
                                                </div>
                                                <div class="col-md-12">
                                                    <<label>Option 4</label>
                                                    <input name="op4" type="text" class="form-control" required>
                                                </div>
                                                <div class="col-md-12">
                                                    <label for="subject-code" class="form-label">Correct Answer</label>
                                                    <label>Correct Answer:</label>
                                                    <input type="number" min="1" max="4" name="ca" class="form-control"
                                                           placeholder="Correct Answer" required />
                                                </div>
                                            </div>
                                            <div class="mt-4 mb-0">
                                                <div class="d-grid"> <input type="submit"class="btn btn-primary btn-block" value="Save"/>  </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
        </div>
    </body>
</html>
