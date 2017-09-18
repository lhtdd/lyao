<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="panel-group" id="accordion">
	<shiro:hasRole name="001">
		<div class="panel panel-default">
			<div class="panel-heading titleBgColor">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseOne"> 系统管理 </a>
				</h4>
			</div>
			<div id="collapseOne" class="panel-collapse collapse in">
				<ul class="list-group">
					<shiro:hasPermission name="system:role:view">
						<li class="list-group-item">用户管理</li>
					</shiro:hasPermission>
					<shiro:hasPermission name="system:role:view">
						<li class="list-group-item">角色管理</li>
					</shiro:hasPermission>
					<shiro:hasPermission name="system:role:view">
						<li class="list-group-item">权限管理</li>
					</shiro:hasPermission>
				</ul>
			</div>
		</div>
	</shiro:hasRole>
	<shiro:hasAnyRoles name="001,002">
		<div class="panel panel-default">
			<div class="panel-heading titleBgColor">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseTwo"> 订单管理 </a>
				</h4>
			</div>
			<div id="collapseTwo" class="panel-collapse collapse">
				<ul class="list-group">
					<li class="list-group-item">已有订单</li>
					<li class="list-group-item">有效订单</li>
					<li class="list-group-item">历史订单</li>
					<li class="list-group-item">24*7 支持</li>
					<li class="list-group-item">每年更新成本</li>
				</ul>
			</div>
		</div>
	</shiro:hasAnyRoles>
	<shiro:hasAnyRoles name="001,004">
		<div class="panel panel-default">
			<div class="panel-heading titleBgColor">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseThree"> 仓储管理 </a>
				</h4>
			</div>
			<div id="collapseThree" class="panel-collapse collapse">
				<ul class="list-group">
					<li class="list-group-item">免费域名注册</li>
					<li class="list-group-item">免费 Window 空间托管</li>
					<li class="list-group-item">图像的数量</li>
					<li class="list-group-item">24*7 支持</li>
					<li class="list-group-item">每年更新成本</li>
				</ul>
			</div>
		</div>
	</shiro:hasAnyRoles>
	<shiro:hasAnyRoles name="003,004">
		<div class="panel panel-default">
			<div class="panel-heading titleBgColor">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseFour"> 配送管理 </a>
				</h4>
			</div>
			<div id="collapseFour" class="panel-collapse collapse">
				<ul class="list-group">
					<li class="list-group-item">免费域名注册</li>
					<li class="list-group-item">免费 Window 空间托管</li>
					<li class="list-group-item">图像的数量</li>
					<li class="list-group-item">24*7 支持</li>
					<li class="list-group-item">每年更新成本</li>
				</ul>
			</div>
		</div>
	</shiro:hasAnyRoles>
</div>