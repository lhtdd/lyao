<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<%@ include file="../basicViews/common.jsp" %>    
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>首页</title>
	<link rel="stylesheet" href="${ctxStatic }/css/global.css">
	<link rel="stylesheet" href="${ctxStatic }/css/header.css">
	<link rel="stylesheet" href="${ctxStatic }/css/main.css">	
	<link rel="stylesheet" href="${ctxStatic }/css/footer.css">	
</head>
<body>
	<!-- 网页头部 -->
	<%@ include file="../basicViews/header.jsp" %> 
	<!-- 网页中部 -->
	<div class="container-fluid middleDiv">
	    <div class="row">
		    <!-- 左侧菜单栏 -->
		    <div class="col-md-2">
		   		<%@ include file="../includeJsp/leftMenu.jsp" %>
			</div>
		    <!-- 右侧主页面 -->    
		    <div class="col-md-10">
		    	<%@ include file="../includeJsp/main.jsp" %>
		    </div>    
	    </div>
	</div>
	<!-- 网页底部 -->
	<%@ include file="../basicViews/footer.jsp" %>
</body>
</html>