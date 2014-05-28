<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<t:layout>
    <jsp:body>
        <div class="conteudo--interno conteudo--25 destaque">
            <h1><fmt:message key="site.categorias"/></h1>
            <div class="categorias">
                <ul>
                    <c:forEach var="categoria" items="${categorias}">
                        <li class="selecao" data-url="categorias?id=${categoria.getId()}" data-categoria="categoria${categoria.getId()}">
                            <img alt="${categora.getNome}" src="${categoria.getUrlImagem()}">
                            <div class="categoria--nome">
                                <b>${categoria.getNome()}</b>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <div class="conteudo--interno conteudo--75 destaque">
            <h1 id="tituloCategoria"><fmt:message key="site.produtosCategoria"/></h1>
            <div class="produtos" data-categoria="categoria${categoria.getId()}">
                <c:choose>
                    <c:when test="${produtos != null}">
                        <div class="acoes">
                            <ul class="horizontal direita">
                                <li><a href="compras" class="botao"><fmt:message key="site.carrinho"/></a></li>
                                <li><a href="#" class="botao" id="submit"><fmt:message key="site.comprar"/></a></li>
                                    <c:if test="${items != null}">
                                    <li><a href="finalizar" class="botao"><fmt:message key="site.fecharCompra"/></a></li>
                                    </c:if>
                            </ul>
                        </div>
                        <form action="adicionarProdutos" method="POST">
                            <table>
                                <thead>
                                    <tr>
                                        <th></th>
                                        <th><fmt:message key="tabela.nome"/></th>
                                        <th><fmt:message key="tabela.preco"/> (R$)</th>
                                        <th><fmt:message key="tabela.acao"/></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="produto" items="${produtos}">
                                        <tr>
                                            <td class="inputs">
                                                <input type="hidden" name="produtos" data-value="${produto.getId()}">
                                                <input type="checkbox" class="check">
                                            </td>
                                            <td>${produto.getNome()} - ${produto.getDescricao()}</td>
                                            <td>${produto.getPreco()}</td>
                                            <td class="acao" ><fmt:message key="item.comprar"/></td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </form>
                    </c:when>
                    <c:otherwise>
                        <h5><fmt:message key="site.categoria.naoEncontrada"/></h5>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </jsp:body>
</t:layout>

