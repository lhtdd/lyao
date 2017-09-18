package com.lyao.core.shiro.filters;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import com.lyao.core.shiro.CaptchaUsernamePasswordToken;
import com.lyao.core.shiro.IncorrectCaptchaException;

public class CaptchaFormAuthenticationFilter extends FormAuthenticationFilter {

	public static final String DEFAULT_CAPTCHA_PARAM = "captcha"; 
	   
	   private String captchaParam = DEFAULT_CAPTCHA_PARAM; 
	   
	   public String getCaptchaParam() { 
	      return captchaParam; 
	   } 
	   
	   public void setCaptchaParam(String captchaParam) { 
	      this.captchaParam = captchaParam; 
	   } 
	   
	   protected String getCaptcha(ServletRequest request) { 
	      return WebUtils.getCleanParam(request, getCaptchaParam()); 
	   } 
	   
	   // 创建 Token 
	   protected CaptchaUsernamePasswordToken createToken(ServletRequest request, ServletResponse response) { 
	      String username = getUsername(request); 
	      String password = getPassword(request); 
	      String captcha = getCaptcha(request); 
	      boolean rememberMe = isRememberMe(request); 
	      String host = getHost(request); 
	      return new CaptchaUsernamePasswordToken(username, password, rememberMe, host,captcha); 
	   } 
	   
	   // 验证码校验
	   protected void doCaptchaValidate( HttpServletRequest request,CaptchaUsernamePasswordToken token ){ 
	      String captcha = (String)request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY); 
	      
	      if(captcha!=null && !captcha.equalsIgnoreCase(token.getCaptcha())){ 
	         throw new IncorrectCaptchaException ("验证码错误！"); 
	      } 
	   } 
	   
	   // 执行登录操作
	   protected boolean executeLogin(ServletRequest request,ServletResponse response){ 
	      CaptchaUsernamePasswordToken token = createToken(request, response); 
	      String msg = null;
	      try { 
	         doCaptchaValidate((HttpServletRequest)request,token); 
	         Subject subject = getSubject(request, response); 
	         subject.login(token); 
	         // 如果登录成功则返回false 即推出拦截器，不再向下执行。
	         return onLoginSuccess(token, subject, request, response); 
	      } catch (IncorrectCaptchaException e) {  
	          msg = "验证码错误";
	      } catch (IncorrectCredentialsException e) {  
	          msg = "登录密码错误";  
	      } catch (ExcessiveAttemptsException e) {  
	          msg = "登录失败次数过多";  
	      } catch (LockedAccountException e) {  
	          msg = "帐号已被锁定"; 
	      } catch (DisabledAccountException e) {  
	          msg = "帐号已被禁用";  
	      } catch (ExpiredCredentialsException e) {  
	          msg = "帐号已过期"; 
	      } catch (UnknownAccountException e) {  
	          msg = "帐号不存在 "; 
	      } catch (AuthenticationException e) { 
	    	  msg = "登录出错！";
		  } catch (Exception e) {
			  msg = "异常！";
		}
	      request.setAttribute("msg", msg);
	      // 如果登录失败，则继续向下执行。即走到action方法中
          return true; 
	   } 
	   
}
