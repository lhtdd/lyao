package com.lyao.security;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

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
	   
	   // 认证
	   protected boolean executeLogin(ServletRequest request,ServletResponse response) throws Exception { 
	      CaptchaUsernamePasswordToken token = createToken(request, response); 
	      String msg = null;
	      try { 
	         doCaptchaValidate((HttpServletRequest)request,token); 
	         Subject subject = getSubject(request, response); 
	         subject.login(token); 
	         return onLoginSuccess(token, subject, request, response); 
	      } catch (IncorrectCaptchaException e) {  
	          msg = "验证码错误";
	          request.setAttribute("msg", msg);
	          return onLoginFailure(token, e, request, response); 
	      } catch (IncorrectCredentialsException e) {  
	          msg = "登录密码错误";  
	          request.setAttribute("msg", msg);
	          return onLoginFailure(token, e, request, response); 
	      } catch (ExcessiveAttemptsException e) {  
	          msg = "登录失败次数过多";  
	          request.setAttribute("msg", msg);
	          return onLoginFailure(token, e, request, response);
	      } catch (LockedAccountException e) {  
	          msg = "帐号已被锁定"; 
	          request.setAttribute("msg", msg);
	          return onLoginFailure(token, e, request, response);
	      } catch (DisabledAccountException e) {  
	          msg = "帐号已被禁用";  
	          request.setAttribute("msg", msg);
	          return onLoginFailure(token, e, request, response);
	      } catch (ExpiredCredentialsException e) {  
	          msg = "帐号已过期"; 
	          request.setAttribute("msg", msg);
	          return onLoginFailure(token, e, request, response);
	      } catch (UnknownAccountException e) {  
	          msg = "帐号不存在 "; 
	          request.setAttribute("msg", msg);
	          return onLoginFailure(token, e, request, response);
	      } catch (AuthenticationException e) { 
	    	  msg = "登录出错！";
	    	  request.setAttribute("msg", msg);
		      return onLoginFailure(token, e, request, response); 
		  }
	   } 
	   
}
