<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:genericpage>
	<jsp:body>
		<div class="content__widget content__left wdt__3">
			<div class="widget__header">
				<h3>Formulário de Cadastro</h3>
			</div>
			<div class="widget__body">
				<form action="compra" method="POST">
					<div class="form__item">
						<input type="text" name="nome" placeholder="Nome Completo" required>
					</div>
					<div class="form__item">
						<input type="text" name="nascimento" placeholder="Data de Nascimento" required>
					</div>
					<div class="form__item">
						<input type="text" name="sexo" placeholder="Sexo" required>
					</div>
					<div class="form__item">
						<input type="text" name="endereco" placeholder="Endereço" required>
					</div>
					<div class="form__item">
						<input type="text" name="telefone" placeholder="Telefone (DDD) + (Número)" required>
					</div>
					<div class="form__item">
						<input type="text" name="email" placeholder="E-mail" required>
					</div>
					<div class="form__item">
						<input type="password" name="password" placeholder="Senha" required>
					</div>
					<div class="form__action">
						<input type="submit" value="Enviar" class="button-flat pull__right" required>
					</div>
				</form>
			</div>		
		</div>
    </jsp:body>
</t:genericpage>
