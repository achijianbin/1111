<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="mytag" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<table border=1 cellpadding="10" cellspacing="0">
<tr>
<th>id</th>
<th>name</th>
<th>age</th>
<th>addrs</th>
</tr>

<c:forEach items="${list }" var="user">//这里使用的是jstl标签以及el表达式显示用户信息
<tr>
<th>${user.id }</th> 
<th>${user.empname }</th>
<th>${user.empno }</th>
<th>${user.job }</th>
</tr>
</c:forEach>

</table>
</body>

</html>