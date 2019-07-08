<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
 <title>books</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
<h2>ADD CATEGORY</h2>
<a href="${pageContext.request.contextPath}/books/categories "> return </a>
<form:form action="saveCategory" modelAttribute="category" method="POST">
 <table>
 <tbody>

 <tr>
 <td><label>nazwa:</label></td>
 <td><form:input path="nazwa" /></td>
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
