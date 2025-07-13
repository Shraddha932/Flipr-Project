<%-- 
    Document   : subscribers
    Created on : 12 Jul, 2025, 11:45:47 PM
    Author     : HP
--%>


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
    <title>Subscribed Emails</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
        }
        table {
            margin: auto;
            border-collapse: collapse;
            width: 50%;
        }
        th, td {
            padding: 12px;
            border: 1px solid #ddd;
        }
        th {
            background-color: #007bff;
            color: white;
        }
        h2 {
            margin-top: 30px;
        }
        a {
            display: inline-block;
            margin-top: 30px;
            text-decoration: none;
            color: #007bff;
        }
    </style>
</head>
<body>

    <h2>Subscribed Email Addresses</h2>

    <table>
        <tr>
            <th>Email</th>
        </tr>
        <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fliprdb", "root", "root"); 
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT email FROM newsletter");

                while(rs.next()) {
        %>
        <tr>
            <td><%= rs.getString("email") %></td>
        </tr>
        <%
                }
                rs.close();
                st.close();
                con.close();
            } catch(Exception e)
{
                System.out.println(e);
            }
        %>
    </table>

    <a href="index.jsp"> Back to Home</a>

</body>
</html>
