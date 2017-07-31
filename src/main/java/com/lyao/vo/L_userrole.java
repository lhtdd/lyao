package com.lyao.vo;

public class L_userrole {
	private int id;
	private int userno;
	private String rolecode;
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
	public void setRolecode(String rolecode){
		this.rolecode=rolecode;
	}
	public String getRolecode(){
		return rolecode;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getDescription(){
		return description;
	}
}
