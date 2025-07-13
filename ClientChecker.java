
package controller;

import dto.ClientDTO;
import dao.ClientDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ClientChecker extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {

        String name = request.getParameter("name");
        String feedback = request.getParameter("feedback");
        String imageUrl = request.getParameter("imageUrl");

        ClientDTO dto = new ClientDTO();
        dto.setName(name);
        dto.setFeedback(feedback);
        dto.setImageUrl(imageUrl);

        ClientDAO dao = new ClientDAO();
        boolean result = dao.addClient(dto);

        if (result) {
            response.getWriter().println("<h2>Client added successfully!</h2><a href='clients.jsp'>View Clients</a>");
        } else {
            response.getWriter().println("<h2>Error adding client</h2>");
        }
    }
}
