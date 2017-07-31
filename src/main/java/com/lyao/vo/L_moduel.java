package com.lyao.vo;

public class L_moduel {
	private int id;
	private String moduelcode;
	private String moduelname;
	private String moduelurl;
	private String isparentmoduel;
	private String parentmoduel;
	private short displayorder;
	private String remark;
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setModuelcode(String moduelcode){
		this.moduelcode=moduelcode;
	}
	public String getModuelcode(){
		return moduelcode;
	}
	public void setModuelname(String moduelname){
		this.moduelname=moduelname;
	}
	public String getModuelname(){
		return moduelname;
	}
	public void setModuelurl(String moduelurl){
		this.moduelurl=moduelurl;
	}
	public String getModuelurl(){
		return moduelurl;
	}
	public void setIsparentmoduel(String isparentmoduel){
		this.isparentmoduel=isparentmoduel;
	}
	public String getIsparentmoduel(){
		return isparentmoduel;
	}
	public void setParentmoduel(String parentmoduel){
		this.parentmoduel=parentmoduel;
	}
	public String getParentmoduel(){
		return parentmoduel;
	}
	public void setDisplayorder(short displayorder){
		this.displayorder=displayorder;
	}
	public short getDisplayorder(){
		return displayorder;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
}
