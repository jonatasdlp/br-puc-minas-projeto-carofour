<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:if test="${not empty param.lingua}">
    <fmt:setLocale value="${param.lingua}" scope="session"/>
</c:if>
<t:layout>
    <jsp:body>		
        <form action="finalizar" method="POST" id="formCadastro">
            <div class="conteudo--interno conteudo--50 destaque">
                <h1><fmt:message key="site.dadosPessoais"/></h1>			
                <div class="formulario--dados">
                    <input type="text" name="nome" class="texto--formulario" placeholder="<fmt:message key="campo.nome"/>" required>
                </div>
                <div class="formulario--dados">
                    <input type="text" name="nascimento" id="nascimento" class="texto--formulario" placeholder="<fmt:message key="campo.dataNascimento"/>" required>
                </div>
                <div class="formulario--dados input-radio align-left">
                    <input type="radio" name="sexo" value="m" checked><fmt:message key="campo.masc"/>
                    <br>
                    <input type="radio" name="sexo" value="f"><fmt:message key="campo.fem"/>
                </div>
                <div class="formulario--dados">
                    <input type="text" name="endereco" class="texto--formulario" placeholder="<fmt:message key="campo.endereco"/>" required>
                </div>
                <div class="formulario--dados">
                    <input type="text" name="telefone" data-mask="phone" class="texto--formulario" placeholder="<fmt:message key="campo.telefone"/>" required>
                </div>
                <div class="formulario--dados">
                    <input type="text" name="email" class="texto--formulario" placeholder="<fmt:message key="campo.email"/>" required>
                </div>
                <div class="formulario--dados">
                    <input type="password" name="senha" class="texto--formulario" placeholder="<fmt:message key="campo.senha"/>" required>
                </div>
                <div class="formulario--dados">
                    <input type="submit" class="botao direita" value="<fmt:message key="botao.enviar"/>">
                </div>
            </div>
            <div class="conteudo--interno conteudo--50 destaque">
                <h1><fmt:message key="site.formaPagamento"/></h1>			
                <div class="formulario--dados">
                    <select id="selecao--formulario" name="tipoPagamento" required>
                        <option value="credito"><fmt:message key="campo.boleto"/></option>
                        <option value="boleto" selected><fmt:message key="campo.credito"/></option>
                    </select> 
                </div>
                <h1><fmt:message key="site.dadosCompra"/></h1>			
                <div class="formulario--dados">
                    <h3><fmt:message key="site.valorTotalCompra"/>:</h3>
                    <h3> R$ ${subtotal} + <fmt:message key="site.frete"/> </h3>
                </div>	
            </div>
        </form>	
    </jsp:body>
</t:layout>
