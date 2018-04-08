<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>List of Adverts.</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h3>All adverts.</h3>
    <p>Current user: ${user.login} ${user.email}</p>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Style</th>
            <th>Car body</th>
            <th>Color</th>
            <th>Description</th>
            <th>User_id</th>
        </tr>
        </thead>
        <c:forEach items="${adverts}" var="advert">
            <tbody>
            <tr>
                <td> ${advert.id} </td>
                <td> ${advert.carbody}</td>
                <td> ${advert.color}</td>
                <td> ${advert.description}</td>
                <td> ${advert.style}</td>
                <%--<td> ${advert.user_id}</td>--%>
            </tr>
            </tbody>
        </c:forEach>
    </table>
</div>
</body>
</html>