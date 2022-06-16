<%--
  Created by IntelliJ IDEA.
  User: Stahl
  Date: 2022/6/16
  Time: 4:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ApexBookStore</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/LoginServlet" method="post">
        用户名:
        <label>
            <input type="text" name="name"/>
        </label>
        <br />
        网址:
        <label>
            <input type="password" name="password" />
        </label>
        <input type="submit" value="提交" />
    </form>
</body>
</html>
