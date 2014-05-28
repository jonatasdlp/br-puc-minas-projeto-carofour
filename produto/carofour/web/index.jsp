<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:if test="${not empty param.lingua}">
    <fmt:setLocale value="${param.lingua}" scope="session"/>
</c:if>
<t:layout>
    <jsp:body>
        <div class="conteudo--interno conteudo--50 destaque">
            <h1><fmt:message key="site.saudacao"/></h1>
            <img alt="produto" src="assets/images/logo-principal.png" class="logo--principal">
            <p>
                <fmt:message key="site.texto"/>
            </p>
        </div>
        <div class="conteudo--interno conteudo--50">
            <c:forEach var="categoria" items="${categorias}">
                <div class="categoria--principal">
                    <img alt="${categoria.getNome()}" src="${categoria.getUrlImagem()}" data-url="categorias?id=${categoria.getId()}">
                </div>
            </c:forEach>
        </div>
    </jsp:body>
</t:layout>

