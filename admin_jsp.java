package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Contact Form Submissions</title>\n");
      out.write("</head>\n");
      out.write("<body style=\"text-align:center;\">\n");
      out.write("    <h2>Submitted Contact Details</h2>\n");
      out.write("    <table border=\"1\" align=\"center\">\n");
      out.write("        <tr>\n");
      out.write("            <th>Full Name</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Mobile</th>\n");
      out.write("            <th>City</th>\n");
      out.write("        </tr>\n");
      out.write("        ");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fliprdb", "root", "root"); // ya password
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM contact_form");

                while (rs.next()) {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( rs.getString("fullname") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("email") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("mobile") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("city") );
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        ");

                }
                rs.close(); st.close(); con.close();
            } catch(Exception e) {
                System.out.println(e);
            }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    <br><a href=\"index.jsp\"> Back to Home</a>\n");
      out.write("</body>\n");
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
