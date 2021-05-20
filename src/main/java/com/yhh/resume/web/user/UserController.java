package com.yhh.resume.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@GetMapping("/login")
	public String login(@RequestBody UserDto dto) throws Exception{
		service.login(dto);
		return "";
	}
}
