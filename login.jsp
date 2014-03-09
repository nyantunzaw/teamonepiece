<%-- 
    Document   : login
    Created on : Mar 9, 2014, 12:10:15 PM
    Author     : Nyan Tun Zaw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!Doctype html>
    <head>
            <title>Bootstrap</title>
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link href="css/custombootstrap.css" rel="stylesheet">
            <link href="css/jumbotron-narrow.css" rel="stylesheet">
    </head>

    <body padding-bottom:55px;>
          <%
              String errorMsg = request.getParameter("error");
              
              %>
            <div class="navbar navbar-custom navbar-static-top">
                    <div class="container">
                            <div class="navbar-brand">
                                    <font color="white"> Welcome </font>
                            <!--	<img src="img/hugh.jpg" size="30px">-->
                            </div>
                            <!--
                            The below button is only supposed to work when the window is resized
                            -->
                            <button class = "navbar-toggle" data-toggle = "collapse" data-target = ".navHeaderCollapse">
                                    <!--
                                    This adds the three horizontal lines on a collapsible menu
                                    -->
                                    <span class = "icon-bar"></span>
                <span class = "icon-bar"></span>
                <span class = "icon-bar"></span>
                            </button> 

                            <div class="collapse navbar-collapse navHeaderCollapse">


                                    <!--Below code is needed only for IDP -->


                                    <u1 class="nav navbar-nav navbar-right">
                                            <li class="active">
                                                    <a href="#"> Sign In </a>
                                            </li>
                                    </u1>

                            </div>
                    </div>
            </div>

            <div class="container">
                    <div class="jumbotronChibi">
                            <h1>
                                    <div class="text-center">
                                            <img src="img/bplogo.jpg" width="24.750" height="30"> &nbsp;
                                            BP Employee Training Portal 
                                            <p><font size=2>

                                            </font></p>
                                    </div>
                            </h1>
                    </div>
            </div>
           
            <div class="container-fluid">
                    <div class="row-fluid">
                            <!-- if you want a larger column then write lg instead of md-->
                            <div class="col-md-3">

                                    <br/>
                                    <br/>
                                    <!--<p>babi ne podadi marvi che ne etle xD</p>-->
                                    <!--<button class="btn btn-primary">Noan Ne Lafo Marva Click Here xD</button>-->
                            </div>
                            <div class="col-md-4">
                                     <br/>
                                     <br/>
                                     <br/>
                                     <div class="container-fluid">
                                         <div class="text-right">
                                             <%
                                                if (errorMsg!=null){ %>
                                                <h4 style="color:red">Invalid UserID/Password!</h4>
                                             <%   }
                                             %>
                                         </div>
                                         <br/>
                                         <br/>
                                        <form action="loginRedirector" method="post">
                                            <div class="text-right">User ID:  <input type="text" name="username"></div>
                                            <br/>
                                            <br/>
                                            <div class="text-right">Password:  <input type="password" name="password"></div>
                                            <br/>
                                            <br/>
                                            <div class="text-right"> <button class="btn btn-primaryCustom" type="submit">Login</button> </div>
                                        </form>
                                    </div>
                            </div>
                    </div>
            </div>


            <script src="http://code.jquery.com/jquery-1.10.2.min.js"> </script>
            <script src="js/bootstrap.js"> </script>

    </body>
</html>
