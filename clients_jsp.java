package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class clients_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Our Happy Clients</title>\n");
      out.write("    <style>\n");
      out.write("        body { font-family: Arial; text-align: center; }\n");
      out.write("        .container { display: flex; flex-wrap: wrap; justify-content: center; }\n");
      out.write("        .card {\n");
      out.write("            width: 300px;\n");
      out.write("            margin: 15px;\n");
      out.write("            padding: 15px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            background: #f9f9f9;\n");
      out.write("        }\n");
      out.write("        .card img {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 180px;\n");
      out.write("            object-fit: cover;\n");
      out.write("        }\n");
      out.write("        .card h3 { margin: 10px 0; }\n");
      out.write("        .card p { font-size: 14px; }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <h2>Our Happy Clients</h2>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("    ");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fliprdb", "root", "root"); 
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM clients");

            while (rs.next()) {
                String name = rs.getString("name");
                String feedback = rs.getString("feedback");
                String image = rs.getString("image_url");
    
      out.write("\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <img src=\"");
      out.print( image );
      out.write("\" alt=\"Client Image\">\n");
      out.write("            <h3>");
      out.print( name );
      out.write("</h3>\n");
      out.write("            <p>\"");
      out.print( feedback );
      out.write("\"</p>\n");
      out.write("        </div>\n");
      out.write("    ");

            }
            rs.close(); st.close(); con.close();
        } catch(Exception e) {
            out.println("Error: " + e.getMessage());
        }
    
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <br><a href=\"index.jsp\">? Back to Home</a>\n");
      out.write("\n");
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
