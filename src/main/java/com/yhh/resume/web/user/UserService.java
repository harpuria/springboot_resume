package com.yhh.resume.web.user;

import java.math.BigInteger;
import java.security.MessageDigest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserMapper mapper;
	
	public UserDto login(UserDto dto) throws Exception {
		// SHA-256 은 복호화가 불가능하므로, 들어온 비번 값을 암호화 한 뒤 비교해서 일치하면 로그인 처리
		String tmpPw = dto.getPassword();
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(tmpPw.getBytes());
		String hex = String.format("%064x", new BigInteger(1, md.digest()));
		dto.setPassword(hex);
		
		UserDto result = mapper.login(dto);
		
		return result;
	}
	
	public void signin(UserDto dto) throws Exception{
		// 패스워드 암호화하여 DB에 저장
		String tmpPw = dto.getPassword();
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(tmpPw.getBytes());
		String hex = String.format("%064x", new BigInteger(1, md.digest()));
		
		dto.setPassword(hex);
		mapper.singin(dto);
	}
}
