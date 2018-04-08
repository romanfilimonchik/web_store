<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<script src="resources/js/button.js"></script>
<script src="resources/js/message.js"></script>
<!DOCTYPE html>

<form class="form-horizontal" action="<c:url value="/advert"/>" method="post">
    <fieldset>

        <%--<!-- Form Name -->--%>
        <div class="container">
            <h3>Create Advert.</h3>
        </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="Style">Brand</label>
                <div class="col-md-4">
                    <select id="Style" name="Style" class="form-control">

                        <option value="Renault">Renault</option>
                        <option selected value="Mazda">Mazda</option>
                        <option value="Jaguar">Jaguar</option>
                        <option value="Audi">Audi</option>
                        <option value="Jeep">Jeep</option>
                        <option value="Porsche">Porsche</option>
                        <option value="Nissan">Nissan</option>
                    </select>
                    <span class="help-block">Select the brand</span>
                </div>
            </div>



            <!-- Multiple Radios (inline) -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="Color-0">Color</label>
                <div class="col-md-4">
                    <label class="radio-inline" for="Color-0">
                        <input type="radio" name="Color" id="Color-0" value="White" checked="checked" >
                        White
                    </label>
                    <label class="radio-inline" for="Color-1">
                        <input type="radio" name="Color" id="Color-1" value="Black">
                        Black
                    </label>
                    <label class="radio-inline" for="Color-2">
                        <input type="radio" name="Color" id="Color-2" value="Grey">
                        Grey
                    </label>
                    <label class="radio-inline" for="Color-3">
                        <input type="radio" name="Color" id="Color-3" value="Red">
                        Red
                    </label>
                    <label class="radio-inline" for="Color-4">
                        <input type="radio" name="Color" id="Color-4" value="Yellow">
                        Yellow
                    </label>
                    <span class="help-block">Select the color</span>
                </div>
            </div>

            <!-- Textarea -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="Carbody">Car body</label>
                <div class="col-md-4">
                    <input id="Carbody" name="Carbody" type="text" placeholder="Carbody" value="" class="form-control input-md" required="">
                    <span class="help-block">Type the car body</span>
                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="Description">Description</label>
                <div class="col-md-4">
                    <input id="Description" name="Description" type="text" placeholder="" value="" class="form-control input form-group-lg" required="">
                        <%--<textarea class="form-control" rows="5" id="Description"></textarea>--%>
                    <span class="help-block">Type the description</span>
                </div>
            </div>
            <%--<div class="form-group">--%>
                <%--<label for="comment">Comment:</label>--%>
                <%--<textarea class="form-control" rows="5" id="comment"></textarea>--%>
            <%--</div>--%>

        <!-- Text input-->
        <%--<div class="form-group">--%>
            <%--<label class="col-md-4 control-label" for="Style">Style</label>--%>
            <%--<div class="col-md-4">--%>
                <%--<input id="Style" name="Style" type="text" value="" placeholder="Style" class="form-control input-md" required="">--%>
                <%--<span class="help-block">Type the style</span>--%>
            <%--</div>--%>
        <%--</div>--%>
<%----%>
            <%--<!-- Text input-->--%>
        <%--<div class="form-group">--%>
            <%--<label class="col-md-4 control-label" for="Carbody">Carbody</label>--%>
            <%--<div class="col-md-4">--%>
                <%--<input id="Carbody" name="Carbody" type="text" placeholder="Carbody" class="form-control input-md" required="">--%>
                <%--<span class="help-block">Type the carbody</span>--%>
<%----%>
            <%--</div>--%>
        <%--</div>--%>
<%----%>
        <%--<!-- Text input-->--%>
        <%--<div class="form-group">--%>
            <%--<label class="col-md-4 control-label" for="Color">Color</label>--%>
            <%--<div class="col-md-4">--%>
                <%--<input id="Color" name="Color" type="text" value="" placeholder="Color" class="form-control input-md" required="">--%>
                <%--<span class="help-block">Type the color</span>--%>
            <%--</div>--%>
        <%--</div>--%>
<%----%>
            <%--<!-- Price input-->--%>
            <%--<div class="form-group">--%>
                <%--<label class="col-md-4 control-label" for="Description">Description</label>--%>
                <%--<div class="col-md-4">--%>
                    <%--<input id="Description" name="Description" type="text" value="" placeholder="Description" class="form-control input-md" required="">--%>
                    <%--<span class="help-block">Type the description</span>--%>
                <%--</div>--%>
            <%--</div>--%>


            <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="singlebutton"></label>
            <div class="col-md-4">
                <button id="singlebutton" name="singlebutton" class="btn btn-success">Submit</button>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <p class="text-danger">
                <span id="answerText2">
                <c:if test="${answer!=null}">
                    <c:out value="${answer}"/>
                </c:if>
                </span>
                </p>
            </div>
        </div>
        <%--<script>--%>
<%--//            jQuery(document).ready(function() {--%>
<%--//                $('answer').val('');--%>
<%--//            });--%>
        <%--</script>--%>
    </fieldset>
</form>
