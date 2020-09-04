
<%@page import="com.tech.blog.entities.Post"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<%@page import="java.util.List"%>
<%@page import="com.tech.blog.entities.Category"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.dao.CategoryDao"%>
<%@page import="com.tech.blog.entities.Message"%>
<%@page import="com.tech.blog.entities.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>profile Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="css/myStyleSheet.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    </head>
    <body>
        <!--nav-start-->
        <nav class="navbar navbar-expand-lg navbar-dark primary-background">
            <a class="navbar-brand" href="index.jsp"><span class="fa fa-envelope-o"> </span> Bloging System</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Courses
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"><span class="fa fa-phone fa-2x"> </span> Contact us</a>
                    </li>
                    
                    
                    <li class="nav-item">
                        <a class="nav-link" href="#" data-toggle="modal" data-target="#addpost"><span class="fa fa-phone fa-2x"> </span> AddPost </a>
                    </li>

                </ul>
                <ul class="navbar-nav mr-right">

                    <li class="nav-item">
                        <a class="nav-link" href="" data-toggle="modal" data-target="#exampleModal" id="user_name" ><span class="fa fa-user-circle fa-2x"> </span><% if (session.getAttribute("currentSession") != null) {%><%= ((User) session.getAttribute("currentSession")).getName()%><%} else
                                response.sendRedirect("index.jsp");%></a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="LogoutServlet"><span class="fa fa-user-plus fa-2x"> </span> Logout </a>
                    </li>
                </ul>
            </div>
        </nav>
        <!--nav-end-->
        
              <%
                                            Message m = (Message) session.getAttribute("msg");
                                            if (m != null) {
                                        %>
                                        <div class="alert <%= m.getCssType() %>" role="alert">
                                            <%= m.getMessage() %>
                                        </div>
                                        <%
                                            }
                                            session.removeAttribute("msg");
                                        %>
        <!--profile body start -->
        
            <div class="row ">
                 
                <div class="col-md-2">
                    <ul class="list-group">
                        <a href="ShowServlet?value=<%= 0%>"><li class="list-group-item primary-background" style="border-radius:0%">All Posts</li></a>
                    <%
               CategoryDao c1=new CategoryDao(ConnectionProvider.getConnection());
               
               List<Category> ll=c1.getCategoryList();
               
               int t=0;
               while(t!=ll.size()){
                     
               Category category=ll.get(t);
               
                t++;
                

          %>
                        <a href="ShowServlet?value=<%= category.getcId() %>" style="decoration:none"><li class="list-group-item"><%= category.getcName() %></li></a>
          <% } %>
                     
                     </ul>
                </div>
                
                <div class="col-md-10 mt-5">
                    <div class="container text-center" id="oneId">
                    <i class="fa fa-refresh fa-5x fa-spin text-center" aria-hidden="true" ></i>
                    <h1>Loading..</h1>
                    </div>
                    <%
                        if(session.getAttribute("selectNow")==null){
                         PostDao pdao=new PostDao(ConnectionProvider.getConnection());
                         List<Post> u=pdao.getAllPost();
                         if(u!=null)
                         {
                    %>     
                    
                       <script>
                           $('#oneId').hide();
                       </script>
                    <div class="container text-center">
                        
                        <h1 class="mt-4"><%= u.get(0) %></h1>
                    </div>
                    <%
                        } }
                    %>
                    
                    <%
                        if(session.getAttribute("selectNow")!=null){
                         PostDao pdao=new PostDao(ConnectionProvider.getConnection());
                         int c_id=Integer.parseInt(session.getAttribute("selectNow").toString());
                         List<Post> u=pdao.getAllPostByCategory(c_id);
                         if(u.size()!=0)
                         {
                       %>
                       <script>
                           $('#oneId').hide();
                       </script>
                       <div class="card" style="width: 18rem;">
                        <img class="card-img-top" src="..." alt="Card image cap">
                        <div class="card-body">
                         <h5 class="card-title">Card title</h5>
                         <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                         <a href="#" class="btn btn-primary">Go somewhere</a>
                         </div>
                         </div>
                       
                    <%
                        }}
                    %>
                </div>
                
            </div>
        
        <!--profile body end-->
        <!--modal-started-->



        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header primary-background text-white">
                        <h5 class="modal-title" id="exampleModalLabel">tech blog</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="container text-center">
                        <% if (session.getAttribute("currentSession") != null) {
                                User user = (User) session.getAttribute("currentSession");
                        %>
                        <img src="pics/<%= user.getProfile()%>" class="img-fluid" style="border-radius: 50%">
                        
                    </div>
                    
                    <!--modal-header-end-->
                    
                    <!--modal-body-start-->
                    <!--show-modal-start-->
                    <div class="modal-body text-center" id="show-modal">
                        <table class="table">
                            
                            <tbody>
                                <tr>
                                    <td><h6>user_id<h6></td>
                                    <td><%= user.getId()  %></td>
                                </tr>
                                <tr>
                                    <td><h6>UserName<h6></td>
                                    <td><%= user.getName()  %></td>
                                </tr>
                                <tr>
                                    <td><h6>Email<h6></td>
                                    <td><%= user.getEmail()  %></td>
                                </tr>
                                <tr>
                                    <td><h6>Password<h6></td>
                                    <td><%= user.getPassword() %></td>
                                </tr>
                                <tr>
                                    <td><h6>Gender<h6></td>
                                    <td><%= user.getGender().toUpperCase()  %></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                                <!--show-modal-end-->
                                <!--edit-modal-start-->
                                <form action="UpdateServlet" method="post" enctype="multipart/form-data">
                                <div id="edit-modal" class="modal-body text-center" style="display: none">
                                   <table class="table" >
                            
                            <tbody>
                                <tr>
                                    <td><h6>user_id<h6></td>
                                    <td><%= user.getId()  %></td>
                                </tr>
                                <tr>
                                    <td><h6>UserName<h6></td>
                                                <td><input type="text" class="form-control" name="user_name" value="<%= user.getName()  %>"></td>
                                </tr>
                                <tr>
                                    <td><h6>Email<h6></td>
                                    <td><input type="text" name="user_email" class="form-control" value="<%= user.getEmail()  %>"></td>
                                </tr>
                                <tr>
                                    <td><h6>Password<h6></td>
                                    <td><input type="password" name="user_password" class="form-control" value="<%= user.getPassword() %>"></td>
                                </tr>
                                <tr>
                                    <td><h6>Gender<h6></td>
                                    <td><%= user.getGender().toUpperCase()  %></td>
                                </tr>
                                <tr>
                                    <td><h6>about<h6></td>
                                                <td><textarea name="about" class="form-control" row="3" value="<%= user.getGender().toUpperCase()  %>"></textarea></td>
                                </tr>
                                
                                <tr>
                                    <td><h6>New Profile<h6></td>
                                    <td><input type="file"  name="user_profile"></td>
                                </tr>
                                <tr>
                                <div class="container align-items-center">
                                    <td><button type="submit" class="btn-lg primary-background text-white">Save</button></td>
                                </div>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                                </form>
                                <!--edit-modal-end-->
                    <!--modal-body-end-->
                    
                    <!--modal-footer-start-->
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn primary-background" id="edit"> Edit </button>
                    </div>
                    <!--modal-footer-end-->
                </div>
            </div>
        </div>
        <!--modal-delete-->
        
            <!--add-post-modal-->
            <!-- Button trigger modal -->


<!-- Modal -->
<div class="modal fade" id="addpost" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header primary-background text-center" >
        <h5 class="modal-title" id="exampleModalLabel">Add New Post Here </h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
        
        <!--add post modal body-->
      <div class="modal-body">
          <form action="PostServlet" method="post" enctype="multipart/form-data">
      
      
  <div class="form-group">
      <select class="form-control" name="category_id">
          <option>Select-categary</option>
          <%
               CategoryDao c=new CategoryDao(ConnectionProvider.getConnection());
               out.print(c);
               List<Category> l=c.getCategoryList();
               out.print(l);
               int i=0;
               while(i!=l.size()){
                     
               Category category=l.get(i);
               out.print(category);
                i++;
                

          %>
          <option value="<%= category.getcId() %>"><%= category.getcName() %> </option>
          <% } %>
      </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Enter your Post Tittle </label>
    <input type="text" name="post_tittle" class="form-control" id="exampleFormControlInput1" >
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect1">Enter your Post Content </label>
    <textarea class="form-control" name="post_content" id="exampleFormControlTextarea1" rows="3"></textarea>
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect2">Enter your Post Code</label>
    <textarea class="form-control" name="post_code" id="exampleFormControlTextarea1" rows="3"></textarea>
  </div>
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Select Photo for your Post </label>
    <br>
    <input type="file" name="post_image">
  </div>
      <button type="submit" class="btn btn-secondary primary-background"  id="postSubmit">AddPost</button>
</form>
      </div>
        
        <!--end add post modal body-->
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        
      </div>
    </div>
  </div>
</div>
            <!--end-add-post-modal-->
        <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous"></script>
        
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
                    $(document).ready(function(){
                        let f=false;
                          $('#edit').click(function(){
                              
                              if(f===false){
                                    $('#show-modal').hide();
                                    $('#edit-modal').show();
                                    $(this).text("Back");
                                    f=true;
                              }
                              else{
                                  
                                    $('#show-modal').show();
                                    $('#edit-modal').hide();
                                    $(this).text("edit");
                                    f=false;
                              }
                          });
                          
                    });
        </script>
    </body>
    <% } %>
</html>
