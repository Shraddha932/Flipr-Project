package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Welcome - Flipr Landing Page</title>\n");
      out.write("    <style>\n");
      out.write("        body { font-family: Arial, sans-serif; margin: 0; padding: 0; }\n");
      out.write("\n");
      out.write("        header {\n");
      out.write("            background-color: navy; \n");
      out.write("            color: white; \n");
      out.write("            padding: 60px 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .section {\n");
      out.write("            padding: 40px 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .section h2 {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card-container {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            flex-wrap: wrap;\n");
      out.write("            gap: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card {\n");
      out.write("            width: 280px;\n");
      out.write("            padding: 15px;\n");
      out.write("            background-color: lightgray; \n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 2px 6px rgba(0,0,0,0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card img {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 150px;\n");
      out.write("            object-fit: cover;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .button {\n");
      out.write("            display: inline-block;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: blue; \n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .button:hover {\n");
      out.write("            background-color: darkblue; \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        footer {\n");
      out.write("            background-color: navy;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .newsletter input[type=\"email\"] \n");
      out.write("        {\n");
      out.write("            padding: 10px;\n");
      out.write("            width: 250px;\n");
      out.write("            margin-right: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .newsletter button {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: green; \n");
      out.write("            border: none;\n");
      out.write("            color: white;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .newsletter button:hover {\n");
      out.write("            background-color: darkgreen; \n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <h1>Welcome to Flipr</h1>\n");
      out.write("        <p>Consultation, Design & Marketing Solutions</p>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"section\" style=\"background-color:white;\">\n");
      out.write("        <h2>Why Choose Us?</h2>\n");
      out.write("        <p>Reliable | Fast | Affordable | Professional Team</p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"section\" style=\"background-color:whitesmoke;\">\n");
      out.write("        <h2>About Us</h2>\n");
      out.write("        <p>Flipr is a digital solution agency providing full-stack development and consulting services to businesses of all sizes.</p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"section\" style=\"background-color:white;\">\n");
      out.write("        <h2>Our Projects</h2>\n");
      out.write("        <div class=\"card-container\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img src=\"https://w7.pngwing.com/pngs/449/539/png-transparent-career-portfolio-artist-s-portfolio-portfolio-miscellaneous-angle-kitchen.png\">\n");
      out.write("                <h4>Portfolio Website</h4>\n");
      out.write("                <p>Personal portfolio with responsive design.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img src=\"https://t3.ftcdn.net/jpg/02/41/39/06/360_F_241390620_hihddCG15N7I8HyPWUiv1eUH85D2SN9z.jpg\"/>\n");
      out.write("                <h4>E-Commerce Site</h4>\n");
      out.write("                <p>Shopping cart and secure payment integration.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img src=\"https://img.freepik.com/premium-vector/weather-cloud-sun-rain-lightning-logo-design-symbol-icon-template_23729-1768.jpg?semt=ais_hybrid&w=740\" />\n");
      out.write("                <h4>Weather App</h4>\n");
      out.write("                <p>Real-time weather using open APIs.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"button\" href=\"projects.jsp\">See All Projects</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"section\" style=\"background-color:whitesmoke;\">\n");
      out.write("        <h2>Happy Clients</h2>\n");
      out.write("        <div class=\"card-container\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h4>Tata Consultancy</h4>\n");
      out.write("                <img src=\"https://www.cdnlogo.com/logos/t/33/tata-consultancy-services.svg\">\n");
      out.write("                <p>\"Excellent design and fast delivery.\"</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h4>Infosys</h4>\n");
      out.write("                <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOGcQ0lodAxH3S-Zlt_y1m2gqCYSbioHPW3Q&s\">\n");
      out.write("                <p>\"Professional team and great support.\"</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h4>Flipkart</h4>\n");
      out.write("                <img src=\"https://cdn.iconscout.com/icon/free/png-256/free-flipkart-logo-icon-download-in-svg-png-gif-file-formats--online-shopping-application-app-brand-indian-companies-pack-logos-icons-2249163.png\">\n");
      out.write("                <p>\"User-friendly UI and clean code.\"</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"button\" href=\"clients.jsp\">See All Clients</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"section\" style=\"background-color:white;\">\n");
      out.write("        <h2>Subscribe to our Newsletter</h2>\n");
      out.write("        <form class=\"newsletter\" action=\"newsletter.jsp\" method=\"get\">\n");
      out.write("            <input type=\"email\" name=\"email\" placeholder=\"Enter your email\" required />\n");
      out.write("            <button type=\"submit\"><a href=\"subscribers.jsp\" style=\"color:white; text-decoration:none;\">View Subscribed Emails</a></button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div style=\"text-align:center;\">\n");
      out.write("    <a href=\"contact.jsp\" style=\"display:inline-block; margin:30px auto 0 auto; padding:10px 20px; background-color:blue; color:white; text-decoration:none; border-radius:5px;\">\n");
      out.write("        Contact Us \n");
      out.write("    </a>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <footer style=\"background-color:#1e1e2f; color:white; text-align:center; padding:20px;\">\n");
      out.write("    <p>&copy; 2025 Flipr. All rights reserved.</p>\n");
      out.write("    <a href=\"admin.jsp\" style=\"color:#ccc; text-decoration:none; margin-left:10px;\">Admin Panel</a>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("\n");
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
