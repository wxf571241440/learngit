<%--
  Created by IntelliJ IDEA.
  User: xf
  Date: 2020/9/24
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1> good boy</h1>
    <h1> 成功</h1>
    <c:forEach items="${books}" var="book">
        ${book.id}--${book.name}--${book.mark}--${book.outDate}<br>
    </c:forEach>
</body>
</html>
