<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>后台登陆</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/login.css">
<link rel="apple-touch-icon-precomposed" href="images/icon/icon.png">
<link rel="shortcut icon" href="images/icon/favicon.ico">
<script src="js/jquery-2.1.4.min.js"></script>
</head>

<body class="user-select">
<div class="container">
  <div class="siteIcon"><img src="images/icon/icon.png" alt="" data-toggle="tooltip" data-placement="top" title="管理员" draggable="false" /></div>
  <form action="../CheckAdminLogin" method="post" class="form-signin">
    <h2 class="form-signin-heading">账号</h2>
    <label for="userName" class="sr-only">请输入管理员账号</label>
    <input type="text" id="userName" name="adminName" class="form-control" placeholder="账号" required>
    <label for="userPwd" class="sr-only">密码 </label>
    <input type="password" id="userPwd" name="adminPassword" class="form-control" placeholder="密码"  required>
  	<li>
     <input type="submit" value="立即登陆" style="height:35px;width:100%;hidden;background:url(images/pc_loginBg.jpg) no-repeat;"/>
    </li>
  </form>
</div>
<script src="js/bootstrap.min.js"></script> 
<script>
</script>
</body>
</html>
