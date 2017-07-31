package com.lyao.vo;

public class L_role {
	private int id;
	private String rolecode;
	private String rolename;
	private String description;
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setRolecode(String rolecode){
		this.rolecode=rolecode;
	}
	public String getRolecode(){
		return rolecode;
	}
	public void setRolename(String rolename){
		this.rolename=rolename;
	}
	public String getRolename(){
		return rolename;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getDescription(){
		return description;
	}
}
