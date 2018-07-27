<%--
  Created by IntelliJ IDEA.
  User: asamadli
  Date: 7/27/2018
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">

  <style>
    body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", Arial, Helvetica, sans-serif}
    .myLink {display: none}
  </style>
</head>
<body>
<div class="w3-container">
  <h1 style="color: cadetblue; text-align: center" >Welcome to the page</h1>
  <a  href="registration.jsp"> <p style = "text-align: right"> Registration </p> </a>
  <form action="/rest/main/get-person-phone" target="_blank">
    <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="FirstName" required="" name="first_name"></p>
    <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="LastName" required="" name="last_name"></p>
    <p><button class="w3-button w3-black w3-padding-large" type="submit">GetPhoneNum</button></p>
  </form>
  <form action="/rest/main/get-person-name" target="_blank">
    <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Phone Number" required="" name="phone"></p>
    <p><button class="w3-button w3-black w3-padding-large" type="submit">GetFullName</button></p>
  </form>
  <form action="/rest/main/list-all-persons" target="_blank">
    <h1 style="color: cadetblue">For list all persons : </h1>
    <p><button class="w3-button w3-black w3-padding-large" type="submit">ListAllPersons</button></p>
  </form>

</div>

</body>
</html>
