<%-- 
    Document   : addClient
    Created on : 12 Jul, 2025, 7:18:46 PM
    Author     : HP
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Client</title>
</head>
<body style="text-align:center;">
    <h2>Add Happy Client</h2>
    <form action="ClientChecker" method="post">
        <input type="text" name="name" placeholder="Client Name" required><br><br>
        <textarea name="feedback" placeholder="Feedback" required></textarea><br><br>
        <input type="text" name="imageUrl" placeholder="Image URL" required><br><br>
        <button type="submit">Add Client</button>
    </form>
    <br><a href="index.jsp">Back to Home</a>
</body>
</html>
