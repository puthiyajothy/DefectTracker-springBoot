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


import com.Defect.Tracker.entities.AddUser;
import com.Defect.Tracker.service.AddUserService;

@RestController
public class AddUserController {

	@Autowired
	public AddUserService addUserService;
	
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/adduser")
	public HttpStatus createuser(@Valid @RequestBody AddUser addUser) {
		addUserService.saveuser(addUser);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/getAllusers")
	public List<AddUser>getAllusers(){
		return addUserService.getAllusers();

	}
	
	@GetMapping("/FindByuserId/{id}")
	public ResponseEntity<AddUser>getAllusers(@PathVariable("id")Long id){
		return new ResponseEntity<AddUser>(addUserService.FindByuserId(id),HttpStatus.OK);
	}
}


