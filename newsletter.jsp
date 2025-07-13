<%-- 
    Document   : newsletter
    Created on : 12 Jul, 2025, 7:24:47 PM
    Author     : HP
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Newsletter</title>
</head>
<body style="text-align:center;">
    <h2>Subscribe to our Newsletter</h2>
    <form action="NewsletterChecker" method="post">
        <input type="email" name="email" placeholder="Your Email" required>
        <br><br>
        <button type="submit">Subscribe</button>
    </form>
    <br><a href="index.jsp">Back to Home</a>
</body>
</html>
