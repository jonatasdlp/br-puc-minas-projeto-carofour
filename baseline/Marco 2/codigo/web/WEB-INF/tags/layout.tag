<%@ tag description="layout base" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supermercado - Carofour</title>
        <script type="text/javascript" src="assets/js/vendor/jquery-1.11.0.js"></script>
        <script type="text/javascript" src="assets/js/vendor/meiomask.js"></script>
        <script type="text/javascript" src="assets/js/vendor/jquery-ui-1.10.4.custom.js" ></script>
        <script type="text/javascript" src="assets/js/vendor/jquery.validate.js"></script>
        <script type="text/javascript" src="assets/js/scripts.js"></script>
        <link type="text/css" rel="stylesheet" href="assets/css/styles.css">
        <link type="text/css" rel="stylesheet" href="assets/css/vendor/jquery-ui-1.10.4.custom.css"/>
    </head>
    <body>
        <div id="corpo">
            <div id="cabecalho">
                <jsp:include page="/partials/header.jsp" />
            </div>
            <div class="conteudo">
                <jsp:doBody/>
            </div>
            <div id="rodape">
                <jsp:include page="/partials/footer.jsp" />
            </div>	
        </div>
    </body>
</html>