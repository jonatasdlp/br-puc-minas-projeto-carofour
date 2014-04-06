<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:layout>
	<jsp:body>
		<div class="conteudo--interno conteudo--25 destaque">
			<h1>Categorias</h1>
			<div class="categorias">
				<ul>
					<c:forEach var="categoria" items="${categorias}">
						<li data-action="#${categoria.getIdCategoria()}" class="selecao">
							<img alt="${categora.getNome}" src="${categoria.getUrlImagem()}">
							<div class="categoria--nome">
								<b>${categoria.getNome()}</b>
							</div>
						</li>
	  				</c:forEach>
				</ul>
			</div>
		</div>
		<div class="conteudo--interno conteudo--75 destaque">
			<h1 id="tituloCategoria">Produtos categoria </h1>
			<div class="acoes">
				<ul class="horizontal direita">
					<li><a href="/carofour/compras" class="botao">Ver Carrinho</a></li>
					<li><a href="#" class="botao" id="submit">Comprar Produto(s)</a></li>
					<li><a href="#" class="botao">Fechar Compra</a></li>
				</ul>
			</div>
			<c:forEach var="categoria" items="${categorias}">
				<div class="produtos" id="${categoria.getIdCategoria()}">
					<form action="/carofour/adicionarProdutos" method="POST">
						<table>
							<thead>
								<tr>
									<th></th>
									<th>Nome/Descrição</th>
									<th>Preço (R$)</th>
									<th>Ação</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="produto" items="${categoria.getProdutos()}">
									<tr>
										<td class="inputs">
											<input type="hidden" name="produtos" data-value="${produto.getNome()}">
											<input type="checkbox" class="check">
										</td>
										<td>${produto.getNome()} - ${produto.getDescricao()}</td>
										<td>${produto.getPreco()}</td>
										<td class="acao" >Comprar</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</form>
				</div>
	  		</c:forEach>
		</div>
    </jsp:body>
</t:layout>

