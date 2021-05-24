package com.yhh.resume.web.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhh.resume.web.skill.SkillDto;

@Service
public class ProjectService {
	@Autowired
	ProjectMapper mapper;
	
	public List<ProjectDto> projectAllSelect(){
		return mapper.projectAllSelect();
	}
	
	public void projectInsert(ProjectDto dto) {
		mapper.projectInsert(dto);
	}
	
	public void projectDelete(ProjectDto dto) {
		mapper.projectDelete(dto);
	}
	
	public void projectUpdate(ProjectDto dto) {
		mapper.projectUpdate(dto);
	}
}
