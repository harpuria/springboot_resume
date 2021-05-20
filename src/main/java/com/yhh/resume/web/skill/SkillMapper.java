package com.yhh.resume.web.skill;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SkillMapper {
	List<SkillDto> skillAllSelect();
	void skillInsert(SkillDto dto);
	void skillDelete(SkillDto dto);
}
