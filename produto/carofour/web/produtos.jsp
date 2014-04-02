<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:genericpage>
	<jsp:body>
		<div class="content__widget content__left wdt__25">
			<div class="widget__header">
				<h3>Categorias</h3>
				<div class="fundo__categoria"><a href="<c:url value='produtos?categoria=1'/>">Laticínios</a></div>
				<div class="fundo__categoria"><a href="<c:url value='produtos?categoria=2'/>">Carnes</a></div>
				<div class="fundo__categoria"><a href="<c:url value='produtos?categoria=3'/>">Padaria</a></div>
				<div class="fundo__categoria"><a href="<c:url value='produtos?categoria=4'/>">HortiFruti</a></div>
			</div>
		</div>
		<div class="content__widget content__right wdt__75">
			<h5 class="observacao__label">*Escolha a Categoria de produtos ao lado e abaixo clique no produto escolhido:</h5>
			<table>
				<c:forEach items="${produtos}" var="produto">
				<tr>
					<td><c:out value="${produto.getNome()}" /><br></td>
					<td><c:out value="${produto.getDescricao()}" /><br></td>
					<td><c:out value="${produto.getEnderecoImagem()}" /><br></td>
					<td><c:out value="${produto.getPreco()}" /><br></td>	
				</tr>
				</c:forEach>
			</table>	
		</div>
    </jsp:body>
</t:genericpage>

