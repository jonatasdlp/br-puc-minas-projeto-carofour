<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<t:layout>
	<jsp:body>
		<h1> Pedido realizado com sucesso: ${numero} </h1>
		<div class="conteudo--interno conteudo--50 destaque">
			<h1>Informações dos Produtos</h1>
			<c:forEach var="item" items="${items}">
				<ul>
					<li>${item.getProduto.getNome()}</li>
					<li>${item.getQuantidade()}</li>
					<li>${item.getPreço()}</li>
					<li>${item.valorTotalProduto()}</li>
				</ul>
			</c:forEach>
		</div>
		<div class="conteudo--interno conteudo--50 destaque">
			<h1>Informações do Cliente</h1>
			<ul>
				<li>${cliente.getNome()}</li>
				<li>${cliente.getDataNascimento()}</li>
				<li>${cliente.getSexo()}</li>
				<li>${cliente.getEndereco()}</li>
				<li>${cliente.getTelefone()}</li>
				<li>${cliente.getEmail()}</li>
				<li></li>
			</ul>
		</div>		
    </jsp:body>
</t:layout>