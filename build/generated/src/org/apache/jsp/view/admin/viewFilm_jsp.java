package org.apache.jsp.view.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewFilm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/view/admin/../component/admin_header.jsp");
    _jspx_dependants.add("/view/admin/../component/admin_footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Document</title>\n");
      out.write("\n");
      out.write("        <!-- bootstrap core css -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!DOCTYPE html>\n");
      out.write("    <html lang=\"en\">\n");
      out.write("\n");
      out.write("        <head>\n");
      out.write("            <meta charset=\"utf-8\" />\n");
      out.write("            <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("            <meta name=\"description\" content=\"\" />\n");
      out.write("            <meta name=\"author\" content=\"\" />\n");
      out.write("            <title>Dashboard - SB Admin</title>\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\n");
      out.write("            <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("            <script src=\"https://use.fontawesome.com/releases/v6.1.0/js/all.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <!-- CSS only -->\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("                  integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body class=\"sb-nav-fixed\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark  bg-dark\" style=\"font-size: 22px;\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"adminDashboardController\" style=\"margin-left: 300px;\">Admin</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\"\n");
      out.write("                        aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\" style=\"margin-left: 220px;\">\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link ms-5\" href=\"adminDashboardController\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link ms-4\" href=\"manageFilmController?title=&date=&genres=&country=&order=filmId&dimesion=asc&page=1\">Film</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link ms-4\" href=\"manageShowController?title=&date=&order=showId&dimesion=asc&page=1\">Show</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"margin-right: 300px;\">\n");
      out.write("                    <a href=\"logoutController\"><i class=\"fa fa-solid fa-right-from-bracket\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </body>\n");
      out.write("\n");
      out.write("    </html>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <!-- Section: Design Block -->\n");
      out.write("        <div class=\"container rounded bg-white mt-5 mb-5\">\n");
      out.write("            <div class=\"row d-flex justify-content-center\">\n");
      out.write("                <div class=\"col-md-6 border\">\n");
      out.write("                    <form action=\"\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                        <div class=\"p-3 py-5\">\n");
      out.write("                            <div class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                                <h4 class=\"text-right\">Movie</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row mt-3\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label class=\"labels\">FilmID</label>\n");
      out.write("                                    <input type=\"text\" readonly class=\"form-control\" \n");
      out.write("                                           placeholder=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.filmId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"filmId\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label class=\"labels\">Title</label>\n");
      out.write("                                    <input type=\"text\" readonly class=\"form-control\" \n");
      out.write("                                           placeholder=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"title\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label class=\"labels\">Premiere</label>\n");
      out.write("                                    <input type=\"date\" readonly class=\"form-control\" \n");
      out.write("                                           placeholder=\"premiere\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.premiere}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"premiere\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\"><label class=\"labels\">Actor</label>\n");
      out.write("                                    <input type=\"text\" readonly class=\"form-control\" \n");
      out.write("                                           placeholder=\"actor\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.actor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"actor\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\"><label class=\"labels\">Author</label>\n");
      out.write("                                    <input type=\"text\" readonly class=\"form-control\" \n");
      out.write("                                           placeholder=\"author\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"author\"></div>\n");
      out.write("                                <div class=\"col-md-12\"><label class=\"labels\">Duration</label>\n");
      out.write("                                    <input type=\"number\" readonly class=\"form-control\"\n");
      out.write("                                           placeholder=\"duration\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"duration\" min=\"30\" max=\"150\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\"><label class=\"labels\">Thumbnail</label>\n");
      out.write("                                    <div class=\"text-center\">\n");
      out.write("                                        <img src=\"view/images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 100%; height: auto\" class=\"rounded\" alt=\"...\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\"><label class=\"labels\">Genres</label>\n");
      out.write("                                    <input type=\"text\" readonly class=\"form-control\" \n");
      out.write("                                           placeholder=\"author\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.genres.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"author\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-12\"><label class=\"labels\">Country</label>\n");
      out.write("                                    <input type=\"text\" readonly class=\"form-control\" \n");
      out.write("                                           placeholder=\"author\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.country.countryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"author\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label class=\"labels\">Description</label>\n");
      out.write("                                    <textarea class=\"form-control\" readonly name=\"description\" rows=\"5\" wrap=\"hard\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("                                </div>\n");
      out.write("                              \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mt-5 text-center\">\n");
      out.write("                                <a class=\"btn btn-primary\" href=\"updateFilmController?filmId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.filmId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    Update\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer class=\"py-4 bg-light mt-auto \">\n");
      out.write("            <div class=\"container-fluid px-4\">\n");
      out.write("                <div class=\"d-flex align-items-center justify-content-between small\">\n");
      out.write("                    <div class=\"text-muted\">Copyright &copy; Your Website 2022</div>\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"#\">Privacy Policy</a>\n");
      out.write("                        &middot;\n");
      out.write("                        <a href=\"#\">Terms &amp; Conditions</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <!-- Section: Design Block -->\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
}
