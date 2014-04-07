<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:layout>
	<jsp:body>		
		<form action="compra" method="POST">
			<div class="conteudo--interno conteudo--50 destaque">
				<h1>Dados Pessoais</h1>			
				<div class="formulario--dados">
					<input type="text" name="nome" class="textBox--formulario" placeholder="Nome Completo" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="nascimento" class="textBox--formulario" placeholder="Data de Nascimento" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="sexo" class="textBox--formulario" placeholder="Sexo" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="endereco" class="textBox--formulario" placeholder="Endereço" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="telefone" class="textBox--formulario" placeholder="Telefone (DDD) + (Número)" required>
				</div>
				<div class="formulario--dados">
					<input type="text" name="email" class="textBox--formulario" placeholder="E-mail" required>
				</div>
				<div class="formulario--dados">
					<input type="password" name="password" class="textBox--formulario" placeholder="Senha" required>
				</div>
			</div>
			<div class="conteudo--interno conteudo--50 destaque">
				<h1>Condições de Compra</h1>			
				<div class="formulario--dados">
					<input type="text" name="nome" class="textBox--formulario" placeholder="CPF" required>
				</div>
				<label class="formulario--dados" for="cartao">Cartão de Crédito/Débito</label>
				<div class="formulario--dados">
					<select id="dropdown--formulario">
  						<option value="nada"></option>
  						<option value="credito">Cartão de Crédito</option>
 						<option value="debito">Cartão de Débito</option>  						
					</select> 
				</div>	
			</div>
			
			
			
		</form>	
    </jsp:body>
</t:layout>
