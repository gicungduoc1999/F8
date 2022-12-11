/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(".delete").click(function (event) {
        var $row = $(this).closest("tr");
        var $id = $row.find(".id").text();
        var $name = $row.find(".name").text();

        // var id = $("#empID").val();
        $("#user_id").val($.trim($id));
        
        var str = "Are you sure to delete (EmployeeID:  " + $id + " - " + "Name: " + $name + ")?";
        $("#modal_body").html(str);
    });


