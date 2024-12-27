<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fomr" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 27/12/2024
  Time: 7:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<style>
    .error {
        color: red;
    }
</style>
<h3>Register</h3>
<form:form modelAttribute="user" action="${pageContext.request.contextPath}/userController/register" method="post">
    <form:label path="username" cssErrorClass="error">Username</form:label>
    <form:input path="username"/>
    <form:errors path="username" cssClass="error"/><br>
    <form:label path="password" cssErrorClass="error">Password</form:label>
    <form:password path="password"/>
    <form:errors path="password" cssClass="error"/><br>
    <form:label path="fullname" cssErrorClass="error">Fullname</form:label>
    <form:input path="fullname"/>
    <form:errors path="fullname" cssClass="error"/><br>
    <form:label path="email" cssErrorClass="error">Email</form:label>
    <form:input path="email"/>
    <form:errors path="email" cssClass="error"/><br>
    <form:label path="phone" cssErrorClass="error">Phone</form:label>
    <form:input path="phone"/>
    <form:errors path="phone" cssClass="error"/><br>
    <form:label path="address" cssErrorClass="error">Address</form:label>
    <form:input path="address"/>
    <form:errors path="address" cssClass="error"/><br>
    <label for="bod">Birth Of Date</label>
    <input type="date" id="bod" name="bod"/><br>
    <input type="submit" value="Register"/>
</form:form>
</body>
</html>
