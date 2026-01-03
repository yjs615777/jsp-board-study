<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Brand List</title>
</head>
<body>

<h1>브랜드 목록</h1>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>이름</th>
            <th>카테고리</th>
            <th>국가</th>
            <th>설립년도</th>
            <th>추천</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="brand" items="${brands}">
            <tr>
                <td>${brand.id}</td>
                <td>${brand.name}</td>
                <td>${brand.category}</td>
                <td>${brand.country}</td>
                <td>${brand.foundedYear}</td>
                <td>
                    <c:if test="${brand.featured}">
                        ⭐
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<br/>

<a href="${pageContext.request.contextPath}/home">홈으로</a>

</body>
</html>
