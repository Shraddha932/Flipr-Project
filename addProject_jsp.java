package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addProject_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Add New Project</title>\n");
      out.write("    <style>\n");
      out.write("        body { font-family: Arial; background-color: #eef; text-align: center; }\n");
      out.write("        form {\n");
      out.write("            margin-top: 40px;\n");
      out.write("            display: inline-block;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: white;\n");
      out.write("            border-radius: 10px;\n");
      out.write("        }\n");
      out.write("        input, textarea {\n");
      out.write("            padding: 10px;\n");
      out.write("            width: 300px;\n");
      out.write("            margin: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        button {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background: green;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        button:hover { background: darkgreen; }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <h2>Add New Project</h2>\n");
      out.write("\n");
      out.write("    <form action=\"ProjectChecker\" method=\"post\">\n");
      out.write("        <input type=\"text\" name=\"name\" placeholder=\"Project Name\" required><br>\n");
      out.write("        <textarea name=\"description\" placeholder=\"Project Description\" required></textarea><br>\n");
      out.write("        <input type=\"text\" name=\"imageUrl\" placeholder=\"Image URL\" required><br>\n");
      out.write("        <button type=\"submit\">Add Project</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <br><a href=\"index.jsp\">⬅️ Back to Home</a>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
