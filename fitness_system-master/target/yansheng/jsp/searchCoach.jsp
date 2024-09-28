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
    <style>
        *{margin:0;
            padding:0;
            box-sizing:border-box;
        }
        body {
            background: url(../images/1.jpg) no-repeat center 0px fixed;
            background-size: cover;
            font-family: "微软雅黑", sans-serif;
        }
        .login {
            position: absolute;
            top: 50%;
            left: 50%;
            margin: -150px 0 0 -150px;
            width:300px;
            height:300px;
        }
        .login h1 {
            color: #adadad;
            text-shadow: 0px 10px 10px #CDC673;
            letter-spacing:2px;text-align:center;
            margin-bottom:20px;
        }
        input{
            padding:10px;
            width:100%;
            color:white;
            margin-bottom:10px;
            background-color:#555555;
            border: 1px solid black;
            border-radius:5px;
            letter-spacing:2px;
        }
        form button{
            width:100%;
            padding:10px;
            margin-bottom:10px;
            background-color:#CDC673;
            border:1px solid black;
            border-radius:5px;
            cursor:pointer;
        }
    </style>
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
    <tr bgcolor="#f0ffff">
        <td>当前位置&gt;&gt;<a href="${pageContext.request.contextPath }/index.html">首页</a>&gt;&gt;用户管理</td>
    </tr>
</table>
<br>
<center>
    <tr>
        <td rowspan="1">
            <form id="searchForm" action="${pageContext.request.contextPath }/searchCoach"
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
                            <input id="search" class="tx" name="username" type="text" placeholder="请输入教练名字"/>
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
                                    <td>教练姓名</td>
                                    <td>性别</td>
                                    <td>年龄</td>
                                    <td>身高</td>
                                    <td>体重</td>
                                    <td>工作时间</td>
                                    <td>本月是否拥有课时</td>
                                    <td>课时收费</td>
                                    <td>教练评价</td>
                                    <td>操作</td>
                                </tr>
                                <c:forEach items="${sessionScope.coachbeanList}" var="user">
                                    <tr style="background: #D2E9FF">
                                        <td>${user.name}</td>
                                        <td>${user.sex}</td>
                                        <td>${user.age}</td>
                                        <td>${user.height}</td>
                                        <td>${user.weight}</td>
                                        <td>${user.worktime}</td>
                                        <td>${user.lessontime}</td>
                                        <td>${user.price}</td>
                                        <td>${user.remark}</td>
                                        <td>
                                            <a href="${pageContext.request.contextPath }/buycoach?id=${user.id}">购买课时</a>
<%--                                            <a href="${pageContext.request.contextPath }/test.html">跳转</a>--%>
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
    document.body.style.backgroundImage = "url(http://localhost:8080/yansheng_war_exploded/images/4.jpg)"; //改变背景图
</script>


