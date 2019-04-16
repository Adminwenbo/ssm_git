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

function toadd(){
	location.href="toadd";
}


function deletebyid(cid){
	var ret=confirm("确定要删除吗");
	if(ret){
		$.ajax({
			type:"post",
			data:{cid:cid},
			url:"deletebyid",
			success:function(result){
				if(result){
					alert("删除成功");
					location.href="list";
				}else{
					alert("删除失败");
				}
			}
		})
	}
}
</script>
<body>
	<table>
		<tr>
			<td colspan="11">
			<input type="text" value="${name }"  name="name">
			<input type="button" value="查询" onclick="Query()">
			</td>
		</tr>
		<tr>
			<td>序号</td>
			<td>犯罪名称</td>
			<td>身份证编号</td>
			<td>年龄</td>
			<td>性别</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="c" varStatus="i">
		<tr>
			<td>${i.index+1 }</td>
			<td>${c.criminal_name }</td>
			<td>${c.card_no }</td>
			<td>${c.criminal_age }</td>
			<td>${c.criminal_sex }</td>
			<td>
			<a href="tosee?id=${c.cid}"><input type="button" value="详情"></a>
			<a href="toupdate?id=${c.cid }"><input type="button" value="修改"></a>
			<a href="javascript:deletebyid(${c.cid })"><input type="button" value="删除"></a>
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="11"><input type="button" value="添加" onclick="toadd()"></td>
		</tr>
		
		<tr>
			<td colspan="11">${page }</td>
		</tr>
	</table>
</body>
</html>