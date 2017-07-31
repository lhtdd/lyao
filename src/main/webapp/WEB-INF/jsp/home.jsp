<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<jsp:include page="../basicViews/header.jsp"></jsp:include>
	<!-- 网页中部 -->
	<div class="container-fluid middleDiv">
	    <div class="row">
		    <!-- 左侧菜单栏 -->
		    <div class="col-md-2">
				<jsp:include page="../includeJsp/leftMenu.jsp"></jsp:include>
			</div>
		    <!-- 右侧主页面 -->    
		    <div class="col-md-10">
				<jsp:include page="../includeJsp/main.jsp"></jsp:include>
		    </div>    
	    </div>
	</div>
	<!-- 网页底部 -->
	<jsp:include page="../basicViews/footer.jsp"></jsp:include>
</body>
</html>