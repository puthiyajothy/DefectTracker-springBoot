 package com.Defect.Tracker.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Defect.Tracker.entities.AddUser;
import com.Defect.Tracker.repository.AddUserRepository;

@Service
public class AddUserServiseImp implements AddUserService{

	@Autowired
	public AddUserRepository adduserRepository;

	@Override
	public void saveuser(AddUser addUser) {
		adduserRepository.save(addUser);
		
	}

	@Override
	public List<AddUser> getAllusers() {
		return adduserRepository.findAll();
	}

	@Override
	public AddUser FindByuserId(Long id) {
		return adduserRepository.findByuserId(id);
	}

	

}
