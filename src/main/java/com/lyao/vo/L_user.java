package com.lyao.vo;

public class L_user {
	private int id;
	private int userno;
	private String name;
	private String password;
	private short status;
	private String belongorg;
	private String remark;
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
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
	public void setStatus(short status){
		this.status=status;
	}
	public short getStatus(){
		return status;
	}
	public void setBelongorg(String belongorg){
		this.belongorg=belongorg;
	}
	public String getBelongorg(){
		return belongorg;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
}
