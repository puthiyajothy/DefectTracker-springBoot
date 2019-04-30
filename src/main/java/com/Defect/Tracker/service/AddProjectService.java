package com.Defect.Tracker.service;

import java.util.List;

import com.Defect.Tracker.entities.AddProject;

public interface AddProjectService {

	void saveproject(AddProject addproject);
	List<AddProject>getAllProjects();
	AddProject FindById(Long id);
	void updateproject(AddProject addProject);
	void deleteprojectById(long id);
}
