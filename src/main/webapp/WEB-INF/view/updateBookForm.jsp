<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
  <title>Update book</title>

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
<h2>UPDATE BOOK</h2>
<a href="${pageContext.request.contextPath}/books/list "> return </a>
<form:form action="saveBook" modelAttribute="book" method="POST">
 <table>
 <tbody>

 <tr>
 <td><label>nazwa:</label></td>
 <td><form:input path="nazwa" /></td>
 </tr>
 <tr>
 <td><label>wydawnictwo:</label></td>
 <td><form:input path="wydawnictwo" /></td>
 </tr>
 <tr>
 <td><label>cena:</label></td>
 <td><form:input path="cena" /></td>
 </tr>
 <tr>
<tr>

 <td><form:label path ="kategoria" modelAttribute = "category">Kategoria: </form:label></td>
        <td>
            <form:select path = "kategoria">
                <form:option value = "NONE" label = "Select"/>
                <form:options items = "${category}" />
            </form:select>
        </td>
  </tr>

<td><form:hidden path="id"/></td>
 </tr>
 <tr>
 <td><label></label></td>
 <td><input type="submit" value="Save" class="update" /></td>
 </tr>
 </tbody>
 </table>
</form:form>
/<!-- -wracamy do listy bez zapisu->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>

