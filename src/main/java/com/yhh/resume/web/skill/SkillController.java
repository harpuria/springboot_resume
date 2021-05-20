package com.yhh.resume.web.skill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
	@Autowired
	SkillService service;
	
	@GetMapping("/skillAllSelect")
	public List<SkillDto> skillAllSelect() throws Exception{
		return service.skillAllSelect();
	}
	
	@PostMapping("/skillInsert")
	public void skillInsert(@RequestBody SkillDto dto) throws Exception{
		service.skillInsert(dto);
	}
	
	@PostMapping("/skillDelete")
	public void skillDelete(@RequestBody SkillDto dto) throws Exception{
		service.skillDelete(dto);
	}
}
