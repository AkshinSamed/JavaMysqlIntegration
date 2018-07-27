<%--
  Created by IntelliJ IDEA.
  User: asamadli
  Date: 7/27/2018
  Time: 4:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<div class="w3-padding-64 w3-padding-large">
    <h1>Sign Up</h1>
    <p class="w3-opacity">GET IN TOUCH</p>
    <form class="w3-container w3-card w3-padding-32 w3-white" action="/rest/main/add-new-person" target="_blank">
        <div class="w3-section">
            <label>FirstName</label>
            <input class="w3-input" style="width:100%;" type="text" required="" name="first_name">
        </div>
        <div class="w3-section">
            <label>LastName</label>
            <input class="w3-input" style="width:100%;" type="text" required="" name="last_name">
        </div>
        <div class="w3-section">
            <label>Phone</label>
            <input class="w3-input" style="width:100%;" type="text" required="" name="phone">
        </div>
        <button type="submit" class="w3-button w3-teal w3-right">Save</button>
    </form>
</div>
</body>
</html>
