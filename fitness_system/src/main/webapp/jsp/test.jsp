<%@ page import="java.util.List" %>
<%@ page import="com.imnu.pojo.userbean" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: Lg Gram
  Date: 2021/11/30
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%%>
<%--<form action="${pageContext.request.contextPath }/messageservlet" method="post">--%>

<%--    姓名<input type="text" name="username" id="username" class="username">--%>

<%--    密码<input type="text" name="password" id="password" class="password">--%>

<%--    <input type="submit" value="新增">--%>
<%--    <br>--%>

<%--</form>--%>

<c:forEach items="${sessionScope.userbeanlist}" var="user">
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.realname}</td>
        <td>${user.phone}</td>
        <td>${user.address}</td>
        <td>${user.score}</td>
        <td>${user.sex}</td>
        <td>
            <a href="">删除</a>
        </td>
    </tr>
</c:forEach>



</body>
</html>
