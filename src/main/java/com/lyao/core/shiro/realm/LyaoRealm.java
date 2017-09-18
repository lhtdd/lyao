package com.lyao.core.shiro.realm;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.lyao.common.service.UserService;
import com.lyao.system.user.pojo.vo.L_user;

import org.apache.shiro.authc.SimpleAuthenticationInfo;
/**
 * 自定义realm
 * @author lyao
 *
 */
public class LyaoRealm extends AuthorizingRealm {

	private final Logger log = Logger.getLogger(LyaoRealm.class);
	@Autowired
	public UserService userServiceImpl;
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException{
		String userNO = (String)token.getPrincipal();  //得到用户名  
		String password = new String((char[])token.getCredentials()); //得到密码
		L_user user = null;
		log.info("正在认证用户:"+userNO);
		try {
			user = userServiceImpl.selectUser(userNO, password);
		} catch (Exception e) {
			log.error("查询失败");
			e.printStackTrace();
			throw new AuthenticationException("系统异常，查询失败，请稍后再试");
		}
		if (user == null){
			throw new UnknownAccountException("不存在该用户");
		}
		return new SimpleAuthenticationInfo(user.getUserno(), user.getPassword(), ByteSource.Util.bytes(user.getSalt()), getName());
	}
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {
//		L_user user = (L_user) SecurityUtils.getSubject().getPrincipal();
		Integer userno = (Integer) SecurityUtils.getSubject().getPrincipal();
		log.info("正在给用户"+userno+"授权");
		SimpleAuthorizationInfo info =  new SimpleAuthorizationInfo();
		try {
			List<String> roles = userServiceImpl.selectRoles(userno);
			info.addRoles(roles);
			List<String> permissions = userServiceImpl.selectPermissions(userno);
			info.addStringPermissions(permissions);
		} catch (Exception e) {
			log.error("授权失败，系统异常");
			e.printStackTrace();
		}
		log.info("授权成功");
		return info;
	}


	
}
