package cn.itcast.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.pojo.User;
import cn.itcast.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("user")
	public String saveUser(){
		User user=new User();
		user.setUsername("张信哲");
		user.setDate(new Date());
		userService.saveUser(user);
		return "success";
	}
	
	
	
	

}
