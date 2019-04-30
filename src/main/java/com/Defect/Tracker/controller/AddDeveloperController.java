package com.Defect.Tracker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Defect.Tracker.entities.AddDeveloper;

import com.Defect.Tracker.service.AddDeveloperService;

@RestController
public class AddDeveloperController {
	
	@Autowired
	public AddDeveloperService addDeveloperService;
	
	
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/adddeveloper")
	public HttpStatus createdeveloper(@Valid @RequestBody AddDeveloper adddeveloper ) {
		addDeveloperService.saveDeveloper(adddeveloper);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/getAlldevelopers")
	public List<AddDeveloper> getAlldeveloper(){
		return addDeveloperService.getAlldeveloper();
	}
	

	@GetMapping("/getdeveloperById/{id}")
	public ResponseEntity<AddDeveloper> findBydeveloperId (@PathVariable("id") Long id){
	return new ResponseEntity<AddDeveloper>(addDeveloperService.findBydeveloperId(id),HttpStatus.OK);
	}
}
