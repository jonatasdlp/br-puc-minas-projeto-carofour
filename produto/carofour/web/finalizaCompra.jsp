<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<t:layout>
	<jsp:body>
		<div class="conteudo--interno conteudo--100 destaque titulo--cheio">
			<h1> Pedido realizado com sucesso: ${numero} </h1>
		</div>
		<div class="conteudo--interno conteudo--50 destaque">
			<h1>Informações dos Produtos</h1>
			<table>
				<thead>
					<tr>
						<th>Produto</th>
						<th>Qtd.</th>
						<th>Preço</th>
						<th>Total</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${items}">
						<tr>
							<td>${item.getProduto().getNome()}</td>
							<td>${item.getQuantidade()}</td>
							<td>${item.getProduto().getPreco()}</td>
							<td>${item.valorTotalProduto()}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="conteudo--interno conteudo--50 destaque">
			<h1>Informações do Cliente</h1>
			<ul class="dados dados--usuario">
				<li><b>Nome</b>: ${cliente.getNomeCompleto()}</li>
				<li><b>Data Nascimento</b>: ${cliente.getDataNascimento()}</li>
				<li><b>Sexo</b>: ${cliente.getSexo()}</li>
				<li><b>Endereço</b>: ${cliente.getEndereco()}</li>
				<li><b>Telefone</b>: ${cliente.getTelefone()}</li>
				<li><b>E-mail</b>: ${cliente.getEmail()}</li>
				<li></li>
			</ul>
		</div>		
    </jsp:body>
</t:layout>