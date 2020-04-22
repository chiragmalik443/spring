<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome Page Message is ${msg}</h1>
<form:form action="login3" method="post" modelAttribute="userModel">
<form:input path="userid" />
<form:input path="pwd" />
<form:button>Login</form:button>
</form:form>
<!-- <form action="login2" method="post" >
<input type="text" name="userid" placeholder="Type userid here">
<input type="password" name="pwd" placeholder="Type password here">
<button>Login</button>
</form> -->
</body>
</html>