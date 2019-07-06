<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- <div>Seja Bem-vindo.</div> -->
	
	<div align="center">
		<form action="primeiroServlet" method="post">
			Login: <input type="text" id="login" name="login"/>
			Senha: <input type="text" id="senha" name="senha"/>
			
			<input type="submit" id="Enviar" name="enviar"/>
		</form>
	</div>
</body>
</html>