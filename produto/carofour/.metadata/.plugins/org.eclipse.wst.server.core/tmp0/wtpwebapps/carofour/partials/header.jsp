<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:if test="${not empty param.lingua}">
    <fmt:setLocale value="${param.lingua}" scope="session"/>
</c:if>
<div id="logo">
    <img alt="logo" src="assets/images/logo-big.png">
</div>
<div id="idiomas">
    <ul class="horizontal">
        <li><a href="index?lingua=pt_BR"><fmt:message key="lingua.pt"/></a></li>
        <li>|</li>
        <li><a href="index?lingua=es_ES"><fmt:message key="lingua.es"/></a></li>
    </ul>
</div>
