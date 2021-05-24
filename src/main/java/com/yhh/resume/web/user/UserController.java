package com.yhh.resume.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@PostMapping("/login")
	public UserDto login(@RequestBody UserDto dto) throws Exception{
		UserDto result = service.login(dto);
		return result;
	}
	
	@PostMapping("/signin")
	public void signin(@RequestBody UserDto dto) throws Exception{
		service.signin(dto);
	}
}
