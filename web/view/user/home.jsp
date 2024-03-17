<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <!-- Basic -->
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <!-- Site Metas -->
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <link rel="shortcut icon" href="images/161-1616544_popcorn-icon-cinema-flat-icon-png.png" type="">
 <!-- T?i Bootstrap CSS t? CDN -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
        <title> Cinema Ticket </title>
        <!-- bootstrap core css -->
        <%@include file="../component/setupCss.jsp" %>
        <style>
            .icon:hover{
                font-size: 18px
            }

 .detail-box {
        display: flex;
        align-items: center;
    }

    .caption {
        margin-left: 20px;
    }
        </style>
    </head>

    <body>
        <div class="hero_area">
            <div class="bg-box">
                <img src="view/images/cinema.jpg" alt="">
            </div>
            <!-- header section strats -->
            <%@include file="../component/header.jsp" %>
            <!-- end header section -->
            <!-- slider section -->
           

<!--   view/images/lol.jpg
   view/images/11005_103_100002.jpg
   view/images/10773_103_100006.jpg-->


<section class="slider_section">
    <div id="customCarousel1" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <div class="container">
                    <div class="row">
                        <div class="col-md-10 col-lg-8">
                            <div class="detail-box">
                                <img src="view/images/lol.jpg" alt="Image 1">
                                <div class="caption">
                                    <h3>Leaguage of legends</h3>
                                    <h2>Comming soon</h2>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <div class="container">
                    <div class="row">
                        <div class="col-md-7 col-lg-6">
                            <div class="detail-box">
                                <img src="view/images/11005_103_100002.jpg" alt="Image 2">
                                <div class="caption">
                                     <h3>When we 25</h3>
                                    <h2>Comming soon</h2>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <div class="container">
                    <div class="row">
                        <div class="col-md-7 col-lg-6">
                            <div class="detail-box">
                                <img src="view/images/10773_103_100006.jpg" alt="Image 3">
                                <div class="caption">
                                     <h3>ANT MAN</h3>
                                    <h2>Comming soon</h2>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <a class="carousel-control-prev" href="#customCarousel1" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#customCarousel1" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</section>





            <!-- end slider section -->
        </div>
        <!-- end offer section -->

        <!--Viewer-->
        <section class="food_section layout_padding-bottom">
            <div class="container">
                <div class="heading_container heading_center">
                    <h2 style="font-family: sans-serif; margin: 15px;">Lastest Movie</h2>
                </div>

                <!-- List Products -->
                <div class="filters-content">
                    <div class="row grid">
                        <c:forEach items="${requestScope.film}" var="f" >
                            <div class="col-sm-6 col-lg-4 all pizza">
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
                <div class="btn-box">
                    <a href="menu" style="background-color: brown !important;padding: 15px 25px; text-decoration: none;">
                        View More
                    </a>
                </div>
            </div>
        </section>

        <!-- end food section -->

        <!-- about section -->


        <!-- end about section -->

        <%@include  file="../component/footer.jsp"%>


       <!-- T?i Bootstrap JavaScript và các ph? thu?c t? CDN -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


<script>
    $(document).ready(function () {
        // T? ??ng chuy?n slide m?i 3 giây
        $('#customCarousel1').carousel({
            interval: 3000
        });
    });
</script>

    </body>

</html>