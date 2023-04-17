<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>데이터 저장 성공!</h2>
<c:forEach var='obj' items="${list}">
	이름 : ${obj.mb_name }<br/>
	전화번호 : ${obj.mb_tel }<br/>
	이메일 : ${obj.mb_email }<br/>
	주소 : ${obj.mb_addr }<br/>

	인덱스 번호랑, 비밀번호는 비공개입니다.
</c:forEach>
</body>
</html>