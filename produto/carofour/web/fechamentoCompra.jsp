<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:layout>
	<jsp:body>		
		<form action="finalizar" method="POST">
			<div class="conteudo--interno conteudo--50 destaque">
				<h1>Dados Pessoais</h1>			
				<div class="formulario--dados">
					<input type="text" name="nome" class="texto--formulario" placeholder="Nome Completo" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="nascimento" class="texto--formulario" placeholder="Data de Nascimento" required>
				</div>
				<div class="formulario--dados">
					<select id="selecao--formulario" name="sexo">
 						<option value="m">Masculino</option>
 						<option value="f">Feminino</option>  						
					</select>
				</div>
				<div class="formulario--dados">
					<input type="text" name="endereco" class="texto--formulario" placeholder="Endere�o" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="telefone" class="texto--formulario" placeholder="Telefone (DDD) + (N�mero)" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="email" class="texto--formulario" placeholder="E-mail" required>
				</div>
				<div class="formulario--dados">
					<input type="password" name="password" class="texto--formulario" placeholder="Senha" required>
				</div>
				<div class="formulario--dados">
					<input type="submit" class="botao direita" value="Enviar">
				</div>
			</div>
			<div class="conteudo--interno conteudo--50 destaque">
				<h1>Condi��es de Compra</h1>			
				<div class="formulario--dados">
					<select id="selecao--formulario">
  						<option id="vazio">Selecione a forma de Pagamento</option>
  						<option value="credito">Cart�o de Cr�dito</option>
 						<option value="debito">Cart�o de D�dito</option>	
 						<option value="debito">Boleto Banc�rio</option>
 						<option value="debito">Paypal</option>
 						<option value="debito">PagueSeguro</option>  						
>>>>>>> 73df6485efd61ea405c7ac59ae42ce0f4c7b9802
					</select> 
				</div>
				
				<h1>Dados de Compra</h1>			
				<label class="formulario--dados" for="cartao">Cart�o de cr�dito/d�bito</label>
				<div class="formulario--dados">
					<h3>Valor Total:</h3>
					<h3> R$ ${subtotal} + Frete </h3>
				</div>	
				<br>
				<h1>Valores</h1>
				<fieldset class="fieldset--formulario">
					<legend>Finalizar Compra:</legend>
  					<div class="lateral--Compra">
  						<label for="valorCompra">Valor da Compra:</label>
  						<input type="text" name="valorCompra" class="tamanho--Compra" placeholder=",00" disabled="disabled">
  					</div>
  					<br style="clear: both;">
  					<div class="lateral--Compra">
						<label for="valorFrete">Valor de Frete:</label>
						<input type="text" name="valorFrete" class="tamanho--Compra" placeholder=",00" disabled="disabled">
						<input name="botaoCompra" class="botao" style="margin-left: 70px;" type="submit" value="Comprar">
					</div>
					<br style="clear: both;">
					<div class="lateral--Compra">
						<label for="valorTotal">Valor Total:</label>
						<input type="text" name="valorTotal" class="tamanho--Compra" placeholder=",00" disabled="disabled">
					</div><br>
					<br style="clear: both;">
				</fieldset>
				
			</div>
		</form>	
    </jsp:body>
</t:layout>
