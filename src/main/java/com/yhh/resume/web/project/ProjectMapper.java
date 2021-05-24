package com.yhh.resume.web.project;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.yhh.resume.web.skill.SkillDto;

@Repository
@Mapper
public interface ProjectMapper {
	List<ProjectDto> projectAllSelect();
	void projectInsert(ProjectDto dto);
	void projectDelete(ProjectDto dto);
	void projectUpdate(ProjectDto dto);
}
