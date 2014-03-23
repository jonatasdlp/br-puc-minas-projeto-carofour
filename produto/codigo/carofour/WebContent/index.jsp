<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:genericpage>
	<jsp:body>
		<div class="content__widget content__left wdt__3">
			<div class="widget__header">
				<h3>Bem-Vindo!</h3>
			</div>
			<div class="widget__body">
				<p class="center">
				 	[ Texto aqui! ]
				 	<br/>
				 	${horaLocal}
				</p>
			</div>		
		</div>
		<div class="content__widget content__right wdt__9">
			<div class="row">
				<div class="r__item r__item--plus">
					<div>
						<img src="assets/images/8.jpg" class="image__item--plus">
					</div>
					<div class="r__item__inner">
						<p class="center">Descrição do produto 1  Lista de itens</p>
						<a href="#" class="button-flat pull__left">Comprar</a>
					</div>
				</div>
				<div class="r__item r__item--large">
					<div class="pull__left">
						<img src="assets/images/1.jpg" class="image__item--large">
					</div>
					<div class="r__item__inner--plus">
						<p class="center">Descrição do produto 2  Lista de itens</p>
						<a href="#" class="button-flat">Comprar</a>
					</div>
				</div>
				<div class="r__item r__item--small">
					<div class="pull__left">
						<img src="assets/images/3.jpg" class="image__item--small">
					</div>
					<div class="r__item__inner--small">
						<a href="#" class="button-flat">Comprar</a>
					</div>
				</div>
				<div class="r__item r__item--small">
					<div class="pull__left">
						<img src="assets/images/5.jpg" class="image__item--small">
					</div>
					<div class="r__item__inner--small">
						<a href="#" class="button-flat">Comprar</a>
					</div>
				</div>
				<div class="r__item r__item--small">
					<div class="pull__left">
						<img src="assets/images/5.jpg" class="image__item--small">
					</div>
					<div class="r__item__inner--small">
						<a href="#" class="button-flat">Comprar</a>
					</div>
				</div>
				<div class="r__item r__item--large">
					<div class="pull__left">
						<img src="assets/images/4.jpg" class="image__item--large">
					</div>
					<div class="r__item__inner--plus">
						<p class="center">Descrição do produto 4  Lista de itens</p>
						<a href="#" class="button-flat">Comprar</a>
					</div>
				</div>
			</div>
		</div>
    </jsp:body>
</t:genericpage>

