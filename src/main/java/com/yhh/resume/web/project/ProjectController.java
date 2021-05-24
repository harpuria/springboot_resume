package com.yhh.resume.web.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	@Autowired
	ProjectService service;
	
	@GetMapping("/projectAllSelect")
	public List<ProjectDto> projectAllSelect() throws Exception{
		return service.projectAllSelect();
	}
	
	@PostMapping("/projectInsert")
	public void projectInsert(@RequestBody ProjectDto dto) throws Exception{
		service.projectInsert(dto);
	}
	
	@PostMapping("/projectDelete")
	public void projectDelete(@RequestBody ProjectDto dto) throws Exception{
		service.projectDelete(dto);
	}
	
	@PostMapping("/projectUpdate")
	public void projectUpdate(@RequestBody ProjectDto dto) throws Exception{
		service.projectUpdate(dto);
	}
	
}
