<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, th, tr {
	border: 1px;
	background-color: #44b008;
}

td {
	background-color: #dbc618;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div
		style="background-color: orange; margin-left: 0px; margin-right: 1210px;">
		<h3>
			<a href="create_student">create student</a>
		</h3>
	</div>

	<form:form method="post" modelAttribute="searchobj"
		action="search_student" commandName="searchobj">

		<br>
		<td align="right"><form:input path="studentName"
				placeholder="student Name" /></td>

		<tr align="left"></tr>
		<td align="left"><input type="submit" value="search">
	</form:form>
	<h1
		style="background-color: #83c4c4; text-align: center; margin-left: 500px; margin-right: 500px;">View
		Students</h1>
	<table style="width: 100%;">


		<tr>
			<th>StudentName</th>
			<th>Gmail</th>
			<th>StudentAddress</td>
			<th>Date of Birth</td>
			<th>College</td>
			<th>Department</td>
			<th>MobileNumber</td>
			<th>City</td>
			<th>State</td>
			<th>Edit</td>
			<th>Delete</td>
		</tr>

		<c:forEach items="${studentlistobj}" var="student">
			<tr>
				<td>${student.studentName}</td>
				<td>${student.gmailAddress}</td>
				<td>${student.studentAddress}</td>
				<td>${student.dob}</td>
				<td>${student.college}</td>
				<td>${student.department}</td>
				<td>${student.mobileNumber}</td>
				<td>${student.city}</td>
				<td>${student.state}</td>
				<td><a href="edit_student?id=${student.studentloginId}">Edit</a></td>
				<td><a href="delete_student?id=${student.studentloginId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>