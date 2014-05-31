<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:if test="${not empty param.lingua}">
    <fmt:setLocale value="${param.lingua}" scope="session"/>
</c:if>
<div class="compras">
    <c:choose>
        <c:when test="${!items.isEmpty()}">
            <table>
                <thead>
                    <tr>
                        <th></th>
                        <th><fmt:message key="tabela.nome"/></th>
                        <th><fmt:message key="tabela.quantidade"/></th>
                        <th><fmt:message key="tabela.preco"/> (R$)</th>
                        <th><fmt:message key="tabela.acao"/></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="item" items="${items}">
                        <tr>
                            <td class="produto--img">
                                <div class="produto">
                                    <img alt="${item.produto.getNome()}"
                                         src="${item.produto.getEnderecoImagem()}">
                                </div>
                            </td>
                            <td>${item.produto.getNome()}- ${item.produto.getDescricao()}</td>
                            <td><input type="number" value="${item.getQuantidade()}" name="quantidade" class="quantidade"></td>
                            <td>${item.valorTotalProduto()}</td>
                            <td data-item="${item.produto.getId()}">
                                <a href="#"class="atualiza" data-url="atualizarProduto"><fmt:message key="item.atualizar"/></a> | 
                                <a href="#" class="remove" data-url="removerProduto"><fmt:message key="item.remover"/></a>
                            </td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td colspan="3"></td>
                        <td colspan="2">
                            <h5><fmt:message key="site.subTotal"/>: R$ ${subtotal}</h5>
                        </td>
                    <tr>
                </tbody>
            </table>
        </c:when>
        <c:otherwise>
            <h5><fmt:message key="site.carrinhoVazio"/>!</h5>
        </c:otherwise>
    </c:choose>
</div>