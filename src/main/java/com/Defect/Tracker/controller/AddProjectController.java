package com.Defect.Tracker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.Defect.Tracker.entities.AddProject;
import com.Defect.Tracker.service.AddProjectService;

@RestController
@CrossOrigin("http://localhost:3000")
public class AddProjectController {
	
	@Autowired
	public AddProjectService addProjectService;

	@CrossOrigin("http://localhost:3000")
	@PostMapping("/addproject")
	public HttpStatus createproject(@Valid @RequestBody AddProject addproject ) {
		addProjectService.saveproject(addproject);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/getAllProjects")
	public List<AddProject>getAllProjects(){
		return addProjectService.getAllProjects();
	}
	
	
	@GetMapping("findbyid/{id}")
	public ResponseEntity<AddProject>getAllProjects(@PathVariable("id")Long id){
		return new ResponseEntity<AddProject>(addProjectService.FindById(id),HttpStatus.OK);

		
	}
	@CrossOrigin("http://localhost:3000")
	@PutMapping("/updateprojects")
	public ResponseEntity<AddProject>updateproject(@Valid @RequestBody AddProject addProject){
		addProjectService.updateproject(addProject);
		return new ResponseEntity<AddProject>(addProject,HttpStatus.NO_CONTENT);
		
	}
	@CrossOrigin("http://localhost:3000")
	@DeleteMapping("/deleteproject/{id}")
	public ResponseEntity<AddProject>deleteproject(@PathVariable("id")Long id){
		addProjectService.deleteprojectById(id);
		return new ResponseEntity<AddProject>(HttpStatus.NO_CONTENT);
		
	}
}
