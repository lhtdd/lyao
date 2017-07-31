package com.lyao.vo;

public class L_rolemp {
	private int id;
	private String rolecode;
	private int mpid;
	private String remark;
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
	public void setMpid(int mpid){
		this.mpid=mpid;
	}
	public int getMpid(){
		return mpid;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
}
