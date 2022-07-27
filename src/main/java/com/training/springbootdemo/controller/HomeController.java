package com.training.springbootdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.springbootdemo.service.HomeService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	HomeService service; // will autowire service instance
	
	@RequestMapping("/login")
	public String hello(HttpServletRequest req) {
				
		String uName = req.getParameter("uname"); // this will fetch the uname from jsp page
		String pwd = req.getParameter("pwd");
		boolean valid = service.isValid(uName, pwd);// call the service method
		if(valid)
			return "main";
		else {
			return "failure";
		}
	}
	@RequestMapping(method=RequestMethod.GET)
	public String sayHi() {
		return "login";
	}

}
