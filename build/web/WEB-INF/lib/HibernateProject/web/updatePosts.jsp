<%-- 
    Document   : postNote
    Created on : 07-Apr-2020, 4:21:58 pm
    Author     : pc
--%>

<%@page import="Bean.NoteMaker"%>
<%@page import="org.hibernate.Session"%>
<%@page import="HelpingClass.SessionFactoryObject"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <%@include file="upperMaterial.jsp" %>
    <body>
        <%@include file="navbar.jsp" %>
        
        <% 
              int  id=Integer.parseInt(request.getParameter("id"));
        SessionFactory factory=SessionFactoryObject.getSessionFactoryObject();
        
        
        Session s=factory.openSession();
        
        NoteMaker n=s.get(NoteMaker.class,id);
        
        %>
        
        <form class="container my-5" action="update_Servlet">
            <h1 class="my-5">Edit Post</h1>
            
            <input type="hidden" name="id" value="<%= n.getId() %>" >
            <div class="form-group">
                <label for="exampleInputEmail1"><b>Note tittle</b></label>
                <input required type="text" name="tittle" value="<%= n.getTittle() %>" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1"><b>Note content</b></label>
                <textarea required name="content" style="height:200px;text-align: center"  class="form-control" id="exampleInputPassword1"><%= n.getContent() %></textarea>
            </div>
            <div class="container text-center">
            <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
        <%@include file="lowerMaterial.jsp" %> 
    </body>
</html>
