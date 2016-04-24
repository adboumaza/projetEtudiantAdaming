<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
page voiture
<c:forEach items="${voiture}" var="v">
${v.idVoiture}
${v.nomVoiture}
</c:forEach>
<a href="index">return to index</a>
</body>
</html>