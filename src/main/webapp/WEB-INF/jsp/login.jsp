<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.shiro.authc.*,com.lyao.security.*" %>  
<%@ include file="../basicViews/common.jsp" %>  
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>登录界面</title>
	<script type="text/javascript" src="${ctxStatic }/js/login.js"></script>
</head>
<body>
	<div class="container-fluid">
    	<div class="row">
			<!-- 左侧图片展示 -->
			<div class="col-md-8">
			
			</div>
			<!-- 右侧登录提示 -->
			<div class="col-md-4">
			  	<div class="panel panel-default">
					<div class="panel-heading">请登录，谢谢</div>
					<div class="panel-body">
						<form class="form-horizontal" method="POST" action="${ctx}/login">
						  <div class="form-group">
						    <label for="username" class="col-md-2 control-label">用户名</label>
						    <div class="col-md-10">
						    	<input type="text" class="form-control" name="username" placeholder="邮箱/手机号" value="${userName }">
							</div>
						  </div>
						  <div class="form-group">
						    <label for="password" class="col-md-2 control-label">密码</label>
						    <div class="col-md-10">
						    	<input type="password" class="form-control" name="password" placeholder="密码">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="captcha" class="col-md-2 control-label">验证码</label>
						    <div class="col-md-10">
						    	<input type="text" class="form-control" name="captcha">
						    	<img src="Kaptcha.jpg" onclick="changeVerifyCode()" id="yzmImg" style="cursor: pointer;">
	                     		<a href="javascript:void(0)" onclick="changeVerifyCode()">看不清，换一张</a>
						    </div>
						  </div>
						  <div class="form-group">
							  <div class="col-md-12">
							      <input type="checkbox" class="" name="rememberMe" placeholder="记住我"> 
							      <label for="rememberMe" class="">记住登录状态(24小时)</label>
							  </div>
						  </div>
						  <button type="submit" class="btn btn-default">登录</button>
						</form>
					</div>
				</div>
				<!-- 警告框 -->
				<c:if test="${not empty msg }">
					<div class="alert alert-danger alert-dismissible" role="alert">
					  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					  <strong>注意!</strong>${msg }
					</div>
				</c:if>
			</div>
		</div>
	</div>
</body>
</html>