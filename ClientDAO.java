package dao;

import dto.ClientDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ClientDAO 
{

    public boolean addClient(ClientDTO client)
    {
        boolean result = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fliprdb", "root", "");
            String query = "INSERT INTO clients (name, feedback, image_url) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, client.getName());
            ps.setString(2, client.getFeedback());
            ps.setString(3, client.getImageUrl());
            result = ps.executeUpdate() > 0;
            ps.close(); con.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        return result;
    }

    public List<ClientDTO> getAllClients() {
        List<ClientDTO> list = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fliprdb", "root", "");
            String query = "SELECT * FROM clients";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                ClientDTO c = new ClientDTO();
                c.setName(rs.getString("name"));
                c.setFeedback(rs.getString("feedback"));
                c.setImageUrl(rs.getString("image_url"));
                list.add(c);
            }
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}

