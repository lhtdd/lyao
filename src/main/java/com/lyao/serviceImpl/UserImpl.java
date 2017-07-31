package com.lyao.serviceImpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyao.dao.CommonBaseDao;
import com.lyao.service.UserService;
import com.lyao.vo.L_user;
@Service
public class UserImpl implements UserService {
	private final Logger log= Logger.getLogger(UserImpl.class);
	@Autowired
	public CommonBaseDao baseDao;
	public L_user selectUser(String name) throws Exception {
		log.info("正在查询用户名："+name+" 的信息！");
		L_user user = baseDao.selectOne("L_userMapper.selectByPrimaryKey", name);
		return user;
	}

}
