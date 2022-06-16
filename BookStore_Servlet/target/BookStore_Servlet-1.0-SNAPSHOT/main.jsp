<jsp:useBean id="user" scope="session" type="im.zishen.study.bookstore_servlet.model.User"/>
<%--
  Created by IntelliJ IDEA.
  User: Stahl
  Date: 2022/6/16
  Time: 5:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ApexBookStore</title>
</head>
<body>
<h1>Main Page</h1>
Login Now: ${user.name}
</body>
</html>
