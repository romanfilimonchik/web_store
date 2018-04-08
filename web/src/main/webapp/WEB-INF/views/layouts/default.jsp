<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
    <tiles:insertAttribute name="header"/>
</head>
<body>
<div id="container">
    <tiles:insertAttribute name="body"/>
    <tiles:insertAttribute name="content"/>
    <tiles:insertAttribute name="footer"/>
</div>
</body>
</html>
