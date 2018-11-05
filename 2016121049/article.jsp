<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
    </tr>   
<c:forEach var="ar" items="${sessionScope.articlelist}">
    <tr>
        <td>${ar.articleTitle}</td>
        <td>${ar.articleContent}</td>
        <td>1</td>
    </tr>
</c:forEach>
</table>
</body>
</html>