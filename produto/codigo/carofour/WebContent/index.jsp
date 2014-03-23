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
				 	<img src="assets/images/carofour.png" class="image__item--plus">
				 	<br></br>
				 	Supermercado Carofour oferece soluções eficientes e inovadoras, cuidando sempre dos pequenos detalhes, de modo a deixar a sua compra mais fácil e gostosa. Tem tudo o que o que você precisa com qualidade e oferece um atendimento do jeito que você gosta. Carofour: "lugar de gente feliz". 
				 	<br />
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
						<p class="center">Laticínios - Toda linha de queijos e massas a sua escolha!</p>
						<a href="#" class="button-flat pull__left">Comprar</a>
					</div>
				</div>
				<div class="r__item r__item--large">
					<div class="pull__left">
						<img src="assets/images/1.jpg" class="image__item--large">
					</div>
					<div class="r__item__inner--plus">
						<p class="center">Padaria - Massas gostosas e saborosas a sua disposição! </p>
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
						<img src="assets/images/6.jpg" class="image__item--small">
					</div>
					<div class="r__item__inner--small">
						<a href="#" class="button-flat">Comprar</a>
					</div>
				</div>
				<div class="r__item r__item--small">
					<div class="pull__left">
						<img src="assets/images/7.jpg" class="image__item--small">
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
						<p class="center">HortiFruti - Produtos fresquinhos todos os dias.  
							Frutas, verduras, legumes!</p>
						<a href="#" class="button-flat">Comprar</a>
					</div>
				</div>
			</div>
		</div>
    </jsp:body>
</t:genericpage>

