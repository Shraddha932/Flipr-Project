package controller;

import dao.ProjectDAO;
import dto.ProjectDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProjectChecker extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String imageUrl = request.getParameter("imageUrl");

        ProjectDTO project = new ProjectDTO();
        project.setName(name);
        project.setDescription(description);
        project.setImageUrl(imageUrl);

        ProjectDAO dao = new ProjectDAO();
        boolean inserted = dao.addProject(project);

        if (inserted) {
            response.setContentType("text/html");
            response.getWriter().println("<h2>Project added successfully!</h2>");
            response.getWriter().println("<a href='projects.jsp'>Go to Projects</a>");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}
