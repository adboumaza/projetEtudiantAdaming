<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${client}" var="cl">
		<table>
			<tr>
				<td>${cl.idClient}</td>
				<td>${cl.nomClient}</td>
				<td>${cl.prenomClient}</td>
				<td>${cl.ageClient}</td>
			</tr>
		</table>
	</c:forEach>
	
	<a href="adaming">go to page voiture</a>
</body>
</html>