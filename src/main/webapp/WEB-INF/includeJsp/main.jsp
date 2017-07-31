<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="mainWrap">
    <!-- 查询栏  如果查询条件很多的话，可以考虑使用模态窗口展示查询条件 -->
	<div class="panel panel-default mainQuery">
	    <div class="panel-heading mainQuery-title">
	      <h4 class="panel-title">
	        <a>
	         	 基本信息
	        </a>
	      </h4>
	    </div>
	    <div class="panel-body mainQuery-info">
	    	<form class="form-inline center-block">
			  <div class="form-group form-group-sm">
			    <label for="beginTime">日期</label>
			    <input type="date" class="form-control" id="beginTime" placeholder="2016-02-18">
			  </div>
			  <div class="form-group form-group-sm">
			    <label for="email">Email</label>
			    <input type="email" class="form-control" id="email" placeholder="773121935@qq.com">
			  </div>
			  <button type="submit" class="btn btn-default btn-sm">查询</button>
			</form>
	    </div>
	</div>
	<!-- 查询内容 -->
	<div class="panel panel-default mainContent">
	    <div class="mainContent-opt">
			<button class="btn btn-default btn-xs" type="submit">增加</button>
			<button class="btn btn-default btn-xs" type="submit">编辑</button>
			<button class="btn btn-default btn-xs" type="submit">删除</button>
			<button class="btn btn-default btn-xs" type="submit">查看</button>
	    </div>
	    <div class="mainContent-table">
		    <table class="table table-hover modefyTable">
			   <thead>
			      <tr>
			         <th>名称</th>
			         <th>城市</th>
			         <th>密码</th>
			      </tr>
			   </thead>
			   <tbody>
			      <tr>
			         <td>Tanmay</td>
			         <td>Bangalore</td>
			         <td>560001</td>
			      </tr>
			      <tr>
			         <td>Sachin</td>
			         <td>Mumbai</td>
			         <td>400003</td>
			      </tr>
			      <tr>
			         <td>Uma</td>
			         <td>Pune</td>
			         <td>411027</td>
			      </tr>
			      <tr>
			         <td>Uma</td>
			         <td>Pune</td>
			         <td>411027</td>
			      </tr>
			      <tr>
			         <td>Uma</td>
			         <td>Pune</td>
			         <td>411027</td>
			      </tr>
			      <tr>
			         <td>Uma</td>
			         <td>Pune</td>
			         <td>411027</td>
			      </tr>
			      <tr>
			         <td>Uma</td>
			         <td>Pune</td>
			         <td>411027</td>
			      </tr>
			      <tr>
			         <td>Uma</td>
			         <td>Pune</td>
			         <td>411027</td>
			      </tr>
			      <tr>
			         <td>Uma</td>
			         <td>Pune</td>
			         <td>411027</td>
			      </tr>
			      <tr>
			         <td>Uma</td>
			         <td>Pune</td>
			         <td>411027</td>
			      </tr>
			      <tr>
			         <td>Uma</td>
			         <td>Pune</td>
			         <td>411027</td>
			      </tr>
			      <tr>
			         <td>Uma</td>
			         <td>Pune</td>
			         <td>411027</td>
			      </tr>
			   </tbody>
			</table>
		</div>
	</div>
	<!-- 分页条 -->
	<div class="mainPagination">
	  <ul class="pagination paginationUl">
	    <li>
	      <a href="#" aria-label="Previous">
	        <span aria-hidden="true">&laquo;</span>
	      </a>
	    </li>
	    <li><a href="#">1</a></li>
	    <li><a href="#">2</a></li>
	    <li><a href="#">3</a></li>
	    <li><a href="#">4</a></li>
	    <li><a href="#">5</a></li>
	    <li>
	      <a href="#" aria-label="Next">
	        <span aria-hidden="true">&raquo;</span>
	      </a>
	    </li>
	  </ul>
	  <!-- 清除浮动 -->
	  <div class="clearfix"></div>
	</div>
</div>