<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:layout>
	<jsp:body>
		<div class="conteudo--interno conteudo--100 destaque" id="compras">
			<h1>Minhas Compras</h1>
			<div class="acoes">
				<ul class="horizontal direita">
					<li><a href="#" class="botao" id="removeItems">Limpar Carrinho</a></li>
					<li><a href="/carofour/categorias?q=Laticínios" class="botao">Continuar Compras</a></li>
					<li><a href="#" class="botao">Fechar Compra</a></li>
				</ul>
			</div>
			<div class="compras">
				<table>
					<thead>
						<tr>
							<th></th>
						    <th>Nome/Descrição</th>
						    <th>Quantidade</th>
						    <th>Preço</th>
						    <th>Ações</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${items}">
							<tr>
								<td class="produto--img">
									<div class="produto">
										<img alt="${item.produto.getNome()}" src="${item.produto.getEnderecoImagem()}">
									</div>
								</td>
								<td>${item.produto.getNome()} - ${item.produto.getDescricao()}</td>
								<td><input type="number" value="${item.getQuantidade()}" name="quantidade"></td>
								<td>${item.valorTotalProduto()}</td>
								<td data-url="/carofour/compras" data-item="${item.produto.getNome()}">
									<a href="#" class="atualiza">Atualizar</a> | 
									<a href="#" class="remove">Remover</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
    </jsp:body>
</t:layout>

