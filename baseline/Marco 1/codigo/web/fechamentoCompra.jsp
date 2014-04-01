<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:genericpage>
	<jsp:body>
		<div class="content__widget content__left wdt__50">
			<div class="widget__header">
				<h3>Formulário de Cadastro</h3>
			</div>
			<div class="widget__body">
				<form action="compra" method="POST">
					<div class="form__item">
						<input type="text" name="nome" placeholder="Nome Completo"
							required>
					</div>
					<div class="form__item">
						<input type="text" name="nascimento"
							placeholder="Data de Nascimento" required>
					</div>
					<div class="form__item">
						<input type="text" name="sexo" placeholder="Sexo" required>
					</div>
					<div class="form__item">
						<input type="text" name="endereco" placeholder="Endereço" required>
					</div>
					<div class="form__item">
						<input type="text" name="telefone"
							placeholder="Telefone (DDD) + (Número)" required>
					</div>
					<div class="form__item">
						<input type="text" name="email" placeholder="E-mail" required>
					</div>
					<div class="form__item">
						<input type="password" name="password" placeholder="Senha"
							required>
					</div>
					<div class="form__action">
						<input type="submit" value="Enviar"
							class="button-flat pull__right" required>
					</div>
				</form>
			</div>	
		</div>
		<div class="widget__content content__right wdt__25 disLaterDir">
			<div class="widget__header">
				<h3>Condições de Compra</h3>
			</div>
			<div class="widget__body content__widget">
				<div class="form__item">
					<input type="text" name="nome" placeholder="Escolha o Cartão" required>
				</div>
			</div>
			<div class="widget__header">
				<h3>Valor Total da Compra</h3>
			</div>
			<div class="widget__body content__widget">
		
			</div>
		</div>
    </jsp:body>
</t:genericpage>
