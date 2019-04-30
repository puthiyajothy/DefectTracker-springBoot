package com.Defect.Tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.Defect.Tracker.entities.AddProject;
import com.Defect.Tracker.repository.AddProjectRepository;

@Service
public class AddProjectServiceImp implements AddProjectService {
	
@Autowired
 	public AddProjectRepository addprojectRepository;

@Override
	public void saveproject(AddProject addproject) {
	addprojectRepository.save(addproject);
	
}

@Override
public List<AddProject> getAllProjects() {
	return addprojectRepository.findAll();
}

@Override
public AddProject FindById(Long id) {
	return addprojectRepository.findByprojectId(id);
}



@Override
public void updateproject(AddProject addProject) {
	addprojectRepository.save(addProject);
	
}

@Override
public void deleteprojectById(long id) {
	addprojectRepository.deleteById(id);
	
}


	



}
