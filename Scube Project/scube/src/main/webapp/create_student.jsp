<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: #9b2323;
	font-weight: bold;
}
</style>
</head>
<jsp:include page="header.jsp"></jsp:include>
<div>
	<h3>
		<a href="view_student" style="background-color: orange;">view
			student</a>
	</h3>
	<div
		style="background-color: orange; margin-left: 20px; margin-right: 1080px;">
		<h4>${errormessage}</h4>
	</div>
</div>
<div>
<h2 style="background-color: orange;text-align: center;margin-left: 500px;margin-right: 450px;font-family: fantasy;font-style: inherit;">Student</h2>
</div>
<body>
	<table border="0" align="center" width=100%
		style="background-color: #ce6a1294; width: 400px; border: 15px; padding: 30px; margin-right: 500px; margin-left: 500px; margin-top: 10px; margin-bottom: 10px;">
		<form:form action="create_student" method="post"
			modelAttribute="studentobj" commandName="studentobj">
			<%-- 			<tr>
				<td align="right"></td>
				<td align="left"><div
					style="background-color: green; margin-left: 20px; margin-right: 1080px;">
					<h2>${errormessage}</h2>
				</div></td>

			</tr> --%>
			<tr>
				<td align="right">StudentName</td>
				<td align='left'><form:input path="studentName"
						placeholder="StudentName" />
					<div>
						<form:errors path="studentName" cssClass="error" />
					</div></td>

			</tr>
			<br>

			<tr>
				<td align="right">UserName</td>
				<td align="left"><form:input path="gmailAddress"
						placeholder="UserName" /></td>
			</tr>

			<tr>
				<td align="right">Password</td>
				<td align="left"><form:input type="password" path="password"
						placeholder="password" /></td>
				<td align="right"><form:errors path="password" cssClass="error"></form:errors>
			</tr>

			<tr>
				<td align="right">Date of Birth</td>
				<td align="left"><form:input path="dob"
						placeholder="Date of Birth" /></td>
			</tr>

			<tr>
				<td align="right">College</td>
				<td align="left"><form:input path="college"
						placeholder="Colege" /></td>
			</tr>

			<tr>
				<td align="right">Department</td>
				<td align="left"><form:select path="department">
						<form:option value="MECH" label="MECH"></form:option>
						<form:option value="MCA" label="MCA"></form:option>
						<form:option value="MBA" label="MBA"></form:option>
						<form:option value="CIVIL" label="CIVIL"></form:option>
						<form:option value="ECE" label="ECE"></form:option>
						<form:option value="EEE" label="EEE"></form:option>
						<form:option value="M.SC.CS" label="M.SC.CS"></form:option>
						<form:option value="M.SC.IT" label="M.SC.IT"></form:option>
					</form:select></td>
			</tr>

			<tr>
				<td align="right">MobileNumber</td>
				<td align="left"><form:input path="mobileNumber"
						placeholder="MobileNumber" maxlength="10" /></td>
			</tr>

			<tr>
				<td align="right">StudentAddress</td>
				<td align="left"><form:input path="studentAddress"
						placeholder="StudentAddress" /></td>
			</tr>
			<br>


			<tr>
				<td align="right">City</td>
				<td align="left"><form:select path="city">

						<form:option value="Chennai" label="Chennai"></form:option>
						<form:option value="Trichy" label="Trichy"></form:option>
						<form:option value="Coimbatore" label="Coimbatore"></form:option>
						<form:option value="Tanjai" label="Tanjai"></form:option>
						<form:option value="Perambalur" label="Perambalur"></form:option>
						<form:option value="Karur" label="Karur"></form:option>
						<form:option value="Tripur" label="Tripur"></form:option>
						<form:option value="Tenkasi" label="Tenkasi"></form:option>
						<form:option value="Krishnagiri" label="Krishnagiri"></form:option>
						<form:option value="Thiruvarur" label="Thiruvarur"></form:option>
						<form:option value="Cuddalore" label="Cuddalore"></form:option>

					</form:select></td>
			</tr>

			<tr>
				<td align="right">State</td>
				<td align="left"><form:select path="state">
						<form:option value="Tamilnadu" label="Tamilnadu"></form:option>
					</form:select></td>
			</tr>

			<tr>
				<td align="right"></td>
				<td align='left'><input type="submit" value="submit"></td>
				<td>&nbsp;</td>
				<td align="center">&nbsp;</td>
			</tr>

		</form:form>
	</table>
	<br>
	<br>
	<br>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>