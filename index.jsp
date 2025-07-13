<%-- 
    Document   : index
    Created on : 12 Jul, 2025, 5:21:57 PM
    Author     : HP
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome - Flipr Landing Page</title>
    <style>
        body 
        { 
            font-family: Arial, sans-serif; 
            margin: 0;
            padding: 0;
        }

        header
        {
            background-color: navy; 
            color: white; 
            padding: 60px 20px;
            text-align: center;
        }

        .section 
        {
            padding: 40px 20px;
            text-align: center;
        }

        .section h2 
        {
            margin-bottom: 20px;
        }

        .card-container 
        {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
            gap: 20px;
        }

        .card 
        {
            width: 280px;
            padding: 15px;
            background-color: lightgray; 
            border-radius: 8px;
            box-shadow: 0 2px 6px rgba(0,0,0,0.1);
        }

        .card img 
        {
            width: 100%;
            height: 150px;
            object-fit: cover;
            border-radius: 5px;
        }

        .button 
        {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: blue; 
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

        .button:hover 
        {
            background-color: darkblue; 
        }

        footer 
        {
            background-color: navy;
            color: white;
            text-align: center;
            padding: 20px;
        }

        .newsletter input[type="email"] 
        {
            padding: 10px;
            width: 250px;
            margin-right: 10px;
        }

        .newsletter button 
        {
            padding: 10px 20px;
            background-color: green; 
            border: none;
            color: white;
            border-radius: 5px;
        }

        .newsletter button:hover 
        {
            background-color: darkgreen; 
        }
    </style>
</head>
<body>

    <header>
        <h1>Welcome to Flipr</h1>
        <p>Consultation, Design & Marketing Solutions</p>
    </header>

    <div class="section" style="background-color:white;">
        <h2>Why Choose Us?</h2>
        <p>Reliable | Fast | Affordable | Professional Team</p>
    </div>

    <div class="section" style="background-color:whitesmoke;">
        <h2>About Us</h2>
        <p>Flipr is a digital solution agency providing full-stack development and consulting services to businesses of all sizes.</p>
    </div>

    <div class="section" style="background-color:white;">
        <h2>Our Projects</h2>
        <div class="card-container">
            <div class="card">
                <img src="https://w7.pngwing.com/pngs/449/539/png-transparent-career-portfolio-artist-s-portfolio-portfolio-miscellaneous-angle-kitchen.png">
                <h4>Portfolio Website</h4>
                <p>Personal portfolio with responsive design.</p>
            </div>
            <div class="card">
                <img src="https://t3.ftcdn.net/jpg/02/41/39/06/360_F_241390620_hihddCG15N7I8HyPWUiv1eUH85D2SN9z.jpg"/>
                <h4>E-Commerce Site</h4>
                <p>Shopping cart and secure payment integration.</p>
            </div>
            <div class="card">
                <img src="https://img.freepik.com/premium-vector/weather-cloud-sun-rain-lightning-logo-design-symbol-icon-template_23729-1768.jpg?semt=ais_hybrid&w=740" />
                <h4>Weather App</h4>
                <p>Real-time weather using open APIs.</p>
            </div>
        </div>
        <a class="button" href="projects.jsp">See All Projects</a>
    </div>

    <div class="section" style="background-color:whitesmoke;">
        <h2>Happy Clients</h2>
        <div class="card-container">
            <div class="card">
                <h4>Tata Consultancy</h4>
                <img src="https://www.cdnlogo.com/logos/t/33/tata-consultancy-services.svg">
                <p>"Excellent design and fast delivery."</p>
            </div>
            <div class="card">
                <h4>Infosys</h4>
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOGcQ0lodAxH3S-Zlt_y1m2gqCYSbioHPW3Q&s">
                <p>"Professional team and great support."</p>
            </div>
            <div class="card">
                <h4>Flipkart</h4>
                <img src="https://cdn.iconscout.com/icon/free/png-256/free-flipkart-logo-icon-download-in-svg-png-gif-file-formats--online-shopping-application-app-brand-indian-companies-pack-logos-icons-2249163.png">
                <p>"User-friendly UI and clean code."</p>
            </div>
        </div>
        <a class="button" href="clients.jsp">See All Clients</a>
    </div>

    <div class="section" style="background-color:white;">
        <h2>Subscribe to our Newsletter</h2>
        <form class="newsletter" action="newsletter.jsp" method="get">
            <input type="email" name="email" placeholder="Enter your email" required />
            <button type="submit"><a href="subscribers.jsp" style="color:white; text-decoration:none;">View Subscribed Emails</a></button>
        </form>
    </div>
    
    
    <div style="text-align:center;">
    <a href="contact.jsp" style="display:inline-block; margin:30px auto 0 auto; padding:10px 20px; background-color:blue; color:white; text-decoration:none; border-radius:5px;">
        Contact Us 
    </a>
    </div>
    
    
    <footer style="background-color:#1e1e2f; color:white; text-align:center; padding:20px;">
    <p>&copy; 2025 Flipr. All rights reserved.</p>
    <a href="admin.jsp" style="color:#ccc; text-decoration:none; margin-left:10px;">Admin Panel</a>
    </footer>



</body>
</html>
