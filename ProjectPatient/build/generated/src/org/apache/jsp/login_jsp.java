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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body text=\"INDIGO\" background=\"image2.jpg\">\n");
      out.write("        ");

            String name = request.getParameter("user");
            String pass = request.getParameter("password");
            if(name.equals("Mohit") && pass.equals("101"))
            {
                
      out.write("<h3>Login Successful</h3><br>\n");
      out.write("                <h2>Welcome,</h2>\n");
      out.write("                <h3>Dr. Mohit Kamal!</h3>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"Insertion.jsp\">Click here to update patient details</a> ");

            }
            else if(name.equals("Anwar") && pass.equals("102"))
            {
                
      out.write("<h3>Login Successful</h3><br>\n");
      out.write("                <h2>Welcome,</h2>\n");
      out.write("                <h3>Dr. Anwar Khan!</h3>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"Insertion.jsp\">Click here to update patient details</a> ");

            }
            else if(name.equals("Rana") && pass.equals("103"))
            {
                
      out.write("<h3>Login Successful</h3><br>\n");
      out.write("                <h2>Welcome,</h2>\n");
      out.write("                <h3>Dr. Saiyad Rana!</h3>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"Insertion.jsp\">Click here to update patient details</a> ");

            }
            else if(name.equals("Hamid") && pass.equals("104"))
            {
                
      out.write("<h3>Login Successful</h3><br>\n");
      out.write("                <h2>Welcome,</h2>\n");
      out.write("                <h3>Dr. Hamidul Islam!</h3>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"Insertion.jsp\">Click here to update patient details</a> ");

            }
            else if(name.equals("admin") && pass.equals("111"))
            {
                
      out.write("<h3>Login Successful</h3><br>\n");
      out.write("                <h2>Welcome!</h2>\n");
      out.write("                <h3>Admin Login Completed.</h3>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"Insertion.jsp\">Click here to update patient details</a> ");

            }
            
            else{
                
      out.write("<h3>Credential wrong. Please try again.</h3><br>\n");
      out.write("                <a href=\"formlogin.jsp\">Return to the login page</a>");

                
            
            }
            
      out.write("\n");
      out.write("            \n");
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
