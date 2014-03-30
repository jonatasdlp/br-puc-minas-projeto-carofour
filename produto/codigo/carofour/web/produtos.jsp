<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:genericpage>


	<jsp:body>
	<div style="background-color: blue">
<h2>Produtos de Categoria ${categ} </h2>
<table>
<tr>
<td></td>
<td>Nome/Descrição</td>
<td>Preço</td>
<td></td>
<td></td>
</tr>
<tr>
<td><input type="checkbox"></td>
<td>${produtos[0].nome}/${produtos[0].descricao}</td>
<td>${produtos[0].preco}</td>
<td>		<div class="pull__left">
						<img src="${produtos[0].enderecoImagem}"
					class="image__item--large"></div></td>
<td>Comprar</td>
</tr>
<tr>
<td><input type="checkbox"></td>
<td>${produtos[3].nome}/${produtos[03].descricao}</td>
<td>${produtos[3].preco}</td>
<td width="10px">		<div class="pull__left">
						<img src="${produtos[3].enderecoImagem}"
					class="image__item--large"></div></td>
<td>Comprar</td>
</tr>
</table>
		</div>
    </jsp:body>
</t:genericpage>

