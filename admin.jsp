<%-- 
    Document   : admin.jsp
    Created on : 12 Jul, 2025, 5:58:14 PM
    Author     : HP
--%>


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
    <title>Contact Form Submissions</title>
</head>
<body style="text-align:center;">
    <h2>Submitted Contact Details</h2>
    <table border="1" align="center">
        <tr>
            <th>Full Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>City</th>
        </tr>
        <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fliprdb", "root", "root"); 
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM contact_form");

                while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getString("fullname") %></td>
            <td><%= rs.getString("email") %></td>
            <td><%= rs.getString("mobile") %></td>
            <td><%= rs.getString("city") %></td>
        </tr>
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
    </table>

    <br>
    <a href="subscribers.jsp">View Subscribed Emails</a>
    <a href="index.jsp"> Back to Home</a>
    
</body>
</html>
