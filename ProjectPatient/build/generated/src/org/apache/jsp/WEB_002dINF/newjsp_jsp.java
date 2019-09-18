package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<head>\n");
      out.write("    <title>Jsp Sample</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body bgcolor=AZURE>\n");
      out.write("    <form action=\"login.jsp\">\n");
      out.write("    ");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false","root","root");
            Statement stmt = (Statement) con.createStatement();
 
            String sql;
            sql= "DROP database project";
            stmt.executeUpdate(sql);
            sql= "Create Database project";
            stmt.executeUpdate(sql);
            sql= "use project";
            stmt.executeUpdate(sql);
           
            //doctor's details
            
            sql = "CREATE TABLE DOCTOR "
                    + "(Name VARCHAR(255), "
                    + " Degree VARCHAR(255), "
                    + " University VARCHAR(255), "
                    + " Experience VARCHAR(255), "
                    + " Timing VARCHAR(255)) ";
 
            stmt.executeUpdate(sql);
            sql = "INSERT INTO DOCTOR "
                    + "VALUES ('Name','Degree','University','Experience','Timing')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO DOCTOR "
                    + "VALUES ('Tunny','FPP','DMC','Five years','1pm to 4pm')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO DOCTOR "
                    + "VALUES ('Adrita','ABC','CMH','Eight years','4pm to 7pm')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO DOCTOR "
                    + "VALUES ('Saiyad Rana','HJK','DMC','Two years','1pm to 4pm')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO DOCTOR "
                    + "VALUES ('Hamidul Islam','FPP','DMC','No Experience','2pm to 6pm')";
            stmt.executeUpdate(sql);
            
            

            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from doctor");
            
      out.write("<table border=1 align=center style=\"text-align: center\">\n");
      out.write("            ");
while(rs.next())
            {
                
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                <td>");
out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                <td>");
out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                <td>");
out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                <td>");
out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");

        }
      out.write("\n");
      out.write("        </table><br>\n");
      out.write("    ");

        
            //patient's details
            
            sql = "CREATE TABLE PATIENT "
                    + "(SerialNo VARCHAR(255), "
                    + " Name VARCHAR(255), "
                    + " Age VARCHAR(255), "
                    + " Address VARCHAR(255), "
                    + " Test_Report VARCHAR(255), "
                    + " Disease VARCHAR(255),"
                    + " Medicine VARCHAR(255))";
                   
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES ('Serial No.','Name of Patient','Age','Address','Test result','Disease','Medicine')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (1,'Zara','20','Dhanmondi','Positive','Tuberculosis','Napa')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (2,'Tonni','21','Uttora','Positive','Diabetes','Setra')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (3,'Raisa','20','Azimpur','Negative','Asthma','Janina')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (4,'Trina','22','Azimpur','Positive','Cancer','Baal')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (5,'Adrita','20','GreenRoad','Negative','Infection','Matha')";
            stmt.executeUpdate(sql);
            
            rs=st.executeQuery("select * from patient");
            
      out.write("<table border=1 align=center style=\"text-align: center\">\n");
      out.write("            ");
while(rs.next())
            {
                
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                <td>");
out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                <td>");
out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                <td>");
out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                <td>");
out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                <td>");
out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");

        }
      out.write("\n");
      out.write("        </table><br>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        ");

        }
    catch(SQLException e){
        out.print(e.getMessage());
      out.write("<br>");

    }
    
      out.write("\n");
      out.write("    \n");
      out.write("    <h6>Enter User Name: </h6>\n");
      out.write("    <input type=\"text\" name=\"user\" >\n");
      out.write("    <h6>Enter Password: </h6>\n");
      out.write("    <input type=\"password\" name=\"password\" >\n");
      out.write("    <input type=\"submit\" value=\"Login\">\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>");
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
