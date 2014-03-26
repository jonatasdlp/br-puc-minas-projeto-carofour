<%@ tag description="layout base" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Supermercado - Carofour</title>
	<script type="text/javascript" src="assets/javascripts/vendor/jquery-1.11.0.js"></script>
	<script type="text/javascript" src="assets/javascripts/scripts.js"></script>
	<link type="text/css" rel="stylesheet" href="assets/stylesheets/vendor/normalize.css">
	<link type="text/css" rel="stylesheet" href="assets/stylesheets/styles.css">
</head>
<body>
 	<div id="container">
 		<div id="header">
 			<jsp:include page="/partials/header.jsp" />
		</div>
		<div class="content">
			<jsp:doBody/>
		</div>
		<div id="footer">
			<jsp:include page="/partials/footer.jsp" />
		</div>	
	</div>
</body>
</html>