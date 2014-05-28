<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:if test="${not empty param.lingua}">
    <fmt:setLocale value="${param.lingua}" scope="session"/>
</c:if>
<t:layout>
    <jsp:body>
        <div class="conteudo--interno conteudo--100 destaque titulo--cheio">
            <h1><fmt:message key="site.pedidoRealizado"/>: ${numero} </h1>
        </div>
        <div class="conteudo--interno conteudo--50 destaque">
            <h1><fmt:message key="site.informacaoProdutos"/></h1>
            <table>
                <thead>
                    <tr>
                        <th><fmt:message key="tabela.produto"/></th>
                        <th><fmt:message key="tabela.quantidade"/></th>
                        <th><fmt:message key="tabela.preco"/></th>
                        <th><fmt:message key="tabela.total"/></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="item" items="${items}">
                        <tr>
                            <td>${item.getProduto().getNome()}</td>
                            <td>${item.getQuantidade()}</td>
                            <td>${item.getProduto().getPreco()}</td>
                            <td>${item.valorTotalProduto()}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <h1><fmt:message key="site.formaPagamento"/></h1>
            <h3><b><fmt:message key="campo.${tipoPagamento}"/></b></h3>
        </div>
        <div class="conteudo--interno conteudo--50 destaque">
            <h1><fmt:message key="site.informacaoCliente"/></h1>
            <ul class="dados dados--usuario">
                <li><b><fmt:message key="campo.nome"/></b>: ${cliente.getNomeCompleto()}</li>
                <li><b><fmt:message key="campo.dataNascimento"/></b>: ${cliente.getDataNascimento()}</li>
                <li><b><fmt:message key="campo.sexo"/></b>:
                    <c:choose>
                        <c:when test="${cliente.getSexo() == 'M'}">
                            <fmt:message key="campo.masc"/>
                        </c:when>
                        <c:otherwise>
                            <fmt:message key="campo.fem"/>
                        </c:otherwise>
                    </c:choose>
                </li>
                <li><b><fmt:message key="campo.endereco"/></b>: ${cliente.getEndereco()}</li>
                <li><b><fmt:message key="campo.fone"/></b>: ${cliente.getTelefone()}</li>
                <li><b><fmt:message key="campo.email"/></b>: ${cliente.getEmail()}</li>
                <li></li>
            </ul>
        </div>		
    </jsp:body>
</t:layout>