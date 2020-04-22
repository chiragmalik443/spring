<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
   <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.size{
width:52px;
height: 52px;
cursor: pointer;
}
</style>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
	<div class='container'>
		<h1 class='alert-info text-center'>Teacher Question CRUD Screen</h1>
		<h3 class='alert-success'>${param.msg}</h3>
		
		<form:form action="addquestion" method="post" modelAttribute="questionModel">
		<div class='form-group'>
		<label>Question</label>
		<form:textarea cols="10" rows="6" path="name" cssClass="form-control"/>
		</div>
		<div class='form-group'>
		<label>OptionA</label>
		<form:input path="optionA" cssClass="form-control"/>
		</div>
		<div class='form-group'>
		<label>OptionB</label>
		<form:input path="optionB" cssClass="form-control"/>
		</div>
		<div class='form-group'>
		<label>Right Answer</label>
		<form:input path="rans" cssClass="form-control"/>
		</div>
		<div class='form-group'>
		<label>Score</label>
		<form:input path="score" cssClass="form-control"/>
		</div>
		<div class='form-group'>
		
		<button type="submit" class="btn btn-primary">Add</button>
		<c:if test="${ updateflag =='E'}">
		<button type="submit" class="btn btn-success">Update</button>
		</c:if>
		</div>
		</form:form>
		<br/>
		<table class='table table-bordered'>
		<thead class='table-dark'>
		<tr>
		<th>Id</th>
		<th>Name</th>
		<th>OptionA</th>
		<th>OptionB</th>
		<th>Right Answer</th>
		<th>Score</th>
		<th>Operation</th>
		</tr>
		</thead>
		<tbody>
			<c:forEach items="${questions}" var="cq">
			<tr>
			<td>${cq.id}</td>
			<td>${cq.name}</td>
			<td>${cq.optionA}</td>
			<td>${cq.optionB}</td>
			<td>${cq.rans}</td>
			<td>${cq.score}</td>
			<td><a href="deletequestion?qid=${cq.id}"><img src='https://img.icons8.com/cotton/2x/delete-sign--v2.png' class='size'/></a>
			&nbsp;
			<a href="editquestion?qid=${cq.id}"><img src='https://img.icons8.com/cotton/2x/edit.png' class='size'/></a>
			</td>
			
			</tr>
			</c:forEach>
		</tbody>
		</table>
	</div>
</body>
</html>