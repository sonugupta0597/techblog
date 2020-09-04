<%-- 
    Document   : login
    Created on : 10-Mar-2020, 1:01:31 am
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="css/myStyleSheet.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <%@include file="navbar.jsp" %>
        <main class="d-flex align-items-center primary-background" style="padding-bottom: 80px ;padding-top: 20px">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 offset-3">
                        <div class="card">
                            <div class="card-header primary-background text-white text-center"><span class="fa fa-user-plus fa-3x "></span><h2>Register here<h2></div>
                                        <div class="card-body">
                                            <form id="reg-form" action="RegistrationServlet" method="post">

                                                <div class="form-group">
                                                    <label for="username">username</label>
                                                    <input type="text" name="user_name" class="form-control" id="user_name" placeholder="Enter username">

                                                </div>
                                                <div class="form-group">
                                                    <label for="exampleInputEmail1">Email address</label>
                                                    <input type="email" name="user_email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                                </div>
                                                <div class="form-group">
                                                    <label for="exampleInputPassword1">Password</label>
                                                    <input type="password" name="user_password" class="form-control" id="password" placeholder="Password">
                                                </div>

                                                <div class="form-group">
                                                    <label for="select gender" >Select Gender</label>
                                                    <br>
                                                    <input type="radio" id="gender" name="user_gender" value="male"> Male
                                                    <input type="radio" id="gender" name="user_gender" value="female"> Female

                                                </div>
                                                <div class="form-group">
                                                    <label for="about">discribe yourself</label>
                                                    <textarea name="about" class="form-control" rows="5" placeholder="write about something yourself"></textarea>

                                                </div>
                                                <div class="form-check">
                                                    <input type="checkbox" name="check" value="on" class="form-check-input" id="exampleCheck1">
                                                    <label class="form-check-label" for="exampleCheck1">i agree terms and conditions</label>
                                                </div>
                                                <br>
                                                <button type="submit" class="btn btn-primary">Submit</button>
                                            </form>
                                        </div>
                                        </div>
                                        </div>
                                        </div>
                                        </div>
                                        </main>


                                        <script
                                            src="https://code.jquery.com/jquery-3.4.1.min.js"
                                            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
                                        crossorigin="anonymous"></script>
                                        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
                                        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
                                        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
                                        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
                                        
                                        </body>
                                        </html>
