package com.lyao.interceptor;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.lyao.security.IncorrectCaptchaException;

public class LyaoExceptionHandler implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request,HttpServletResponse response, Object obj, Exception ex) {
		Map<String, Object> model = new HashMap<String, Object>();  
        model.put("ex", ex); 
        // 根据不同错误转向不同页面  
        if(ex instanceof IncorrectCaptchaException) { 
            return new ModelAndView("redirect:/login");
        }  
		return null;
	}

}
