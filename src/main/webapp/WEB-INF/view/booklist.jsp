<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>List books</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
 <h2>Books:</h2>
 <div>
 <table class="table table-striped table-bordered table-sm">
 <tr>
 <th>ajdi</th>
 <th>Nazwa</th>
 <th>Wydawnictwo</th>
 <th>Cena</th>
 <th>Kategoria</th>
 </tr>
 <c:forEach var="books" items="${books}" >
 <c:url var="update" value="/books/updateBookForm">
     <c:param name="bookId" value="${books.id}"/>
    </c:url>
    <c:url var="delete" value="/books/deleteBookFormularz">
        <c:param name="bookId" value="${books.id}"/>
       </c:url>

 <tr>

 <td>${books.id}</td>
 <td>${books.nazwa}</td>
 <td>${books.wydawnictwo}</td>
 <td>${books.cena}</td>
 <td>${books.kategoria.nazwa}</td>
 <td><a href="${update}" >update</a> </td>
 <td><a href="${delete}" >delete</a> </td>
 </tr>

 </c:forEach>
 </table>
 </div>
</body>
</html>

<div>
 <input type="button" class="btn btn-primaty" value="Add Book"
 onclick="window.location.href='/projektapp/books/formadd';return false;" />
 </div>

