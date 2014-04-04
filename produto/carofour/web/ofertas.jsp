<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:genericpage>
	<jsp:body>
		<div class="content__widget content__left wdt__25">
			<div class="widget__header">
				<h3>Ofertas</h3>
				<div class="fundo__categoria"><a href="<c:url value='produtos?categoria=1'/>">Laticínios</a></div>
				<div class="fundo__categoria"><a href="<c:url value='produtos?categoria=2'/>">Carnes</a></div>
				<div class="fundo__categoria"><a href="<c:url value='produtos?categoria=3'/>">Padaria</a></div>
				<div class="fundo__categoria"><a href="<c:url value='produtos?categoria=4'/>">HortiFruti</a></div>
			</div>
		</div>
		<div class="content__widget content__right wdt__75">
			<div class="row">
				<c:forEach items="${produtos}" var="produto">
				<div class="item item--small">
					<div class="item__image">
						<img alt="item" src="${produto.getEnderecoImagem()}">
					</div>
					<div class="item__description">
						<h4><c:out value="${produto.getNome()}" /></h4>
						<p><c:out value="${produto.getDescricao()}" /></p>
						<p class="item__price">${produto.getPreco()}</p>
						<a href="/carofour/adicionarProduto?categoria=1&produto=${produto.getNome()}" class="button__default">Comprar</a>
					</div>
				</div>
				</c:forEach>
			</div>	
		</div>
    </jsp:body>
</t:genericpage>