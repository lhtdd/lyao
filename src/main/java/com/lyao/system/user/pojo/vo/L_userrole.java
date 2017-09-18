package com.lyao.system.user.pojo.vo;

public class L_userrole {
	private int id;
	private int userno;
	private String roleid;
	private String description;
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setUserno(int userno){
		this.userno=userno;
	}
	public int getUserno(){
		return userno;
	}
	public void setRoleid(String roleid){
		this.roleid=roleid;
	}
	public String getRoleid(){
		return roleid;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getDescription(){
		return description;
	}
}
