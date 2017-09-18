package com.lyao.system.user.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lyao.common.service.UserService;

@Controller
public class LoginController {
	
	private final Logger log = Logger.getLogger(LoginController.class);
	@Autowired
	private UserService userService;
	@RequestMapping(value = "/")  
	public ModelAndView toLogin() { 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;  
	} 
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)  
	public ModelAndView directLogin() { 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;  
	} 
	/**
	 * shiro框架进行登录验证时，如果验证失败了走该方法，成功了走shiro里的successURL或者客户请求的页面。
	 * @param request
	 * @param userName
	 * @param password
	 * @param verifyCode
	 * @return
	 */
	@RequestMapping(value = "/login",method = RequestMethod.POST)  
	public ModelAndView login() {  
	    ModelAndView mv = new ModelAndView();
    	mv.setViewName("login");
	    return mv;  
	} 
	@RequestMapping(value = "/index")  
	public ModelAndView goHome() { 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;  
	} 
	
	@RequestMapping(value = "/unAuthentication")  
	public ModelAndView goUnAuthentication() { 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("unAuthentication");
		return mv;  
	} 
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)  
	public ModelAndView logout() { 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;  
	} 
}
