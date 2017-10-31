<%--
  Created by IntelliJ IDEA.
  User: jarry
  Date: 2017/10/24
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/good2.action">
    <input type="submit" value="查询"/>
    <table style="width: 100%;">
        <thead>
        <tr>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>生产日期</td>
        </tr>
        </thead>
        <c:forEach items="${items}" var="items">
            <tr>
                <td>${items.name}</td>
                <td>${items.price}</td>
                <td>${items.productDate}</td>
            </tr>
        </c:forEach>
    </table>
</form>


</body>
</html>
