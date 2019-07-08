<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>Category list</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
 <h2>Categories:</h2>
 <div>
 <table class="table table-sm">
 <tr>
 <th>ajdi</th>
 <th>Nazwa</th>
 </tr>
 <c:forEach var="categories" items="${categories}" >
 <c:url var="update" value="/books/updateCategoryForm">
     <c:param name="categoryId" value="${categories.id}"/>
    </c:url>
    <c:url var="delete" value="/books/deleteCategoryForm">
        <c:param name="categoryId" value="${categories.id}"/>
       </c:url>

 <tr>
 <td>${categories.id}</td>
 <td>${categories.nazwa}</td>

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
 <input type="button" value="Add Category"
 onclick="window.location.href='formcategoryadd';return false;" />
 </div>