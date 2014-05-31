$(function() {
    redirecionarCategoria();
    alterarCategoria();
    adicionarItems();
    marcarProduto();
    adicionarItem();
    atualizarItem();
    removeItem();
    removeItems();
    redirectHome();
    selecionarPagamento();
    aplicarMascaras();
    habilitaBotaoComprar();
    validaQuantidade();
    formularioCliente();
});

$(document).ajaxComplete(function() {
    removeItem();
    atualizarItem();
    habilitaAcaoCompras();
    validaQuantidade();
});

function redirecionarCategoria() {
    $(".categoria--principal img").on("click", function() {
        window.location.href = $(this).data("url");
        return false;
    });
}

function alterarCategoria() {
    $(".selecao").on("click", function() {
        window.location.href = $(this).data("url");
        return false;
    });

    $(".selecao").each(function() {
        if ($(this).data("categoria") === $(".produtos").data("categoria"))
            $(this).css("background-color", "#27ae60");
    });
}

function adicionarItems() {
    $("#submit").on("click", function() {
        $("form").submit();
    });
}

function adicionarItem() {
    $(".acao").on("click", function() {
        $("input[type=hidden]").each(function() {
            $(this).removeAttr("value");
        });
        var element = $(this).parent().find(".inputs");
        var input = element.find("input[type=hidden]");
        input.val(input.data("value"));
        $(this).closest("form").submit();
    });
}

function marcarProduto() {
    $(".check").on("click", function() {
        var element = $(this).prev();
        var value = element.data("value");
        if ($(this).is(":checked")) {
            element.val(value);
        } else {
            element.removeAttr("value");
        }
    });
}

function ativarTabela() {
    if ($(".produtos").length) {
        var pageUrlParam = decodeURIComponent(window.location.search).substring(1);
        var value = pageUrlParam.split("=")[1];
        var element = "#" + value;
        var selecao = $(".selecao[data-action=" + element + "]");
        $(element).addClass("ativo");
        selecao.css("background-color", "#27ae60");
    }
}

function atualizarItem() {
    $(".atualiza").on("click", function() {
        var element = $(this).parent();
        var url = $(this).data("url");
        var qtd = element.parents().find("input[type=number]:last").val();
        var produto = element.data("item");
        url += "?produto=" + produto + "&quantidade=" + qtd;
        $.ajax({
            url: url,
            type: 'GET',
            dataType: 'html',
            success: function(data) {
                $(".compras").replaceWith(data);
            }
        });
    });
}

function removeItem() {
    $(".remove").on("click", function() {
        var element = $(this).parent();
        var url = $(this).data("url") + "?produto=" + element.data("item");
        $.ajax({
            url: url,
            type: 'GET',
            success: function(data) {
                $(".compras").replaceWith(data);
            }
        });
    });
}

function removeItems() {
    $("#removeItems").on("click", function() {
        var url = $(this).data("url");
        $.ajax({
            url: url,
            type: 'GET',
            success: function(data) {
                $(".compras").replaceWith(data);
            }
        });
    });
}

function redirectHome() {
    $("#logo").on("click", function() {
        window.location = "index";
    });
}

function selecionarPagamento() {
    $(".formulario--dados select").on("click", function() {
        $("#vazio").remove();
    });
}

function aplicarMascaras() {
    $("input[data-mask]").each(function() {
        var input = $(this);
        input.setMask(input.data("mask"));
    });
}

function habilitaBotaoComprar() {
    $("#submit").css("display", "none");

    $(".check").on("click", function() {
        var checked = false;

        $(".check").each(function() {
            if ($(this).is(":checked")) {
                $("#submit").css("display", "initial");
                checked = true;
            }
        });

        if (!checked)
            $("#submit").css("display", "none");
    });
}

function habilitaAcaoCompras() {
    if (!$(".compras table").length) {
        $("#removeItems").css("display", "none");
        $("#fecharCompra").css("display", "none");
    }
}

function validaQuantidade() {
    $(".quantidade").on("click", function() {
       if ($(this).val() < 1)
           $(this).val(1);
    });
}

function formularioCliente() {
   $("#nascimento").datepicker();
}