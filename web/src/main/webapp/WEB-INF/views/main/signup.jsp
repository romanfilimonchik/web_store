<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<script src="resources/js/button.js"></script>
<script src="resources/js/message.js"></script>

<!DOCTYPE html>

<form class="form-horizontal" action="<c:url value="/signup"/>" method="post">
    <fieldset>

        <%--<!-- Form Name -->--%>
            <div class="container">
            <h3>Registration.</h3>
            </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="Login">Login</label>
            <div class="col-md-4">
                <input id="Login" name="Login" type="text" value="" placeholder="Login" class="form-control input-md" required="">
                <span class="help-block">Type the login</span>
            </div>
        </div>

        <!-- Password input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="Password">Password</label>
            <div class="col-md-4">
                <input id="Password" name="Password" type="Password" placeholder="********" class="form-control input-md" required="">
                <span class="help-block">Type the password (at least 6 characters)</span>

            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="Email">E-mail</label>
            <div class="col-md-4">
                <input id="Email" name="Email" type="text" value="" placeholder="Email" class="form-control input-md" required="">
                <span class="help-block">Type the email</span>
            </div>
        </div>

        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="singlebutton"></label>
            <div class="col-md-4">
                <button id="singlebutton" name="singlebutton" class="btn btn-success">Submit</button>
                <%--<input type="submit" onclick="this.disabled=true;">--%>
            </div>
        </div>

            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <p class="text-danger">
                <span id="answerText">
                <c:if test="${answer!=null}">
                    <c:out value="${answer}"/>
                </c:if>
                </span>
                    </p>
                </div>
            </div>
            <%--<script>--%>
                <%--jQuery(document).ready(function() {--%>
                    <%--$('answer').val('');--%>
                <%--});--%>
<%--//            </script>--%>
    </fieldset>
</form>
