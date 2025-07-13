package controller;

import dto.NewsletterDTO;
import dao.NewsletterDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class NewsletterChecker extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");

        NewsletterDTO dto = new NewsletterDTO();
        dto.setEmail(email);

        NewsletterDAO dao = new NewsletterDAO();
        boolean result = dao.subscribe(dto);

        if (result) {
            response.getWriter().println("<h2>Subscribed successfully!</h2><a href='index.jsp'>Back to Home</a>");
        } else {
            response.getWriter().println("<h2>Subscription failed.</h2>");
        }
    }
}
