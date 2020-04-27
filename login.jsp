<%--
  Created by IntelliJ IDEA.
  User: mkuila
  Date: 4/26/2020
  Time: 6:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<style>

    button {
        background-color: #4CAF50;
        color: white;
        padding: 5px 5px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 5%;
    }

    button:hover {
        opacity: 0.8;
    }
</style>
<body>
<h1 style="color: green">This is login page</h1>
<form action="/web_war_exploded/login" method="post">
    Login Name: <input type="text" name="loginname" width="30"/>
    Password: <input type="password" name="password" width="20"/>
    <button value="login">submit</button>

    <p style="color:red;">${errorMessage}</p>
</form>

</body>
</html>
