<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livros de Java, Android, iPhone, Ruby, PHP e muito mais -
	Casa do Código</title>
</head>
<body>
	<c:import url="../menu.jsp"></c:import>
	<h1>Lista de Produtos</h1>
	<p> ${sucesso} </p>
	<table>
		<tr>
			<td>Título</td>
			<td>Descrição</td>
			<td>Páginas</td>
		</tr>

		<c:forEach items="${produtos}" var="produto">
			<tr>
				<td>${produto.titulo}</td>
				<td>${produto.descricao}</td>
				<td>${produto.paginas}</td>
<!-- 				<td> -->
<!-- 					<form action="/casadocodigo/produtos/remover" method="post"> -->
<%-- 						<input type="hidden" name="id" value="${produto.id}"> --%>
<!-- 						<button type="submit">Remover</button> -->
<!-- 					</form> -->
<!-- 				</td> -->
			</tr>
		</c:forEach>
	</table>
</body>
</html>