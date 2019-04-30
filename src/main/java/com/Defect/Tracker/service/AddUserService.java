package com.Defect.Tracker.service;

import java.util.List;

import com.Defect.Tracker.entities.AddUser;

public interface AddUserService {
	void saveuser(AddUser addUser);
	List<AddUser>getAllusers();
	AddUser FindByuserId(Long id);
	
	
}
