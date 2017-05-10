<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<title>登录</title>
		<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="css/login.css" />
		<script src="http://code.jquery.com/jquery-latest.js"></script>
	</head>

	<body class="beg-login-bg">
		<div class="beg-login-box">
			<header>
				<h1>系统登录</h1>
			</header>
			<div class="beg-login-main">
				<input name="__RequestVerificationToken" type="hidden" value="fkfh8D89BFqTdrE2iiSdG_L781RSRtdWOH411poVUWhxzA5MzI8es07g6KPYQh9Log-xf84pIR2RIAEkOokZL3Ee3UKmX0Jc8bW8jOdhqo81" />
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe612;</i>
                    </label>
						<input type="text" name="userId" lay-verify="userId" autocomplete="off" placeholder="这里输入工号" class="layui-input">
					</div>
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                    </label>
						<input type="password" name="password" lay-verify="password" autocomplete="off" placeholder="这里输入密码" class="layui-input">
					</div>
					<div class="layui-form-item">
						<div class="beg-pull-left beg-login-remember">
							<label>记住帐号？</label>
							<input type="checkbox" name="rememberMe" value="true" lay-skin="switch" checked title="记住帐号">
						</div>
						<div class="beg-pull-right">
							<button id="loginButton" class="layui-btn layui-btn-primary" lay-submit lay-filter="login">
                            登录
                        </button>
						</div>
						<div class="beg-pull-right">
							<button class="layui-btn layui-btn-primary" lay-submit lay-filter="login">
								 注册
							</button>
						</div>
						<div class="beg-clear"></div>
					</div>
			</div>
			<footer>
				<p>装饰管理系统</p>
			</footer>
		</div>
		<script type="text/javascript" src="plugins/layui/layui.js"></script>
		<script>
            $(document).ready(function(){
                console.log("aaaaa");
                //传递字符串格式json对象到后台（一个json对象）
                $("#loginButton").click(function(){
                    console.log("aaaaa");
                    var userId =encodeURI($("#userId").attr("value"));
                    var password = encodeURI($("#password").attr("value"));

                    $.ajax({
						type : "GET",
                        contentType: "application/json",
                        url:"/user/login" ,
                        data:{
							userId : userId,
							password : password
                        },
                        success:function(result){
							if (result.status == 1) {
                                $("#userId").val("");
                                $("#password").val("");
								alert("密码错误，请重新登录");
							} else if(result.status == 2) {
                                $("#userId").val("");
                                $("#password").val("");
                                alert("用户不存在，请重新登录")
							} else {
                                location.href='index.html';
                            }
                        }
                    });
                });
			});
		</script>
	</body>

</html>