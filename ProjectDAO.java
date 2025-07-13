package dao;

import dto.ProjectDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class ProjectDAO
{

    public boolean addProject(ProjectDTO project)
    {
        boolean result = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fliprdb", "root", "root");

            String query = "INSERT INTO projects (name, description, image_url) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, project.getName());
            ps.setString(2, project.getDescription());
            ps.setString(3, project.getImageUrl());

            int rows = ps.executeUpdate();
            if (rows > 0) result = true;

            ps.close();
            con.close();
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
        return result;
    }

}
