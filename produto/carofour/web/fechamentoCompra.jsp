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
					<input type="text" name="nascimento" data-mask="date" class="texto--formulario" placeholder="Data de Nascimento" required>
				</div>
				<div class="formulario--dados">
					<select id="selecao--formulario" class="sem-margin" name="sexo">
 						<option value="m">Masculino</option>
 						<option value="f">Feminino</option>  						
					</select>
				</div>
				<div class="formulario--dados">
					<input type="text" name="endereco" class="texto--formulario" placeholder="Endere�o" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="telefone" data-mask="phone" class="texto--formulario" placeholder="Telefone (DDD) + (Numero)" required>
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
				<h1>Forma de Pagamento</h1>			
				<div class="formulario--dados">
					<select id="selecao--formulario">
  						<option id="vazio">Selecione a forma de Pagamento</option>
  						<option value="credito">Cart�o de Cr�dito</option>
 						<option value="debito">Cart�o de D�bito</option>	
 						<option value="debito">Boleto Banc�rio</option>
 						<option value="debito">Paypal</option>
 						<option value="debito">PagueSeguro</option>
 					</select> 
				</div>
				
				<h1>Dados de Compra</h1>			
				<div class="formulario--dados">
					<h3>Valor Total:</h3>
					<h3> R$ ${subtotal} + Frete </h3>
				</div>	
			</div>
		</form>	
    </jsp:body>
</t:layout>
