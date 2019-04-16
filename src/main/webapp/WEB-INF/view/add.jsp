<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/css/index3.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/js/jquery-3.0.0.min.js"></script>
</head>
<script type="text/javascript">
function Query(){
	var name=$("[name='name']").val();
	location.href="list?name="+name;
}

function add(){
	$.ajax({
		type:"post",
		data:$("form").serialize(),
		url:"add",
		success:function(result){
			if(result){
				alert("添加成功");
				location.href="list";
			}else{
				alert("添加失败");
			}
		}
	})
}
</script>
<body>
<form action="">
	<table>
		
		<tr>
			<td>犯罪名称</td>
			<td><input type="text" name="criminalName"></td>
		</tr>
		<tr>
			<td>身份证编号</td>
			<td><input type="text" name="cardNo"></td>
		</tr>
		<tr>
			<td>年龄</td>
			<td><input type="text" name="criminalAge"></td>
		</tr>
		<tr>
			<td>性别</td>
			<td><input type="text" name="criminalSex"></td>
		</tr>
		
		<tr>
			<td>详情描述</td>
			<td><input type="text" name="criminalDesc"></td>
		</tr>
		
		<tr>
			<td colspan="11"><input type="button" value="添加" onclick="add()"></td>
		</tr>
		
		
	</table>
	</form>
</body>
</html>