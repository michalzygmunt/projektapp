<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
 <title>books</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
<h2>ADD AUTOR</h2>
<a href="${pageContext.request.contextPath}/books/autors "> return </a>
<form:form action="saveAutor" modelAttribute="autor" method="POST">
 <table>
 <tbody>

 <tr>
 <td><label>imie:</label></td>
 <td><form:input path="imie" /></td>
 </tr>
 <tr>
  <td><label>nazwisko:</label></td>
  <td><form:input path="nazwisko" /></td>
  </tr>
 <tr>
 <td><label></label></td>
 <td><input type="submit" value="Save" class="save" /></td>
 </tr>
 </tbody>
 </table>
</form:form>
/<!-- -wracamy do listy bez zapisu->
<p>

</p>
</body>
</html>
