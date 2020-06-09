
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图片上传</title>
    <meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" />
</head>
<body>

    <form action="imgUpload" enctype="multipart/form-data" method="post">
    请选择图片：<input type="file" name="file"> <br/>
              <input type="submit" value="上传"> <br/>
    </form>

</body>
</html>
