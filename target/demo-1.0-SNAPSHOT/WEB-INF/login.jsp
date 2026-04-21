<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
</head>
<body>
<h2>用户登录</h2>
<form action="LoginServlet" method="post">
    <label for="username">用户名:</label>
    <input type="text" id="username" name="username" required><br>
    <label for="password">密码:</label>
    <input type="password" id="password" name="password" required><br>
    <input type="submit" value="登录">
    <input type="reset" value="取消">
</form>
</body>
</html>