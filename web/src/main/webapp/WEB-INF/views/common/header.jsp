<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>AutoSales</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="<c:url value="/homePage"/>">Auto Land</a>
        </div>
        <ul class="nav navbar-nav">
                <c:choose>
                <c:when test="${user == null}">
                    <li><a href="<c:url value="/login"/>">Create advert</a></li></c:when>
                <c:otherwise>
                <li><a href="<c:url value="/advert"/>">Create advert</a>
                    </c:otherwise>
                    </c:choose>

                <c:choose>
                <c:when test="${user == null}">
                <li><a href="<c:url value="/login"/>">List of Users</a></li></c:when>
                    <c:otherwise>
                <li><a href="<c:url value="/showusers"/>">List of Users</a>
                    </c:otherwise>
                    </c:choose>
            <li><a href="<c:url value="/contacts"/>">Contacts</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <%--<li><a href="<c:url value="/signup"/>"><span class="glyphicon glyphicon-user"></span>Sign Up</a></li>--%>
                <c:choose>
                <c:when test="${user == null}">
                <li><a href="<c:url value="/signup"/>"><span class="glyphicon glyphicon-send"></span>Sign Up</a></c:when>
                    <c:otherwise>
                <li><a href="<c:url value="/index"/>"><span class="glyphicon glyphicon-user"></span>Profile</a>
                    </c:otherwise>
                    </c:choose>
                <c:choose>
                    <c:when test="${user == null}">
            <li><a href="<c:url value="/login"/>"><span class="glyphicon glyphicon-log-in"></span>Login</a></c:when>
                    <c:otherwise>
            <li><a href="<c:url value="/logout"/>"><span class="glyphicon glyphicon-log-out"></span>Exit</a>
                    </c:otherwise>
                </c:choose>
            </li>
        </ul>
    </div>
</nav>

<%--<div class="container">--%>
    <%--<h3>Auto Sales Word.</h3>--%>
<%--</div>--%>

</body>
</html>