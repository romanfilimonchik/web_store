<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>All users table.</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h3>All users.</h3>
    <p>Current user: ${user.login} ${user.email}</p>
<table class="table table-striped">
    <thead>
    <tr>
        <th>ID</th>
        <th>Login</th>
        <th>Password</th>
        <th>Email</th>
    </tr>
    </thead>
<c:forEach items="${users}" var="user">
    <tbody>
    <tr>
        <td> ${user.id} </td>
        <td> ${user.login}</td>
        <td> ${user.password}</td>
        <td> ${user.email}</td>
    </tr>
    </tbody>
</c:forEach>
</table>
</div>
</body>
</html>

























<%--<legend>Все пользователи</legend>--%>
<%--<div class="row">--%>
    <%--<div class=col-md-3>ID</div>--%>
    <%--<div class=col-md-3>Name</div>--%>
    <%--<div class=col-md-3>Password</div>--%>
    <%--<div class=col-md-3>Email</div>--%>
<%--</div>--%>
<%--<br>--%>
<%--<c:forEach items="${usersList}" var="user">--%>
    <%--<br />--%>
    <%--<div class="row">--%>
        <%--<div class="col-md-3">${user.id} </div>--%>
        <%--<div class="col-md-3">${user.login}</div>--%>
        <%--<div class="col-md-3">${user.password}</div>--%>
        <%--<div class="col-md-3">${user.email}</div>--%>
    <%--</div>--%>
<%--</c:forEach>--%>