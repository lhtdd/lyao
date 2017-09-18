package com.lyao.system.user.pojo.vo;

public class L_rolemp {
	private int id;
	private String roleid;
	private int pid;
	private String remark;
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setRoleid(String roleid){
		this.roleid=roleid;
	}
	public String getRoleid(){
		return roleid;
	}
	public void setPid(int pid){
		this.pid=pid;
	}
	public int getPid(){
		return pid;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
}
