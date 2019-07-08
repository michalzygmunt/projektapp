<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
 <title>books</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>

<a href="${pageContext.request.contextPath}/books/categories "> return </a>
<form:form action="saveCategory" modelAttribute="category" method="GET">
 <c:forEach var="categories" items="${categories}" >
    <h2>USUNALES KATEGORIE</h2>
    <table>
        <tr>
            <td>nazwa :</td>
            <td>${category.nazwa}</td>

    </table>
     </c:forEach>

     </form:form>

     <form:form action="saveCategory" modelAttribute="category" method="GET">

     </form:form>
</body>
</html>

