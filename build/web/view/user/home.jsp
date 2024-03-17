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

        <title> Cinema Ticket </title>
        <!-- bootstrap core css -->
        <%@include file="../component/setupCss.jsp" %>
        <style>
            .icon:hover{
                font-size: 18px
            }


        </style>
    </head>

    <body>
        <div class="hero_area">
            <div class="bg-box">
                <img src="view/images/7365240.jpg" alt="">
            </div>
            <!-- header section strats -->
            <%@include file="../component/header.jsp" %>
            <!-- end header section -->
            <!-- slider section -->
            <section class="slider_section ">
                <div id="customCarousel1" class="carousel slide" data-ride="carousel">
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <div class="container ">
                                <div class="row">
                                    <div class="col-md-10 col-lg-8 ">
                                        <div class="detail-box">
                                            <h1 style="font-size: 60px !important; font-family: monospace; ">
                                                ANT-MAN AND THE WASP: QUANTUMANIA
                                            </h1>
                                            <p style="font-size: 20px !important; font-family: monospace;">
                                                Ant-Man and the Wasp: Quantumania is a 2023 American superhero film based on Marvel Comics featuring the characters Scott Lang / Ant-Man and Hope Pym / Wasp. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is the sequel to Ant-Man (2015) and Ant-Man and the Wasp (2018) and the 31st film of the Marvel Cinematic Universe (MCU). The film was directed by Peyton Reed, written by Jeff Loveness, and stars Paul Rudd as Scott Lang and Evangeline Lilly as Hope van Dyne, alongside Jonathan Majors, Kathryn Newton, David Dastmalchian, Katy O'Brian, William Jackson Harper, Bill Murray, Michelle Pfeiffer, Corey Stoll, and Michael Douglas. In the film, Lang and Van Dyne are transported to the Quantum Realm along with their family and face Kang the Conqueror (Majors).
                                            </p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item ">
                            <div class="container ">
                                <div class="row">
                                    <div class="col-md-7 col-lg-6 ">
                                        <div class="detail-box">
                                            <h1>
                                                Special offer for new subscribers.
                                            </h1>
                                            <p>
                                                Doloremque, itaque aperiam facilis rerum, commodi, temporibus sapiente ad mollitia laborum quam
                                                quisquam esse error unde. Tempora ex doloremque, labore, sunt repellat dolore, iste magni quos
                                                nihil ducimus libero ipsam.
                                            </p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="container ">
                                <div class="row">
                                    <div class="col-md-7 col-lg-6 ">
                                        <div class="detail-box">
                                            <h1>
                                                Weekly promotion.
                                            </h1>
                                            <p>
                                                Doloremque, itaque aperiam facilis rerum, commodi, temporibus sapiente ad mollitia laborum quam
                                                quisquam esse error unde. Tempora ex doloremque, labore, sunt repellat dolore, iste magni quos
                                                nihil ducimus libero ipsam.
                                            </p>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
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


        <!-- jQery -->
        <script src="js/jquery-3.4.1.min.js"></script>
        <!-- popper js -->
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
                integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous">
        </script>
        <!-- bootstrap js -->
        <script src="js/bootstrap.js"></script>
        <!-- owl slider -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js">
        </script>
        <!-- isotope js -->
        <script src="https://unpkg.com/isotope-layout@3.0.4/dist/isotope.pkgd.min.js"></script>
        <!-- nice select -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/js/jquery.nice-select.min.js"></script>
        <!-- custom js -->
        <script src="js/custom.js"></script>
        <!-- Google Map -->
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCh39n5U-4IoWpsVGUHWdqB6puEkhRLdmI&callback=myMap">
        </script>
        <!-- End Google Map -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>

    </body>

</html>