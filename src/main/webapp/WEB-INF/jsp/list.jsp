<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"  isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="updateItems">

    姓名：<input type="text" name="itemInfo['name']"/>

    <c:forEach items="${itemsList }" var="item" varStatus="s">
    <tr>
        <td><input type="checkbox" name="ids" value="${item.id}"/></td>

        <td>
            <input type="input" name="itemList[${s.index}].name" value="${item.name }"/>
        </td>

        <td>
            <input type="input" name="itemList[${s.index}].price" value="${item.price }"/>
        </td>

    </tr>
</c:forEach>

    <input type="submit"/>
</form>

</body>
</html>
