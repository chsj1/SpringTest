package com.hjd.day01;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("userAction")
public class UserAction {
	
	@Resource(name="userService")
	private UserService userService;
	
	
	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public void execute(){
		userService.save();
	}
}
