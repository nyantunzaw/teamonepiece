<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");

	if(username.equalsIgnoreCase("trainer")){
		response.sendRedirect("trainerViewModule.html");
	}
	else{
		response.sendRedirect("traineeViewModule.html");
	}

%>
