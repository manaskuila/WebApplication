<%@ page import="java.util.Date" %><%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>This is new project</title>
  </head>
  <body>
  <h1>Welcome to new Web page</h1>
  <p>Hi this my first web page</p>

  <%
    Date dt= new Date();
    out.print("<h2>"+dt.toString()+"<h2");
  %>
  </body>
</html>