<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>Autors list</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
 <h2>Autors:</h2>
 <div>
 <table class ="table table-sm">
 <tr>
 <th>ajdi</th>
 <th>Imie</th>
 <th>Nazwisko</th>

 </tr>
 <c:forEach var="autors" items="${autors}" >
 <c:url var="update" value="/books/updateAutorForm">
     <c:param name="autorId" value="${autors.id}"/>
    </c:url>
    <c:url var="delete" value="/books/deleteAutorForm">
        <c:param name="autorId" value="${autors.id}"/>
       </c:url>

 <tr>

 <td>${autors.id}</td>
 <td>${autors.imie}</td>
  <td>${autors.nazwisko}</td>

 <td><a href="${update}" >update</a> </td>
 <td><a href="${delete}" >delete</a> </td>
 </tr>

 </c:forEach>
 </table>
 </div>
</body>
</html>

<div>
 <input type="button" value="Add Autor"
 onclick="window.location.href='/books/formautoradd';return false;" />
 </div>

