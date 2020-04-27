<%--
  Created by IntelliJ IDEA.
  User: mkuila
  Date: 4/26/2020
  Time: 10:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign up Page</title>
</head>
<body>
<h1 style="color: green">This is Sign Up page</h1>
<form action="/web_war_exploded/login" method="post">
    User Name:     <input type="text" name="loginname" width="30"/><br>
    Password:      <input type="password" name="password" width="20"/><br>
    Email ID:      <input type="email" name="email" width="20"/><br>
    Phone Number:  <input type="mobile" name="mobile" width="20"/><br>
               <button value="login">submit</button>
    <p style="color:red;">${errorMessage}</p>

</form>
</body>
</html>
