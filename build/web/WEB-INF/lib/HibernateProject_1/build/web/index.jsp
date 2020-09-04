<%-- 
    Document   : index
    Created on : 07-Apr-2020, 4:06:48 pm
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <title>Hello, world!</title>
        <style>
            * {
                box-sizing: border-box;
            }

            #myInput {
                background-image: url('/css/searchicon.png');
                background-position: 10px 12px;
                background-repeat: no-repeat;
                width: 100%;
                font-size: 16px;
                padding: 12px 20px 12px 40px;
                border: 1px solid #ddd;
                margin-bottom: 12px;
            }

            #myUL {
                list-style-type: none;
                padding: 0;
                margin: 0;
            }

            #myUL li a {
                border: 1px solid #ddd;
                margin-top: -1px; /* Prevent double borders */
                background-color: #f6f6f6;
                padding: 12px;
                text-decoration: none;
                font-size: 18px;
                color: black;
                display: block
            }

            #myUL li a:hover:not(.header) {
                background-color: #eee;
            }

            .scroll{
                background-color: lightblue;

                overflow: scroll;
            }

            html, body {
                height: 100%;
                margin: 0;
            }

            .full-height {
                height: 100%;

            }

        </style>


    </head>
    <body>

        
        <div class="container-fluid full-height" >
            <div class="row " style="height: 100%" >
                <div class="col-3" style="background: red ; height: 100%">
                    <div class="row" style="height: 10%;">
                        <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">
                    </div>
                    <div class="scroll" style="height: 90%">
                        <ul id="myUL" >

                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4 ">Adele</a></li>
                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Agnes</a></li>

                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Billy</a></li>
                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Bob</a></li>

                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Calvin</a></li>
                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Christina</a></li>
                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Cindy</a></li>
                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4 ">Adele</a></li>
                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Agnes</a></li>

                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Billy</a></li>
                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Bob</a></li>

                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Calvin</a></li>
                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Christina</a></li>
                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Cindy</a></li>
                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4 ">Adele</a></li>
                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Agnes</a></li>

                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Billy</a></li>
                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Bob</a></li>

                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Calvin</a></li>
                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Christina</a></li>
                            <li><a href="#" style="margin-bottom: 5px;overflow:hidden;background:#7FFFD4">Cindy</a></li>
                        </ul>

                    </div>
                </div>

                <div class="col-9 " style="margin: 0px;padding: 0px; height: 100%" >
                    <div class="container-fluid row" style="height: 10%;background: #eee;align-items: center">

                        <img src="image/download.png" alt="Trulli" width="20%" height="100%" style="border-radius: 50%">
                        <label style="font-size: 20px;padding-left: 20px">online</label>
                    </div>
                    <div class="container-fluid row scroll" style="height: 77%;background: white">
                        
                        <ul style="list-style-type: none;" >

                            <li style="color: black">Adele</li>
                            <li style="color: #99ff99;font-size: 20px;">Agnes</li>

                            <li style="color: black">Billy</li>
                            <li style="color: #0080ff ;font-size: 20px;">Bob</li>

                            
                       </ul>
     
                    </div>
                    <div class="container-fluid row" style="height: 20%;background: white">
                        <div class="row" style="height: 100%;width:100%">
                            <form class="" style="height: 100%;width: 100%;display: flex;">
                                <textarea style="height: 50%;width: 80%;background: white;display: inline-block;" ></textarea>
                                <input type="submit" style="height: 50%;width: 20%;background:greenyellow;display: inline-block;border-radius: 20%" >
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script>
            function myFunction() {
                var input, filter, ul, li, a, i, txtValue;
                input = document.getElementById("myInput");
                filter = input.value.toUpperCase();
                ul = document.getElementById("myUL");
                li = ul.getElementsByTagName("li");
                for (i = 0; i < li.length; i++) {
                    a = li[i].getElementsByTagName("a")[0];
                    txtValue = a.textContent || a.innerText;
                    if (txtValue.toUpperCase().indexOf(filter) > -1) {
                        li[i].style.display = "";
                    } else {
                        li[i].style.display = "none";
                    }
                }
            }
        </script>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>