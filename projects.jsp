<%-- 
    Document   : projects
    Created on : 12 Jul, 2025, 7:50:15 PM
    Author     : HP
--%>



<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
    <title>Our Projects</title>
    <style>
        body 
        {
            font-family: Arial; 
            background: #f9f9f9;
            text-align: center; 
        }
        .container
        { display: flex;
          flex-wrap: wrap; 
          justify-content: center;
          margin-top: 30px; 
        }
        .card 
        {
            background: white;
            width: 300px;
            padding: 15px;
            margin: 15px;
            border: 1px solid #ccc;
            border-radius: 8px;
        }
        .card img {
            width: 100%;
            height: 180px;
            object-fit: cover;
            border-radius: 5px;
        }
        .card h3 
        { 
            margin-top: 10px; 
        }
        .card p 
        { font-size: 14px;
          color: #333; 
        }
        .card button
        {
            margin-top: 10px;
            padding: 8px 16px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
        }
    </style>
</head>
<body>

    <h2>Our Projects</h2>

    <div class="container">
        <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fliprdb", "root", "root");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM projects");

                while(rs.next()) {
                    String name = rs.getString("name");
                    String desc = rs.getString("description");
                    String img = rs.getString("image_url");
        %>
            <div class="card">
                <img src="<%= img %>" alt="Project Image">
                <h3><%= name %></h3>
                <p><%= desc %></p>
                <button type="submit">Read More</button>
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

    <a href="index.jsp"> Back to Home </a>

</body>
</html>
