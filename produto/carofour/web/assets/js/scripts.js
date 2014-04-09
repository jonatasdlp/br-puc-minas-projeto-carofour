$(function(){
	redirecionarCategoria();
	mostrarCategoria();
	adicionarItems();
	marcarProduto();
	adicionarItem();
	ativarTabela();
	atualizarItem();
	removeItem();
	removeItems();
	redirectHome();
	selecionarPagamento();
	aplicarMascaras();
});

$( document ).ajaxComplete(function() {
	atualizarItem();
	removeItem();
	removeItems();
});

function redirecionarCategoria() {
	$( ".categoria--principal img" ).on( "click", function() {
		window.location.href = $( this ).data( "url" );
		return false;
	});
}

function mostrarCategoria() {
	$( ".selecao" ).on( "click", function(){
		resetarCategorias();
		ativarCategoria($( this ).data( "action" ));
		$( this ).css("background-color", "#27ae60");
	});
}

function ativarCategoria(element) {
	$( element ).addClass( "ativo" );
	$( element ).removeClass( "inativo" );
}

function resetarCategorias() {
	$( ".produtos" ).each( function() {
		$( this ).addClass( "inativo" );
		$( this ).removeClass( "ativo" );
	});
	
	$( ".selecao" ).each( function() {
		$( this ).removeAttr( "style" );
	});
}

function adicionarItems() {
	$( "#submit" ).on( "click", function(){
		$( ".ativo form" ).submit();
	});
}

function adicionarItem() {
	$( ".acao" ).on( "click", function(){
		$("input[type=hidden]").each(function() {
			$( this ).removeAttr( "value" );
		});
		var element = $( this ).parent().find( ".inputs" );
		var input = element.find( "input[type=hidden]" );
		input.val( input.data( "value") );
		$( this ).closest( "form" ).submit();
	});
}

function marcarProduto() {
	$( ".check" ).on( "click", function(){
		var element = $( this ).prev();
		var value = element.data( "value" );
		if($( this ).is(":checked")) {
			element.val(value);
		} else {
			element.removeAttr("value");
		}
	});
}

function ativarTabela() {
	if($( ".produtos" ).length) {
		var pageUrlParam = decodeURIComponent(window.location.search).substring(1);
		var value = pageUrlParam.split("=")[1];
		var element = "#" + value; 
		var selecao = $(".selecao[data-action=" + element + "]");
		$( element ).addClass( "ativo" );
		selecao.css("background-color", "#27ae60");
	}
}

function atualizarItem() {
	$( ".atualiza" ).on( "click", function() {
		var element = $( this ).parent();
		var url = element.data( "url" );
		var qtd = element.parents().find( "input[type=number]:last" ).val();
		var produto = element.data( "item" );
		url += "?produto=" + produto + "&quantidade=" + qtd;
		$.ajax({
		    url: url,
		    type: 'PUT',
		    dataType: 'html',
		    success: function(result) {
		    	window.location.replace("/carofour/compras");
		    }
		});
	});
}

function removeItem() {
	$( ".remove" ).on( "click", function() {
		var element = $( this ).parent();
		var url = element.data( "url" ) + "?produto=" + element.data( "item" );
		$.ajax({
		    url: url,
		    type: 'DELETE',
		    success: function(data) {
		    	$(".compras").replaceWith(data);
		    }
		});
	});
}

function removeItems() {
	$( "#removeItems" ).on( "click", function() {
		var element = $( this ).parent();
		var url = element.data( "url" );
		$.ajax({
		    url: url,
		    type: 'DELETE',
		    success: function(data) {
		    	$(".compras").replaceWith(data);
		    }
		});
	});
}

function redirectHome() {
	$( "#logo" ).on( "click", function() {
		window.location = "/carofour/index"; 
	});
}

function selecionarPagamento() {
	$( ".formulario--dados select" ).on( "click", function() {
		$( "#vazio" ).remove();
	});
}

function aplicarMascaras() {
	$('input[data-mask]').each(function() {
	    var input = $(this);
	    input.setMask(input.data('mask'));
	});
}

function validaFormularioCliente() {
	// TODO validações
}