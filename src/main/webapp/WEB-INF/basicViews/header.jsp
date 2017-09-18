<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="navbar navbar-default navbarHeader" role="navigation">
   <div class="navbar-header">
      <a class="navbar-brand navbarTitle" href="publicHtml/test.jsp">业务数据后台综合管理平台</a>
   </div>
   <div class="navbar-right navbarContent">
      <shiro:user>
      	欢迎<shiro:principal/> <a class="btn btn-default navbar-btn" href="${ctx}/logout">退出</a>
      </shiro:user>
      <shiro:guest>  
	          欢迎游客访问，<a href="/">登录</a>  
	  </shiro:guest>
   </div>
</div>