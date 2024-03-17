
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../component/setupCss.jsp" %>
        <style>
            .card-registration .select-input.form-control[readonly]:not([disabled]) {
                font-size: 1rem;
                line-height: 2.15;
                padding-left: .75em;
                padding-right: .75em;
            }

            .card-registration .select-arrow {
                top: 13px;
            }

            .formR{
                border-radius: 30px; 
            }

            .register{
                background-image: url("view/images/cinema.jpg");
            }


        </style>
    </head>
    <body>
        <!--header-->
        <%@include file="../component/header.jsp" %>
        <!--header-->

        <!-- Section: Design Block -->
        <section class="">
            <div class="container py-5 h-100 ">
                <div class="row d-flex justify-content-center align-items-center h-100" >
                    <div class="col-xl-3 d-none d-xl-block">

                    </div>
                    <div class="col-xl-6" style="padding: 15px;color: white !important;">
                        <form action="registerController" method="post" >
                            <div class="card-body p-md-1 text-black">
                                <h2 class="mb-5 text-uppercase" >registration form</h2>

                                <div class="form-outline mb-4 mr-3">
                                    <input type="text" id="form3Example8" class="form-control form-control-lg"
                                           required="true" placeholder="Fullname" name="name"/>
                                    <label class="form-label" for="form3Example8">Full Name</label>
                                </div>

                                <div class="form-outline mb-4 mr-3">
                                    <input type="email" id="form3Example8" class="form-control form-control-lg" 
                                           required placeholder="Email" name="email"/>
                                    <label class="form-label" for="form3Example8">Email</label>
                                </div>

                                <div class="row">
                                    <div class="col-md-6 mb-4 ">
                                        <div class="form-outline" style="width: 92%;">
                                            <input type="password" id="form3Example1m1 " required placeholder="Password"
                                                   class="form-control form-control-lg"  name = "pass"/>
                                            <label class="form-label" for="form3Example1m1">Password</label>
                                        </div>
                                    </div>
                                    <div class="col-md-6 mb-4">
                                        <div class="form-outline" style="width: 92%;">
                                            <input type="password" id="form3Example1n1" required placeholder="Confirm Password"
                                                   class="form-control form-control-lg" name = "repass"/>
                                            <label class="form-label" for="form3Example1n1">Confirm Password</label>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-outline mb-4  mr-3">
                                    <input type="text" id="form3Example90" class="form-control form-control-lg"
                                           required placeholder="Phone" pattern="(84|0[3|5|7|8|9])+([0-9]{8})\b" name="phone" />
                                    <label class="form-label" for="form3Example90">Phone</label>
                                </div>

                                <div class="form-outline mb-4  mr-3">
                                    <input type="text" id="form3Example8" class="form-control form-control-lg" 
                                           required placeholder="Address" name="address"/>
                                    <label class="form-label" for="form3Example8">Address</label>
                                </div>

                                <div class="d-md-flex justify-content-start align-items-center mb-4 py-2">

                                    <h6 class="mb-0 me-4">Gender: </h6>

                                    <div class="form-check form-check-inline mb-0 me-4 ">
                                        <input class="form-check-input m-sm-1" type="radio"
                                               id="femaleGender" value="false" name = "gender"/>
                                        <label class="form-check-label" for="femaleGender">Female</label>
                                    </div>

                                    <div class="form-check form-check-inline mb-0 me-4">
                                        <input class="form-check-input m-sm-1" checked type="radio" 
                                               id="maleGender" value="true" name = "gender" />
                                        <label class="form-check-label" for="maleGender">Male</label>
                                    </div>
                                </div>


                                <div class="form-outline mb-4  mr-3">
                                    <input type="date" id="form3Example9" 
                                           class="form-control form-control-lg" name ="dob" />
                                    <label class="form-label" for="form3Example9" required>DOB</label>
                                </div>


                                <div class="d-flex justify-content-center mr-5">
                                    <button type="submit" class="btn btn-warning btn-lg ms-3 text-center" style="border-radius: 10px">Submit form</button>
                                </div>
                                <p class="mb-5 pb-lg-2 text-center" style="color: #393f81;"> Do you already have an account ? <a
                                        href="loginController" style="color: #393f81;">Login here</a></p>
                            </div>
                        </form>
                    </div>
                    <div class="col-xl-3 d-none d-xl-block">
                    </div>
                </div>
            </div>
        </section>
        <!-- Section: Design Block -->

        <!--footer-->
        <%@include file="../component/footer.jsp" %>
        <!--footer-->
    </body>
</html>
