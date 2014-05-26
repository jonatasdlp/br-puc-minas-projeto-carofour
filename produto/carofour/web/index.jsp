<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<t:layout>
	<jsp:body>
		<div class="conteudo--interno conteudo--50 destaque">
			<h1>Bem-Vindo</h1>
			<img alt="produto" src="assets/images/logo-principal.png"
				class="logo--principal">
			<p>
			   Supermercado Carofour oferece soluções eficientes e inovadoras, 
			   cuidando sempre dos pequenos detalhes, de modo a deixar a sua 
			   compra mais fácil e gostosa. Tem tudo o que o que você precisa 
			   com qualidade e oferece um atendimento do jeito que você gosta.
			</p>
		</div>
		<div class="conteudo--interno conteudo--50">
        	<c:forEach var="categoria" items="${categorias}">
            	<div class="categoria--principal">
                	<img alt="${categoria.getNome()}"
						src="${categoria.getUrlImagem()}"
						data-url="categorias?id=${categoria.getId()}">
				</div>
          	</c:forEach>
		</div>
    </jsp:body>
</t:layout>

