<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix='form' uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 등록양식</title>
</head>
<body>
  <form action='register' method='post'>
      번호 : <input type='text' name='mb_no'/><br/>
      이름 : <input type='text' name='mb_name'/><br/>
      전화번호 : <input type='text' name='mb_tel'/><br/>
      이메일 : <input type='text' name='mb_email'/><br/>
      패스워드 : <input type='text' name='mb_pw'/><br/>
      주소 : <input type='text' name='mb_addr'/><br/>
      <button type='submit'>확인</button>
   </form>
</body>
</html>