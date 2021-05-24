package com.yhh.resume.web.user;

import java.math.BigInteger;
import java.security.MessageDigest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserMapper mapper;
	
	public void login(UserDto dto) throws Exception {
		//mapper.login(dto);
		
		// 암호화된 패스워드를 여기서 복호화 처리한 뒤, 일치하면 로그인 성공 처리
		// 일치하지 않으면 실패 처리하면 된다
		
		// 암호가 1234 라고 가정해보자
		// 저장할 때 이 방법으로 저장해보는게 좋겠다. 간단한 암호화 복호화 연습.
		String tmpPw = "1234";
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(tmpPw.getBytes());
		String hex = String.format("%064x", new BigInteger(1, md.digest()));
		System.out.println(hex);
	}
}
