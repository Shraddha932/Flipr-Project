<%-- 
    Document   : admin_login
    Created on : 13 Jul, 2025, 10:34:12 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Login</title>
    <style>
        body 
        {
            font-family: Arial; 
            text-align: center;
            padding-top: 100px; 
        }
        input
        { 
            padding: 8px;
            margin: 10px; 
            width: 200px;
        }
        button 
        {
            padding: 10px 20px;
            background-color: #007bff;
            color: white;
            border: none;
        }
    </style>
</head>
<body>
    <h2>Admin Login</h2>
    <form action="AdminLoginChecker" method="post">
        <input type="text" name="username" placeholder="Username" required><br>
        <input type="password" name="password" placeholder="Password" required><br>
        <button type="submit">Login</button>
    </form>
    <p style="color:red;"><%= request.getParameter("error") != null ? "Invalid Credentials" : "" %></p>
</body>
</html>
