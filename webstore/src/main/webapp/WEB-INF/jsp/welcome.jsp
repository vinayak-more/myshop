<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"></c:url>">
<title>Welcome to webstore</title>
</head>
<title>Welcome</title>
<body>
	<section>
	<div class="jumbotron">
		<div class="container">
			<h1>${greeting}</h1>
			<p>${tagline}</p>
		</div>
	</div>
	</section>
</body>
</html>