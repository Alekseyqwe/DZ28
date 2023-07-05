<%--
  Created by IntelliJ IDEA.
  User: Алекс
  Date: 05.07.2023
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Success</title>
</head>
<body>
<h1>Заявка успешно сохранена</h1>

<h3>Информация о заявке:</h3>
<p>Name: <%= request.getAttribute("name") %></p>
<p>Email: <%= request.getAttribute("email") %></p>
<p>Message: <%= request.getAttribute("message") %></p>
</body>
</html>