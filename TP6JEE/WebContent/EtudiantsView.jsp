<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="controleur" method="post" >
 <input type="text" name="motCle" value="${modele.motCle}">
 <input type="submit" value="OK">
 </form>
 <table border="1" width="80%">
 <tr>
 <th>CIN</th> <th>Nom</th> <th>Prenom</th>
 </tr>
 <c:forEach items="${modele.etudiants}" var="e">
 <tr>
 <td>${e.CIN}</td>
 <td>${e.Nom}</td>
 <td>${e.Prenom}</td>
 </tr>
 </c:forEach>
 </table>
</body>
</html>