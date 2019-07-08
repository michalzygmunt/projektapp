<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
 <title>books</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>

<a href="${pageContext.request.contextPath}/books/list "> return </a>
<form:form action="saveBook" modelAttribute="book" method="GET">
 <c:forEach var="books" items="${books}" >
    <h2>USUNALES KSIAZKE KOLEZKO</h2>
    <table>
        <tr>
            <td>nazwa :</td>
            <td>${book.nazwa}</td>
        </tr>
        <tr>
            <td>wydawnictwo :</td>
            <td>${book.wydawnictwo}</td>
        </tr>
        <tr>
            <td>cena :</td>
            <td>${book.cena}</td>
        </tr>
        <tr>
                    <td>kategoria :</td>
                    <td>${book.kategoria.nazwa}</td>
                </tr>
    </table>
     </c:forEach>

     </form:form>

     <form:form action="saveBook" modelAttribute="book" method="GET">

     </form:form>
</body>
</html>


