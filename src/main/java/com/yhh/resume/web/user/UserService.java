package com.yhh.resume.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserMapper mapper;
	
	public void login(UserDto dto) {
		mapper.login(dto);
		
		// 암호화된 패스워드를 여기서 복호화 처리한 뒤, 일치하면 로그인 성공 처리
		// 일치하지 않으면 실패 처리하면 된다
	}
}
