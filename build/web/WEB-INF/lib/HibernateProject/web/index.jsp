<%-- 
    Document   : index
    Created on : 07-Apr-2020, 4:06:48 pm
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
    <%@include file="upperMaterial.jsp" %>
    <body>
        <%@include file="navbar.jsp" %>

        <div class="container text-center my-5" >
            <div class="card">
                <img src="image/download.png" style="height: 600px "class="card-img-top" alt="...">
                <div class="card-body">
                    
                    <a href="postNote.jsp" class="btn btn-primary">StartPosting</a>
                </div>
            </div>
        </div>
        <%@include file="lowerMaterial.jsp" %> 
    </body>
</html>