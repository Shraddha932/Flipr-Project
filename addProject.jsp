<%-- 
    Document   : addProject.jsp
    Created on : 12 Jul, 2025, 6:51:39 PM
    Author     : HP
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Project</title>
    <style>
        body 
        {
            font-family: Arial;
            background-color: #eef; 
            text-align: center;
        }
        form 
        {
            margin-top: 40px;
            display: inline-block;
            padding: 20px;
            background-color: white;
            border-radius: 10px;
        }
        input, textarea
        {
            padding: 10px;
            width: 300px;
            margin: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button 
        {
            padding: 10px 20px;
            background: green;
            color: white;
            border: none;
            border-radius: 5px;
        }
        button:hover
        { 
            background: darkgreen;
        }
    </style>
</head>
<body>

    <h2>Add New Project</h2>

    <form action="ProjectChecker" method="post">
        <input type="text" name="name" placeholder="Project Name" required><br>
        <textarea name="description" placeholder="Project Description" required></textarea><br>
        <input type="text" name="imageUrl" placeholder="Image URL" required><br>
        <button type="submit">Add Project</button>
    </form>

    <br><a href="index.jsp"> Back to Home </a>

</body>
</html>

