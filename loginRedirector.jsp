<%-- 
    Document   : loginRedirector
    Created on : Mar 10, 2014, 2:37:20 PM
    Author     : appuj_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
        String userID = request.getParameter("username");
        if (userID.equals("trainer")){
            response.sendRedirect("trainerViewModule.html");
        }else if (userID.equals("trainee")){
            response.sendRedirect("traineeViewModuleP.html");
        }else{               
            response.sendRedirect("login.jsp?error=true");
        } 
        %>
    </head>
    <body>
        
    </body>
</html>
