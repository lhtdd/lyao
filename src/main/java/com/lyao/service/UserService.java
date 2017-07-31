package com.lyao.service;

import com.lyao.vo.L_user;


public interface UserService {
	/**
	 * 根据用户名称获取其基本信息，用户登录用
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	L_user selectUser(String name) throws Exception;
}
