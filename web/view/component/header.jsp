
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- header section strats -->
        <header class="header_section">
            <div class="container">
                <nav class="navbar navbar-expand-lg custom_nav-container ">
                    <a class="navbar-brand" href="home">
                        <span>
                             NMD Cinemas
                        </span>
                    </a>

                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class=""> </span>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav  mx-auto ">
                            <li class="nav-item">
                                <a class="nav-link" href="home">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="menu">Menu</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="historyBookingController">History Booking</a>
                            </li>
                        </ul>
                        <div class="user_option">

                            <c:if test="${sessionScope.id != null}">
                                <a href="profileController" class="order_online">
                                    Profile
                                </a>
                                <a class="order_online" href="changePassController">
                                    Change Pass
                                </a>
                                <a href="logoutController" class="order_online">
                                    logout
                                </a> 
                            </c:if>
                            <c:if test="${sessionScope.id == null}">
                                <a href="loginController" class="order_online">
                                    Login
                                </a> 
                            </c:if>


                        </div>
                    </div>
                </nav>
            </div>
        </header>
        <!-- end header section -->
    </body>
</html>
