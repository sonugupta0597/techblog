<%-- 
    Document   : postNote
    Created on : 07-Apr-2020, 4:21:58 pm
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <%@include file="upperMaterial.jsp" %>
    <body>
        <%@include file="navbar.jsp" %>
        
        
        <form class="container my-5" action="addPost">
            <h1 class="my-5">POST YOUR NOTE HERE </h1>
            <div class="form-group">
                <label for="exampleInputEmail1"><b>Note tittle</b></label>
                <input required type="text" name="tittle" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1"><b>Note content</b></label>
                <textarea required name="content" style="height:200px;text-align: center" class="form-control" id="exampleInputPassword1"></textarea>
            </div>
            <div class="container text-center">
            <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
        <%@include file="lowerMaterial.jsp" %> 
    </body>
</html>
