<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
YongIn LMS<p>
<form action ="login.do">
	ID : <input type="text" name="id"><br>
	PASSWORD : <input type="password" name="pwd"><br>
	<input type="radio" name="check" value="professor">
	<label for="professor">교수</label><br>
	<input type="radio" name="check" value="student">
	<label for="student">학생</label><br>
	<input type="submit" value="login">
</form>
</body>
</html>