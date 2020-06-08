<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/8
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="show2">
    <input type="text" name = "userName" id="userName" value="${item.userName}"> <br/>
    <input type="password" name = "password" id="password" value="${item.password}">

    <input type="checkbox" name="item_id" value="001"/>
    <input type="checkbox" name="item_id" value="002"/>
    <input type="checkbox" name="item_id" value="002"/>

    <input type="submit">

</form>

</body>
</html>
