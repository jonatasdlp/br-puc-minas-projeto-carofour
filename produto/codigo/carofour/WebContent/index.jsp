<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Supermercado - Carofour</title>
<jsp:include page="partials/header.jsp" />
</head>
<body>
	<div class="container">
		<div id="header">
			<h1>Carofour Produtos e Alimentos Orgânicos</h1>
		</div>
		<div class="content">
			<div class="content__left">
				<h3>Bem-Vindo!</h3>
				<p>${horaLocal}</p>
			</div>
			<div class="content__right">
			</div>
		</div>
		<div id="footer">
			<jsp:include page="partials/footer.jsp" />
		</div>
	</div>
</body>
</html>
