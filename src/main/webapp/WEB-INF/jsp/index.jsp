<%@ page contentType="text/html;charset=UTF-8"  isELIgnored="false" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>主页</title>
</head>
<body>

<h1>${msg}</h1>

    <table>
        <tr>
            <td>用户名</td>
            <td>性别</td>
            <td>年龄</td>

        </tr>
        <c:forEach var="item" items="${list}">

        <tr>
            <td>${item.userName}</td>
            <td>${item.sex}</td>
            <td>${item.age}</td>
        </tr>

        </c:forEach>



    </table>



</body>
</html>
