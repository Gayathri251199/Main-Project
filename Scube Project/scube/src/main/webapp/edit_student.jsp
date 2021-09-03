<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<body>
	<h2 style="text-align: center;background-color: #83c4c4;">Edit Student</h2>
	<table border="0" align="center" width=100%
		style="background-color: #ce6a1294; width: 400px; border: 15px; padding: 30px; margin-right: 500px; margin-left: 500px; margin-top: 10px; margin-bottom: 10px;">
		<form:form action="edit_student" method="post"
			modelAttribute="editobj" commandName="editobj">
			<tr>
			<td align="right">StudentName</td>
			<td align="left"><form:input path="studentName" placeholder="StudentName" /></td>
			</tr>
			<tr>
			<td align="right">Gmail</td>
			<td align="left"><form:input path="gmailAddress" placeholder="gmailAddress" /></td>
			</tr>
			<tr>
			<td align="right">StudentAddress</td>
			<td><form:input path="studentAddress" placeholder="StudentAddress" /></td>
			<tr>
			<td align="right">MobileNumber</td>
			<td><form:input path="mobileNumber" placeholder="MobileNumber" /></td>
			<tr>
			<td align="right">DOB</td>
			<td align="left"><form:input path="dob" placeholder="Date of Birth" /></td>
			</tr>
			<tr>
			<td align="right">College</td>
			<td align="left"><form:input path="college" placeholder="College" /></td>
			</tr>
			<tr>
			<td align="right">Department</td>
			<td align="left"><form:input path="department" placeholder="Department" /><td>
			</tr>
			<tr>
			<td align="right">City</td>
			<td align="left"><form:input path="city" placeholder="City" /></td>
			</tr>
			<tr>
			<td align="right">State</td>
			<td align="left"><form:input path="state" placeholder="State" /></td>
			</tr>
			<form:hidden path="studentloginId"/>
			<tr>
			<td align="right"></td>
			<td align="left"><input type="submit" value="update"></td>
			</tr>
		</form:form>
	</table>
</body>
<br>
<br>
<br>
<br>
<br>
<jsp:include page="footer.jsp"></jsp:include>
</html>