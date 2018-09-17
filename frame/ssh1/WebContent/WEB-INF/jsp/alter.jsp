<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>alter</title>
</head>
<body>
	<div align="center" >
		<form action="${requestScope.action=='insert'?'doInsert':'doUpadate' }" method="post">
			<table >
				<tr>
					<td>姓名</td>
					<td><input name="name" value="${student.name }"/></td>
				</tr>
				<tr>
					<td>性别</td>
					<td><input name="sex" value="${requestScope.student.name }"/></td>
				</tr>
				<tr>
					<td>出生日期</td>
					<td><input name="birthday" value="${requestScope.student.name }"/></td>
				</tr>
				<tr align="center">
					<td colspan="2"><input type="submit" value="提交"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>