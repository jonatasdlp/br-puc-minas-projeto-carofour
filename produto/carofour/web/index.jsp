<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:layout>
	<jsp:body>
		<div class="conteudo--interno conteudo--50 destaque">
			<h1>Bem-Vindo</h1>
			<img alt="produto" src="assets/images/logo-principal.png" class="logo--principal">
			<p>
			   Supermercado Carofour oferece soluções eficientes e inovadoras, 
			   cuidando sempre dos pequenos detalhes, de modo a deixar a sua 
			   compra mais fácil e gostosa. Tem tudo o que o que você precisa 
			   com qualidade e oferece um atendimento do jeito que você gosta.
			</p>
		</div>
		<div class="conteudo--interno conteudo--50">
			<div class="categoria--principal">
				<img alt="produto" src="assets/images/3.jpg" data-url="/categorias?q=${categorias.get(0).getIdCategoria()}">
			</div>
			<div class="categoria--principal">
				<img alt="produto" src="assets/images/1.jpg" data-url="/categorias?q=${categorias.get(1).getIdCategoria()}">
			</div>
			<div class="categoria--principal">
				<img alt="produto" src="assets/images/6.jpg" data-url="/categorias?q=${categorias.get(2).getIdCategoria()}">
			</div>
			<div class="categoria--principal">
				<img alt="produto" src="assets/images/7.jpg" data-url="/categorias?q=${categorias.get(3).getIdCategoria()}">
			</div>
		</div>
    </jsp:body>
</t:layout>

