package com.yhh.resume.web.user;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
	UserDto login(UserDto dto);
	void singin(UserDto dto);
}
