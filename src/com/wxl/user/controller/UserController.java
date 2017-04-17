package com.wxl.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wxl.user.model.User;
import com.wxl.user.service.UserService;
import com.wxl.user.service.UserServiceImpl;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userServiceImpl;
	@RequestMapping("/login")
	public String login(HttpSession session){
		User user = userServiceImpl.find(1);
		session.setAttribute("user", user);
		System.out.println("登录");
		return "showUser";
	}
	
	
}
