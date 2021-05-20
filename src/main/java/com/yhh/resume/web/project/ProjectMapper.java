package com.yhh.resume.web.project;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ProjectMapper {
	List<ProjectDto> projectAllSelect();
}
