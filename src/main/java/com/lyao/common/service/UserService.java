package com.lyao.common.service;

import java.util.List;

import com.lyao.system.user.pojo.vo.L_user;


public interface UserService {
	/**
	 * 根据用户名称获取其基本信息，用户登录用
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	L_user selectUser(String userNO,String password) throws Exception;
	/**
	 * 根据userno查询角色
	 * @param userNO
	 * @return
	 * @throws Exception
	 */
	List<String> selectRoles(Integer userNO) throws Exception;
	/**
	 * 根据userno查询角色下的权限
	 * @param userNO
	 * @return
	 * @throws Exception
	 */
	List<String> selectPermissions(Integer userNO) throws Exception;
}
