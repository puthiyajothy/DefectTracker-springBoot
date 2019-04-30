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

import com.Defect.Tracker.entities.AddDefect;

import com.Defect.Tracker.service.AddDefectService;


@RestController
public class AddDefectController {
	@Autowired
	private AddDefectService  addDefectService;
	
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/adddefect")
	public HttpStatus createdefect(@Valid @RequestBody AddDefect adddefect) {
		addDefectService.saveDefect(adddefect);
		return HttpStatus.CREATED;
	}

	@CrossOrigin("http://localhost:3000")
	@GetMapping("/getAllDefects")
	public List<AddDefect> getAllDefects(){
			return addDefectService.getAllDefects();
	}
	
	
	@GetMapping("/getDefect/{id}")
	public ResponseEntity<AddDefect>getAllDefectById(@PathVariable("id")Long id){
		return new  ResponseEntity<AddDefect>(addDefectService.findById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteDefect/{id}")
	public ResponseEntity<AddDefect>deleteDefect(@PathVariable("id")Long id){
	addDefectService.deleteDefectById(id);
	return new ResponseEntity<AddDefect>(HttpStatus.NO_CONTENT);
	
}	
	
	@PutMapping("/updatedefect")
	public ResponseEntity<AddDefect>updateDefect(@Valid @RequestBody AddDefect adddefect){
		addDefectService.updateDefect(adddefect);
		return new ResponseEntity<AddDefect>(adddefect,HttpStatus.NO_CONTENT);
		
	}
	

}


