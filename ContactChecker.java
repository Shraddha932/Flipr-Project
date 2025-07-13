package controller;

import dao.ContactDAO;
import dto.ContactDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ContactChecker extends HttpServlet 
{

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        
        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String city = request.getParameter("city");

       
        ContactDTO contact = new ContactDTO();
        contact.setFullname(fullname);
        contact.setEmail(email);
        contact.setMobile(mobile);
        contact.setCity(city);

       
        ContactDAO dao = new ContactDAO();
        boolean status = dao.saveContact(contact);


        if (status)
        {
            response.setContentType("text/html");
            response.getWriter().println("<h2>Thank you! Your contact details have been submitted.</h2>");
            response.getWriter().println("<a href='index.jsp'>Back to Home</a>");
        }
        else 
        {
            response.sendRedirect("error.jsp");
        }
    }
}
