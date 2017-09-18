package com.lyao.system.user.pojo.vo;

public class L_permission {
	private int id;
	private String percode;
	private String pername;
	private String description;
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setPercode(String percode){
		this.percode=percode;
	}
	public String getPercode(){
		return percode;
	}
	public void setPername(String pername){
		this.pername=pername;
	}
	public String getPername(){
		return pername;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getDescription(){
		return description;
	}
}
