
package dao;

import dto.ContactDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ContactDAO
{

    public boolean saveContact(ContactDTO contact)
    {
        boolean isSaved = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fliprdb", "root", "root");

            String query = "INSERT INTO contact_form (fullname, email, mobile, city) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, contact.getFullname());
            ps.setString(2, contact.getEmail());
            ps.setString(3, contact.getMobile());
            ps.setString(4, contact.getCity());

            int i = ps.executeUpdate();
            if (i > 0) {
                isSaved = true;
            }

            ps.close();
            con.close();

        } 
        catch (SQLException e)
        {
            System.out.println(e);
        } 
        catch (ClassNotFoundException e)
        {
            System.out.println(e);
        }

        return isSaved;
    }
}

