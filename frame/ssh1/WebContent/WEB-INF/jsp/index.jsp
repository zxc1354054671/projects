<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center" >
		<a href="toInsert">添加</a>
		<form action="toIndex" method="post" id=" ">
			<input name="likeName" value="${requestScope.likeName }" />
			<input value="查找" type="submit"/>
			<table border>
				<tr>
					<td>学号</td>
					<td>姓名</td>
					<td>性别</td>
					<td>出生日期</td>
					<td>操作</td>
				</tr>
				<c:forEach items="${requestScope.students }" var="s">
					<tr>
						<td>${s.stuNo }</td>
						<td>${s.name }</td>
						<td>${s.sex }</td>
						<td>${s.birthday }<s:date name="" format="" var=""/></td>
						<td><a href="toUpdate.action?stuNo=${s.stuNo }">修改</a> <a href="delete.action?stuNo=${s.stuNo }">删除</a></td>
					</tr>
				</c:forEach>
			</table>
			<c:forEach begin="1" end="${requestScope.pageCount }" var="v">
				<c:if test="${v==pageNo }">${v }</c:if>
				<c:if test="${v!=pageNo }"><a href="javaScript:void(0)">${v }</a></c:if>
			</c:forEach>
		</form>
	</div>
</body>
</html>