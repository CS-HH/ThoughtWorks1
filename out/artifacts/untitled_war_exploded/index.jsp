<%--
  Created by IntelliJ IDEA.
  User: Tom
  Date: 2017/5/6
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="js/ajax.js"></script>
    <script>
     window.onload = function () {
       var btn = document.getElementsByName("btn");
       btn[0].onclick = function () {
         loadXMLDoc();
       };
     } 
    </script>
  </head>
  <body>
  <input type="button" name="btn" value="submit">

  </body>
</html>
