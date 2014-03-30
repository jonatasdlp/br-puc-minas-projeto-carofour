<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:genericpage>
	<jsp:body>
		<h4>${produtos}</h4>
		<div class="content__widget content__left wdt__25">
		<div class="widget__header">
				<h3>Categorias</h3>
		<div class="fundo__categoria">Laticínios</div>
		<div class="fundo__categoria">Carnes</div>
		<div class="fundo__categoria">Padaria</div>
		<div class="fundo__categoria">HortiFruti</div>
		</div>
		</div>
		<div class="content__widget content__right wdt__75">
		<h5 class="observacao__label">*Escolha a Categoria de produtos ao lado e abaixo clique no produto escolhido:</h5>
		<div class="produto__botao">
			<a class="produto__botao" href="#"></a>
			<a class="produto__botao" href="#"></a>
			<a class="produto__botao" href="#"></a>
		</div>		
		<table border=1 width="300" height="100" align="center"> 
		  <tr>
		    <td></td>
		    <td>5pm</td>
		    <td>7pm</td>
		    <td>9pm</td>
		    <td>11pm</td>
		  </tr>
		  <tr>
		    <td>Screen One</td>
		    <td>Stars Wars</td>
		    <td>Empire Stracks Back</td>
		    <td>Return of the Jedi</td>
		    <td>The Exorcist</td>
		  </tr>
		  <tr>
		    <td>Screen Two</td>
		    <td colspan="2">Dance if Wolves</td>
		    <td colspan="2">Gone With the wind</td>
		  </tr>
		  <tr>
		    <td>Screen Three</td>
		    <td colspan="2">2001: A Odyssey</td>
		    <td>The Conversation</td>
		    <td>5 Easy Pieces</td>
		  </tr>
		</table>
		</div>
    </jsp:body>
</t:genericpage>
