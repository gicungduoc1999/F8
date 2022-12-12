<%-- 
    Document   : AddQuestion
    Created on : Dec 7, 2022, 8:43:42 PM
    Author     : PHANH
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%--<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Add Question</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
              type="application/rss+xml" title="RSS">
    </head>
    <body>
        <div class="container-xl px-4 mt-4">
            <div class="card mb-4">
                <form action="AddQuestionController" method="POST" >
                    <h2> Add Question </h2>
                    <div class="card-body">
                        <div id="cont" class="container-fluid">
                            <div class="mb-3">
                                <label class="small mb-1" for="question">Question</label>
                                <input class="form-control" id="content" name="content" type="text" placeholder="Enter Question" value="">
                            </div>
                            <div style="height: 40px;margin-bottom: 10px">
                                <label style="font-size: 24px">Course: </label>
                                <select name="couse" style="font-size: 17px;padding: 4px">
                                    <c:forEach items="${listCouseName}" var="couseName">
                                        <option  value="${couseName}">${couseName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div style="height: 40px;margin-bottom: 10px">
                                <label style="font-size: 24px">Lesson: </label>
                                <select name="lesson" style="font-size: 17px;padding: 4px">
                                    <c:forEach items="${listLesstion}" var="lesson">
                                        <option  value="${lesson.title}">${lesson.title}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Explanation</label>
                                <input name="explanation" type="text" class="form-control" required>
                            </div>
                            <div class="row">
                                <div class="btn_add">
                                    <input type="button" id="btnTextBox" class="btn btn-primary" onclick="createTextBox()"
                                           value="Add More" /> <!-- input tag for add textbox button -->
                                </div>
                            </div>
                            <input type="text" name="countText" hidden="" id="countText" value="1" >
                            <div id="1" class="row row_textbox">
                                <div class="container-textbox">
                                    <textarea id="txt1" class="textArea" type='text' name='txt1'></textarea>
                                    <!-- input tag for text feild -->
                                </div>
                                <div class="container-right">
                                    <input type="checkbox" name="ckb1" value="isTrue" class="checkmark"><BR>
                                    <input id="btn1" type="button" class="btn btn_delete btn-danger" name="btn1" value="Delete"
                                           onclick="deleteTextBox(this)" />
                                    <!-- input tag for delete text box as well as delete button -->
                                </div>
                            </div>
                            <div class="modal-footer">
                                <a href="ManagermentQuestion" class="btn btn-default">Cancel</a>
                                <input type="submit" class="btn btn-success" value="Add">
                            </div>
                        </div>
                </form>
                </body>
                <script>
                    function createTextBox() {
                        // this will return list of row inside count id
                        var count = document.getElementById("cont").getElementsByClassName("row");
                        // this will return last row div id
                        var length = count[count.length - 1].id;
                        length++;
                        //another div is created with row className
                        var row = document.createElement("div");
                        row.className = "row row_textbox";
                        // another div is created with col-md-2 class name
                        var col = document.createElement("div");

                        col.className = "container-textbox";
                        // assign increamented id to the div
                        row.setAttribute("id", length);

                        // create textbox
                        var textBox = document.createElement("textarea");
                        textBox.setAttribute("type", "text");
                        textBox.setAttribute("name", "txt" + length);
                        textBox.setAttribute("id", "txt" + length);
                        textBox.setAttribute("class", "textArea");


                        // append textbox into div
                        col.appendChild(textBox);
                        // textbox div append to the div className as row
                        row.appendChild(col);

                        var col3 = document.createElement("div");
                        col3.className = "";
                        var checkboxTrue = document.createElement("input");
                        checkboxTrue.setAttribute("type", "checkbox");
                        checkboxTrue.setAttribute("name", "ckb" + length);
                        checkboxTrue.setAttribute("value", "isTrue");
                        checkboxTrue.setAttribute("class", "checkmark");
                        checkboxTrue.setAttribute("id", "istrue" + length);
                        // delBtn.setAttribute("onclick", "deleteTextBox(this)");
                        col3.appendChild(checkboxTrue);
                        row.appendChild(col3);

                        // another div for delete button
                        var col2 = document.createElement("div");
                        col2.className = "container-right";

                        // delete button is created
                        var delBtn = document.createElement("input");
                        delBtn.setAttribute("type", "button");
                        delBtn.setAttribute("name", "btn" + length);
                        delBtn.setAttribute("value", "Delete");
                        delBtn.setAttribute("class", "btn  btn_delete btn-danger");
                        delBtn.setAttribute("id", "btn" + length);
                        delBtn.setAttribute("onclick", "deleteTextBox(this)");

                        // append delete button into div

                        col2.appendChild(delBtn);
                        // delete div append to the div classname as row
                        row.appendChild(col2);

                        // entire row is appended to the div id as cont 
                        document.getElementById("cont").appendChild(row);

                        var inputCountText = document.getElementById("countText");
                        inputCountText.value = Number(inputCountText.value) + 1;

                    }

                    function deleteTextBox(txtName) {
                        // will return the length of div tag which class name is row
                        var count = document.getElementById("cont").getElementsByClassName("row");
                        var length = count.length - 1;
                        // this will store the id of delete button
                        var strBtn = txtName.id;

                        if (length == 0) {
                            document.getElementById(strBtn).remove();
                            document.getElementById(strBtn.replace("btn", "")).remove();
                        } else {
                            document.getElementById(strBtn.replace("btn", "")).remove();
                        }
                        var inputCountText = document.getElementById("countText");
                        inputCountText.value = Number(inputCountText.value) - 1;
                    }
                </script>
                <script>
                            var mess = '${mess}'
                            if (mess != '') {
                                alert(mess);
                            }

                </script>

                </html>