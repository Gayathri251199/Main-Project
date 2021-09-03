<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<div>
	<h2
		style="background-color: orange; text-align: center; margin-left: 500px; margin-right: 450px; font-style: italic; font-family: fantasy;">Login</h2>
</div>
<div style="background-color: green;">
<h3>${sucessmsg}</h3>
</div>
<div style="background-color: red;">
<h3>${errormsg}</h3>
</div>
<body>
	<br>
	<br>
	<table border="0" align="center" width=100%
		style="background-color: #ce6a1294; width: 400px; border: 15px; padding: 30px; margin-right: 500px; margin-left: 500px; margin-top: 10px; margin-bottom: 10px;">
		<form:form action="login" method="post" modelAttribute="loginobj"
			commandName="loginobj">

			<tr>
				<td align="right">Email</td>
				<td align="left"><form:input path="emailAddrees"
						placeholder="Email" /></td>
			</tr>

			<tr>
				<td align="right">Password</td>
				<td align="left"><form:input type="password" path="password"
						placeholder="Password" /></td>
			</tr>
			
			<tr>
				<td align="right">StudentName</td>
				<td align="left"><form:input path="studentName"
						placeholder="StudentName" /></td>
			</tr>

			<tr>
				<td align="right"></td>
				<td align="left"><input type="submit" value="Login" /></td>
				<td>&nbsp;</td>
				<td align="center">&nbsp;</td>
			</tr>

		</form:form>
	</table>
</body>
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
<br>
<br>
<br>
<jsp:include page="footer.jsp"></jsp:include>
</html>