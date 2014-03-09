package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!Doctype html>\n");
      out.write("    <head>\n");
      out.write("            <title>Bootstrap</title>\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("            <link href=\"css/custombootstrap.css\" rel=\"stylesheet\">\n");
      out.write("            <link href=\"css/jumbotron-narrow.css\" rel=\"stylesheet\">\n");
      out.write("            <!-- <link href=\"/css/styles.css\" rel=\"stylesheet\"> -->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body padding-bottom:55px;>\n");
      out.write("\n");
      out.write("            <div class=\"navbar navbar-custom navbar-static-top\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                            <div class=\"navbar-brand\">\n");
      out.write("                                    <font color=\"white\"> Welcome </font>\n");
      out.write("                            <!--\t<img src=\"img/hugh.jpg\" size=\"30px\">-->\n");
      out.write("                            </div>\n");
      out.write("                            <!--\n");
      out.write("                            The below button is only supposed to work when the window is resized\n");
      out.write("                            -->\n");
      out.write("                            <button class = \"navbar-toggle\" data-toggle = \"collapse\" data-target = \".navHeaderCollapse\">\n");
      out.write("                                    <!--\n");
      out.write("                                    This adds the three horizontal lines on a collapsible menu\n");
      out.write("                                    -->\n");
      out.write("                                    <span class = \"icon-bar\"></span>\n");
      out.write("                <span class = \"icon-bar\"></span>\n");
      out.write("                <span class = \"icon-bar\"></span>\n");
      out.write("                            </button> \n");
      out.write("\n");
      out.write("                            <div class=\"collapse navbar-collapse navHeaderCollapse\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <!--Below code is needed only for IDP -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <u1 class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                            <li class=\"active\">\n");
      out.write("                                                    <a href=\"#\"> Sign In </a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                    <a href=\"#\"> Blog </a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"dropdown\">\n");
      out.write("                                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"> Manage<b class=\"caret\"></b></a>\n");
      out.write("                                                     <ul class = \"dropdown-menu\">\n");
      out.write("                                                            <li><a href = \"#\">Petrol</a></li>\n");
      out.write("                                                            <li><a href = \"#\">Naphtha</a></li>\n");
      out.write("                                                            <li><a href = \"#\">CNG</a></li>\n");
      out.write("                                                            <li><a href = \"#\">LPG</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                            </li>\n");
      out.write("                                    </u1>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                    <div class=\"jumbotronChibi\">\n");
      out.write("                            <h1>\n");
      out.write("                                    <div class=\"text-center\">\n");
      out.write("                                            <img src=\"img/bplogo.jpg\" width=\"24.750\" height=\"30\"> &nbsp;\n");
      out.write("                                            BP Employee Training Portal \n");
      out.write("                                            <p><font size=2>\n");
      out.write("\n");
      out.write("                                            </font></p>\n");
      out.write("                                    </div>\n");
      out.write("                            </h1>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("            <br/>\n");
      out.write("            <br/>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row-fluid\">\n");
      out.write("                            <!-- if you want a larger column then write lg instead of md-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("\n");
      out.write("                                    <br/>\n");
      out.write("                                    <br/>\n");
      out.write("                                    <!--<p>babi ne podadi marvi che ne etle xD</p>-->\n");
      out.write("                                    <!--<button class=\"btn btn-primary\">Noan Ne Lafo Marva Click Here xD</button>-->\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                     <br/>\n");
      out.write("                                     <br/>\n");
      out.write("                                     <br/>\n");
      out.write("                                     <div class=\"container-fluid\">\n");
      out.write("                                            <form action=\"loginRedirector.jsp\" method=\"post\">\n");
      out.write("                                                     <div class=\"text-right\">User ID:  <input type=\"text\" name=\"username\"></div>\n");
      out.write("                                                     <br/>\n");
      out.write("                                                     <br/>\n");
      out.write("                                                     <div class=\"text-right\">Password:  <input type=\"password\" name=\"password\"></div>\n");
      out.write("                                                     <br/>\n");
      out.write("                                                     <br/>\n");
      out.write("                                                     <div class=\"text-right\"> <button class=\"btn btn-primaryCustom\" type=\"submit\">Login</button> </div>\n");
      out.write("                                            </form>\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script src=\"http://code.jquery.com/jquery-1.10.2.min.js\"> </script>\n");
      out.write("            <script src=\"js/bootstrap.js\"> </script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
