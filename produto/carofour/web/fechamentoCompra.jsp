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
				<div class="formulario--dados input-radio align-left">
					<input type="radio" name="sexo" value="m" checked>Masculino
					<br>
					<input type="radio" name="sexo" value="f">Feminino
				</div>
				<div class="formulario--dados">
					<input type="text" name="endereco" class="texto--formulario" placeholder="Endereço" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="telefone" data-mask="phone" class="texto--formulario" placeholder="Telefone (DDD) + (Numero)" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="email" class="texto--formulario" placeholder="E-mail" required>
				</div>
				<div class="formulario--dados">
					<input type="password" name="senha" class="texto--formulario" placeholder="Senha" required>
				</div>
				<div class="formulario--dados">
					<input type="submit" class="botao direita" value="Enviar">
				</div>
			</div>
			<div class="conteudo--interno conteudo--50 destaque">
				<h1>Forma de Pagamento</h1>			
				<div class="formulario--dados">
					<select id="selecao--formulario" name="tipoPagamento" required >
  						<option id="vazio">Selecione a forma de Pagamento</option>
  						<option value="1">Cartão de Crédito</option>
 						<option value="2">Boleto Bancário</option>
 					</select> 
				</div>
				
				<h1>Dados de Compra</h1>			
				<div class="formulario--dados">
					<h3>Valor total da Compra:</h3>
					<h3> R$ ${subtotal} + Frete </h3>
				</div>	
			</div>
		</form>	
    </jsp:body>
</t:layout>
