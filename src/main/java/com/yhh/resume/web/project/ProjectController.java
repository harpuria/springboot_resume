package com.yhh.resume.web.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	@Autowired
	ProjectService service;
	
	@GetMapping("/projectAllSelect")
	public List<ProjectDto> projectAllSelect() throws Exception{
		return service.projectAllSelect();
	}
	
}
