

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../component/setupCss.jsp" %>
    </head>
    <body>
        <!--Header-->
        <%@include file="../component/header.jsp" %>
        <!--Header-->

        <!-- food section -->

        <section class="food_section layout_padding">
            <div class="container">
                <div class="heading_container heading_center">
                    <h2 style="font-family: sans-serif; margin: 15px;">
                        Menu film
                    </h2>
                </div>
                <form method="get" action="menu" class=row>
                    <div class="col-md-4">

                    </div>
                    <div class="col-md-3">
                        <input type="text"  class="form-control" name="name" value="${param["name"]}">
                    </div>
                    <div class="col-md-3">
                        <input type="submit" value="Seach" class="btn btn-primary">
                    </div>
                    <div class="col-md-2">

                    </div>
                </form>
                <ul class="filters_menu">
                    <li class="active" data-filter="*">All</li>
                        <c:forEach items="${requestScope.genres}" var="g">
                        <li data-filter=".${g.name}">${g.name}</li>
                        </c:forEach>

                </ul>

                <div class="filters-content">
                    <div class="row grid">
                        <c:forEach items="${requestScope.films}" var="f">
                            <div class="col-sm-6 col-lg-4 all ${f.genres.name}">
                                <div class="box" style="box-shadow:  0 0 5px 5px lightgray; ">
                                    <div>
                                        <div class="img-box" style="height: 400px !important; border-radius: 0px !important;">
                                            <img src="view/images/${f.image}" alt="" height="100%" style="max-height: none;">
                                        </div>
                                        <div class="detail-box" style="background: #f1f2f3; ">
                                            <h5 style="text-transform: uppercase; text-align: center;">
                                                <a href="film?film=${f.filmId}" class="" style="color: black; text-decoration: none">
                                                    ${f.title} <br>Time: ${f.time} minute
                                                </a>
                                            </h5>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>

        </section>

        <!-- end food section -->

        <!--Footer->
        <%@include file="../component/footer.jsp" %>
        <!--Footer-->

        <!--Script-->
        <%@include file="../component/setupJS.jsp" %>
        <!--Script-->
    </body>
</html>
