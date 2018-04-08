<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h3>Welcome to auto sales world.</h3>
    <p>Around 3000 adverts and 1000 active users. Join to us.</p>

    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class=""></li>
            <li data-target="#myCarousel" data-slide-to="1" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="2" class=""></li>
        </ol>
        <div class="carousel-inner" role="listbox">
            <div class="item">
                <img class="first-slide" src="/resources/images/car1.jpg" alt="First slide">
                <div class="container">
                    <div class="carousel-caption">
                        <h1>Fast.</h1>
                        <p>Place an advert in one click.</p>
                        <p><a class="btn btn-lg btn-primary" href="<c:url value="/signup"/>" role="button">Sign up</a></p>
                    </div>
                </div>
            </div>
            <div class="item active">
                <img class="second-slide" src="/resources/images/car2.png" alt="Second slide">
                <div class="container">
                    <div class="carousel-caption">
                        <h1>Safely.</h1>
                        <p>All data secure.</p>
                        <p><a class="btn btn-lg btn-primary" href="<c:url value="/signup"/>" role="button">Sign up</a></p>
                    </div>
                </div>
            </div>
            <div class="item">
                <img class="third-slide" src="/resources/images/car3.png" alt="Third slide">
                <div class="container">
                    <div class="carousel-caption">
                        <h1>Qualitatively.</h1>
                        <p>Quality assistance in car sales.</p>
                        <p><a class="btn btn-lg btn-primary" href="<c:url value="/signup"/>" role="button">Sign up</a></p>
                    </div>
                </div>
            </div>
        </div>
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>
</body>
</html>