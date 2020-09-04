<%-- 
    Document   : shownotes
    Created on : 07-Apr-2020, 5:24:57 pm
    Author     : pc
--%>

<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="org.hibernate.Query"%>
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

            SessionFactory factory = SessionFactoryObject.getSessionFactoryObject();

            Session s = factory.openSession();

            Query q = s.createQuery("from NoteMaker");

            List<NoteMaker> l = q.list();

            for (NoteMaker n : l) {
        %>
        <div class="container text-center">
            
            <div style="align-items: center"class="card my-5 ">
            <img src="image/download.png" style="height:50px;width: 50px;" class="card-img-top my-4" alt="...">
            <div class="card-body ">
                <h5 class="card-title my-2"><% out.print(n.getTittle()); %></h5>
                <p class="card-text"><% out.print(n.getContent()); %></p>
                
                <a href="deleteServlet?id=<%= n.getId() %>" class="btn btn-danger my-2">delete</a>
                <a href="updatePosts.jsp?id=<%= n.getId() %>" class="btn btn-primary my-2">update</a>
            </div>
        </div>
        </div>
        <%
            }
        %>
        <%@include file="lowerMaterial.jsp" %> 
    </body>
</html>
