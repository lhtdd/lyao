package com.lyao.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lyao.service.UserService;

@Controller
public class LoginController {
	
	private final Logger log = Logger.getLogger(LoginController.class);
	@Autowired
	private UserService userService;
	@RequestMapping(value = "/login",method = RequestMethod.GET)  
	public ModelAndView testLogin() { 
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
	public ModelAndView testLogin(HttpServletRequest request) {  
	    ModelAndView mv = new ModelAndView();
	    String userName = (String) request.getParameter("username");
	    String msg = (String) request.getAttribute("msg");
	    HashMap<String,String> modelMap = new HashMap<String,String>();
	    modelMap.put("username", userName);
	    modelMap.put("msg", msg);
	    mv.addAllObjects(modelMap);
	    mv.setViewName("login");
	    return mv;  
	} 
	@RequestMapping(value = "/index")  
	public ModelAndView goHome() { 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;  
	} 
}
