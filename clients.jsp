<%-- 
    Document   : clients
    Created on : 12 Jul, 2025, 7:19:42 PM
    Author     : HP
--%>


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
    <title>Our Happy Clients</title>
    <style>
        body 
        {
            font-family: Arial; text-align: center;
        }
        .container
        { 
            display: flex; flex-wrap: wrap; justify-content: center; 
        }
        .card
        {
            width: 300px;
            margin: 15px;
            padding: 15px;
            border: 1px solid #ccc;
            border-radius: 8px;
            background: #f9f9f9;
        }
        .card img
        {
            width: 100%;
            height: 180px;
            object-fit: cover;
        }
        .card h3 
        { 
            margin: 10px 0; 
        }
        .card p
        { 
            font-size: 14px; 
        }
    </style>
</head>
<body>

    <h2>Our Happy Clients</h2>

    <div class="container">
    <%
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fliprdb", "root", "root"); 
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM clients");

            while (rs.next()) {
                String name = rs.getString("name");
                String feedback = rs.getString("feedback");
                String image = rs.getString("image_url");
    %>
        <div class="card">
            <img src="<%= image %>" alt="Client Image">
            <h3><%= name %></h3>
            <p>"<%= feedback %>"</p>
        </div>
    <%
            }
            rs.close(); 
            st.close();
            con.close();
        } 
        catch(Exception e) 
        {
          System.out.println(e);
        }
    %>
    </div>

    <br><a href="index.jsp"> Back to Home</a>

</body>
</html>
