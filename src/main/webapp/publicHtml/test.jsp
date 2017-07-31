<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/basicViews/common.jsp" %>    
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>测试1</title>
	<style>
		html,body{
			height: 100%;
		    margin: 0px;
		    padding: 0px;
		}
		.header{
			height: 6%;
			background-color: #FFFFCC;	
		}
		.main{
			height: 90%;
			background-color: #CCFFFF;		
		}
		.footer{
			height: 4%;	
			background-color: #FFCCCC;	
		}
    </style>
</head>
<body>
	<div class="header"></div>
	<div class="main"></div>
	<div class="footer"></div>
</body>
</html>