<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:layout>
	<jsp:body>		
		<form action="compra" method="POST">
			<div class="conteudo--interno conteudo--50 destaque">
				<h1>Dados Pessoais</h1>			
				<div class="formulario--dados">
					<input type="text" name="nome" class="texto--formulario" placeholder="Nome Completo" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="nascimento" class="texto--formulario" placeholder="Data de Nascimento" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="sexo" class="texto--formulario" placeholder="Sexo" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="endereco" class="texto--formulario" placeholder="EndereÃ§o" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="telefone" class="texto--formulario" placeholder="Telefone (DDD) + (NÃºmero)" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="email" class="texto--formulario" placeholder="E-mail" required>
				</div>
				<div class="formulario--dados">
					<input type="password" name="password" class="texto--formulario" placeholder="Senha" required>
				</div>
			</div>
			<div class="conteudo--interno conteudo--50 destaque">
				<h1>Condições de Compra</h1>			
				<div class="formulario--dados">
					<input type="text" name="nome" class="texto--formulario" placeholder="CPF" required>
				</div>
				<label class="formulario--dados" for="cartao">Cartão de crédito/débito</label>
				<div class="formulario--dados">
					<select id="selecao--formulario">
  						<option value="nada"></option>
  						<option value="credito">Cartão de Crédito</option>
 						<option value="debito">Cartão de Dédito</option>  						
					</select> 
				</div>	
			</div>
			
			
			
		</form>	
    </jsp:body>
</t:layout>
