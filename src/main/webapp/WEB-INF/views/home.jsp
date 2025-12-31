<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<%-- ContextPath를 사용하여 배포 환경(서버 주소 변경)에 관계없이 경로 유지 --%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/home.css">
</head>
<body>
    <div class="container">
        <h1>Hello, World</h1>
        <a href="#" class="btn-start">대시보드 입장</a>
    </div>
</body>
</html>