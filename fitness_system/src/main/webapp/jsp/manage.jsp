<%@ page import="java.util.List" %>
<%@ page import="com.imnu.pojo.userbean" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>用户管理</title>
    <link rel="stylesheet" type="text/css"
          href="<c:url value='../css/maple.css'/>"></link>
    <style type="text/css">
        .tx td {
            padding: 3px;
        }

        .store {
            width: 100%;
            border: 1px solid gray;
            border-collapse: collapse;
        }

        .store td {
            border: 1px solid gray;
            padding: 3px;
        }

        .store a {
            text-decoration: underline;
            color: blue;
        }
    </style>
</head>
<body>
<table border="0" class="tx" width="100%">
    <tr>
        <td>当前位置&gt;&gt;<a href="${pageContext.request.contextPath }/index.html">首页</a>&gt;&gt;用户管理</td>
    </tr>
</table>
<br>
<center>
        <tr>
            <td rowspan="1">
                <form id="searchForm" action="${pageContext.request.contextPath }/manage"
                      method="post">
                    <table width="100%" border="0" cellpadding="0" cellspacing="0" class="tx" align="center">
                        <colgroup>
                            <col width="20%" align="right">
                            <col width="*%" align="left">
                        </colgroup>
                        <tr>
                            <td bgcolor="a0c0c0" style="padding-left:10px;" colspan="2" align="left">
                                <b>查询条件：</b>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                用户姓名：
                            </td>
                            <td>
                                <input class="tx" type="hidden" name="id">
                                <input id="search" class="tx" name="username" type="text" placeholder="请输入用户或者教练名字"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="right" style="padding-top:10px;">
                                <input class="tx" style="width:120px;margin-right:30px;" type="submit" value="查询" >
                            </td>
                        </tr>

                    </table>
                </form>
            </td>
        </tr>
        <tr valign="top">
            <td rowspan="2">
                <form action="" method="post" name="select">
                    <table width="100%" border="0" cellpadding="0" cellspacing="0" class="tx" align="center">
                        <colgroup>
                            <col width="20%" align="right">
                            <col width="*%" align="left">
                        </colgroup>
                        <tr>
                            <td bgcolor="a0c0c0" style="padding-left:10px;" colspan="1" align="left">
                                <b>用户列表：</b>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <table class="store">
                                    <tr style="background:#D2E9FF;text-align: center;">
                                        <td>用户昵称</td>
                                        <td>用户密码</td>
                                        <td>手机</td>
                                        <td>地址</td>
                                        <td>性别</td>
                                        <td>姓名</td>
                                        <td>会员积分</td>
                                        <td>操作</td>
                                    </tr>
                                    <c:forEach items="${sessionScope.userbeanlist}" var="user">
                                        <tr style="background: #D2E9FF">
                                            <td>${user.name}</td>
                                            <td>${user.password}</td>
                                            <td>${user.phone}</td>
                                            <td>${user.address}</td>
                                            <td>${user.sex}</td>
                                            <td>${user.realname}</td>
                                            <td>${user.score}</td>
                                            <td>
                                                <a href="${pageContext.request.contextPath }/deleteuser?id=${user.id}">删除</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </table>
                            </td>
                        </tr>
                    </table>
                </form>
            </td>
        </tr>
</center>
</body>
</html>
<script>
    document.body.style.backgroundImage = "url(http://localhost:8080/yansheng_war_exploded/images/2.jpg)"; //改变背景图
</script>


