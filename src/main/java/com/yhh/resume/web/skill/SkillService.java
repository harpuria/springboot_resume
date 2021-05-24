package com.yhh.resume.web.skill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
	
	@Autowired
	SkillMapper mapper;
	
	public List<SkillDto> skillAllSelect(){
		return mapper.skillAllSelect();
	}
	
	public void skillInsert(SkillDto dto) {
		mapper.skillInsert(dto);
	}
	
	public void skillDelete(SkillDto dto) {
		mapper.skillDelete(dto);
	}
	
	public void skillUpdate(SkillDto dto) {
		mapper.skillUpdate(dto);
	}
}
