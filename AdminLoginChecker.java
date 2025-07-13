package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AdminLoginChecker extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        
        if(username.equals("admin") && password.equals("admin123")) {
            HttpSession session = request.getSession();
            session.setAttribute("admin", "true");
            response.sendRedirect("admin.jsp");
        } else {
            response.sendRedirect("admin_login.jsp?error=true");
        }
    }
}
