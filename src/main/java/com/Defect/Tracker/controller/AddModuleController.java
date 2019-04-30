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

import com.Defect.Tracker.entities.AddModule;
import com.Defect.Tracker.service.AddModuleService;

@RestController
public class AddModuleController {
	
	@Autowired
	private AddModuleService  addModuleService;
	
	@PostMapping("/addmodule")
	@CrossOrigin("http://localhost:3000")
	public HttpStatus createmodule(@Valid @RequestBody AddModule addmodule) {
		addModuleService.saveModule(addmodule);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/getAllmodules")
	public List<AddModule> getAllModules(){
		return addModuleService.getAllModules();
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/getModulesById/{id}")
	public ResponseEntity<AddModule> getModuleById (@PathVariable("id") Long id){
	return new ResponseEntity<AddModule>(addModuleService.findById(id),HttpStatus.OK);
}
	
	@DeleteMapping("/deleteModule/{id}")
	public ResponseEntity<AddModule> deleteModule(@PathVariable("id") Long id){
		addModuleService.deleteModuleById(id);
		return new ResponseEntity<AddModule>(HttpStatus.NO_CONTENT);
		
	}
	
	@PutMapping("/updatemodule")
	public ResponseEntity<AddModule>updateModule(@Valid @RequestBody AddModule addModule){
		addModuleService.updateModule(addModule);
		return new ResponseEntity<AddModule>(addModule,HttpStatus.NO_CONTENT);
	}
	
}

