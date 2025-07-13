<%-- 
    Document   : contact.jsp
    Created on : 12 Jul, 2025, 5:50:42 PM
    Author     : HP
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Contact Us - Flipr</title>
    <style>
        body 
        {
            font-family: Arial, sans-serif;
            background-color: #eef;
            text-align: center;
            padding: 30px;
        }

        h2
        {
            color: #333;
        }

        form 
        {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            display: inline-block;
        }

        input
        {
            padding: 10px;
            width: 250px;
            margin: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        button 
        {
            padding: 10px 20px;
            background-color: green;
            color: white;
            border: none;
            border-radius: 5px;
        }

        button:hover 
        {
            background-color: darkgreen;
        }

        a 
        {
            display: block;
            margin-top: 20px;
            color: #007bff;
            text-decoration: none;
        }
    </style>
</head>
<body>

    <h2>Contact Us</h2>

    <form action="ContactChecker" method="post">
        <input type="text" name="fullname" placeholder="Full Name" required><br>
        <input type="email" name="email" placeholder="Email Address" required><br>
        <input type="text" name="mobile" placeholder="Mobile Number" required><br>
        <input type="text" name="city" placeholder="City" required><br>
        <button type="submit">Submit</button>
    </form>

    <a href="index.jsp"> Back to Home </a>

</body>
</html>

