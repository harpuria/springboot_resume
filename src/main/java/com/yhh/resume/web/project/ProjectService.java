package com.yhh.resume.web.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
	@Autowired
	ProjectMapper mapper;
	
	public List<ProjectDto> projectAllSelect(){
		return mapper.projectAllSelect();
	}
}
