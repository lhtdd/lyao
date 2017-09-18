package com.lyao.system.user.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyao.common.dao.CommonBaseDao;
import com.lyao.common.service.UserService;
import com.lyao.system.user.pojo.vo.L_user;
@Service
public class UserImpl implements UserService {
	private final Logger log= Logger.getLogger(UserImpl.class);
	@Autowired
	public CommonBaseDao commonBaseDao;
	public L_user selectUser(String userNO,String password) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userNO", userNO);
		L_user user = commonBaseDao.selectOne("L_userMapper.selectUserByID", paramMap);
		return user;
	}
	@Override
	public List<String> selectRoles(Integer userNO) throws Exception {
		List<String> rolesList = commonBaseDao.selectList("L_userMapper.selectRoleCodeByUserNO", userNO);
		return rolesList;
	}
	@Override
	public List<String> selectPermissions(Integer userNO) throws Exception {
		List<String> permissionsList = commonBaseDao.selectList("L_userMapper.selectPermissionCodeByUserNO", userNO);
		return permissionsList;
	}

}
