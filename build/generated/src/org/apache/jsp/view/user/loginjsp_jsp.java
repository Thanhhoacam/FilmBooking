package org.apache.jsp.view.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/view/user/../component/header.jsp");
    _jspx_dependants.add("/view/user/../component/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Basic -->\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <!-- Mobile Metas -->\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <!-- Site Metas -->\r\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/161-1616544_popcorn-icon-cinema-flat-icon-png.png\" type=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title> Cinema Ticket </title>\r\n");
      out.write("\r\n");
      out.write("        <!-- bootstrap core css -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"view/css/bootstrap.css\" />\r\n");
      out.write("\r\n");
      out.write("        <!--owl slider stylesheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("              href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\" />\r\n");
      out.write("        <!-- nice select  -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/css/nice-select.min.css\"\r\n");
      out.write("              integrity=\"sha512-CruCP+TD3yXzlvvijET8wV5WxxEh5H8P4cmz0RFbKK6FlZ2sYl3AEsKlLPHbniXKSrDdFewhbmBK5skbdsASbQ==\"\r\n");
      out.write("              crossorigin=\"anonymous\" />\r\n");
      out.write("        <!-- font awesome style -->\r\n");
      out.write("        <link href=\"view/css/font-awesome.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"view/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- responsive style -->\r\n");
      out.write("        <link href=\"view/css/responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Section: Design Block -->\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- header section strats -->\r\n");
      out.write("        <header class=\"header_section\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <nav class=\"navbar navbar-expand-lg custom_nav-container \">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"home\">\r\n");
      out.write("                        <span>\r\n");
      out.write("                             NMD Cinemas\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                        <span class=\"\"> </span>\r\n");
      out.write("                    </button>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                        <ul class=\"navbar-nav  mx-auto \">\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"home\">Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"menu\">Menu</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"historyBookingController\">History Booking</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"user_option\">\r\n");
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- end header section -->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"vh-100\" >\r\n");
      out.write("            <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("                <div class=\"col col-xl-10\">\r\n");
      out.write("                    <div class=\"card\" style=\"border-radius: 1rem;\">\r\n");
      out.write("                        <div class=\"row g-0\">\r\n");
      out.write("                            <div class=\"col-md-3 col-lg-3 d-none d-md-block\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-6 col-lg-6 d-flex align-items-center\">\r\n");
      out.write("                                <div class=\"card-body p-4 p-lg-5 text-black\">\r\n");
      out.write("\r\n");
      out.write("                                    <form method=\"post\" action=\"loginController\">\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"d-flex align-items-center mb-3 pb-1\" >\r\n");
      out.write("                                            <h1>Cinema</h1>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <h2 class=\"fw-normal mb-3 pb-3\" style=\"letter-spacing: 1px;\">Sign into your\r\n");
      out.write("                                            account</h2>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-outline mb-4\">\r\n");
      out.write("                                            <input type=\"email\" id=\"form2Example17\"\r\n");
      out.write("                                                   class=\"form-control form-control-lg\" placeholder=\"Email address\" name=\"email\"/>\r\n");
      out.write("                                            <label class=\"form-label\" for=\"form2Example17\">Email address</label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-outline mb-4\">\r\n");
      out.write("                                            <input type=\"password\" id=\"form2Example27\"\r\n");
      out.write("                                                   class=\"form-control form-control-lg\" placeholder=\"Password\" name=\"pass\"/>\r\n");
      out.write("                                            <label class=\"form-label\" for=\"form2Example27\">Password</label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"pt-1 mb-4\">\r\n");
      out.write("                                            <button class=\"btn btn-dark btn-lg btn-block\" type=\"submit\">Login</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <p class=\"mb-5 pb-lg-2\" style=\"color: #393f81;\">Don't have an account? <a\r\n");
      out.write("                                                href=\"registerController\" style=\"color: #393f81;\">Register here</a></p>\r\n");
      out.write("                                        <a href=\"#!\" class=\"small text-muted\">Terms of use.</a>\r\n");
      out.write("                                        <a href=\"#!\" class=\"small text-muted\">Privacy policy</a>\r\n");
      out.write("                                    </form>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-3 col-lg-3 d-none d-md-block\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- footer section -->\r\n");
      out.write("        <footer class=\"footer_section\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-4 footer-col\">\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 footer-col\">\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 footer-col\">\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-info\">\r\n");
      out.write("                    <p>\r\n");
      out.write("                        &copy; <span id=\"displayYear\"></span> All Rights Reserved By\r\n");
      out.write("                        <a href=\"#\">FilmCinema </a><br><br>\r\n");
      out.write("                        &copy; <span id=\"displayYear\"></span> Distributed By\r\n");
      out.write("                        <a href=\"#\" target=\"_blank\">FilmCinema</a>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- footer section -->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        <!-- Section: Design Block -->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.id != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <a href=\"profileController\" class=\"order_online\">\r\n");
        out.write("                                    Profile\r\n");
        out.write("                                </a>\r\n");
        out.write("                                <a class=\"order_online\" href=\"changePassController\">\r\n");
        out.write("                                    Change Pass\r\n");
        out.write("                                </a>\r\n");
        out.write("                                <a href=\"logoutController\" class=\"order_online\">\r\n");
        out.write("                                    logout\r\n");
        out.write("                                </a> \r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.id == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <a href=\"loginController\" class=\"order_online\">\r\n");
        out.write("                                    Login\r\n");
        out.write("                                </a> \r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
