<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form  action="processForm" modelAttribute="student">
		First Name : <form:input path="firstName" /><br />
		Last Name : <form:input path="lastName" /><br />
		
		Country :<form:select path="country">
			<%-- <form:option value="BRZ" label="Brazil" />
			<form:option value="US" label="United States" />
			<form:option value="IR" label="Iran" /> --%>
			<form:options items="${student.countryOptions}" /><br />
		</form:select>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>