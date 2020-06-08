<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/8
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form action="submitlist">


    <c:forEach var="item" items="${itemsList}">
    <tr>
        <td><input type="text" name = "" value="${item.name}" /></td>
    </tr>
    </c:forEach>


</form>

</body>
</html>
