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
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/getdeveloperById/{id}")
	public ResponseEntity<AddDeveloper> findBydeveloperId (@PathVariable("id") Long id){
	return new ResponseEntity<AddDeveloper>(addDeveloperService.findBydeveloperId(id),HttpStatus.OK);
	}
	
	@CrossOrigin("http://localhost:3000")
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<AddDeveloper>deletedeveloper(@PathVariable("id")long id){
		addDeveloperService.deletedeveloperById(id);
		return new ResponseEntity<AddDeveloper>(HttpStatus.NO_CONTENT);
	}
	
	@CrossOrigin("http://localhost:3000")
	@PutMapping("/updatedeveloper")
	public ResponseEntity<AddDeveloper>updatedeveloper(@Valid @RequestBody AddDeveloper adddeveloper){
		addDeveloperService.updatedeveloper(adddeveloper);
		return new ResponseEntity<AddDeveloper>(adddeveloper,HttpStatus.NO_CONTENT);
		
	}
}
