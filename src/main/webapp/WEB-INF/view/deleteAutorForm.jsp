<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
 <title>books</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>

<a href="${pageContext.request.contextPath}/books/autors "> return </a>
<form:form action="saveAutor" modelAttribute="autor" method="GET">
 <c:forEach var="utors" items="${autors}" >
    <h2>usunales autora kolzeko</h2>
    <table>
        <tr>
            <td>nimie :</td>
            <td>${autor.imie}</td>
            <td>nazwisko :</td>
            <td>${autor.nazwisko}</td>

    </table>
     </c:forEach>

     </form:form>

     <form:form action="saveCategory" modelAttribute="category" method="GET">

     </form:form>
</body>
</html>

