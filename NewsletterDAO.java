package dao;

import dto.NewsletterDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class NewsletterDAO
{
    public boolean subscribe(NewsletterDTO dto) 
    {
        boolean result = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fliprdb", "root", "root");
            String query = "INSERT INTO newsletter (email) VALUES (?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, dto.getEmail());
            result = ps.executeUpdate() > 0;
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

