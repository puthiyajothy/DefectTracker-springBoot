package com.Defect.Tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Defect.Tracker.entities.AddDeveloper;
import com.Defect.Tracker.repository.AddDeveloperRepository;

@Service
public class AddDeveloperServiceImp implements AddDeveloperService {

	
	@Autowired
	public AddDeveloperRepository addDeveloperRepository;
	
	@Override
	public void saveDeveloper(AddDeveloper adddeveloper) {
		addDeveloperRepository.save(adddeveloper);
		
	}

	@Override
	public List<AddDeveloper> getAlldeveloper() {
		
		return addDeveloperRepository.findAll();
	}

	@Override
	public AddDeveloper findBydeveloperId(Long id) {
		return addDeveloperRepository.findBydeveloperId(id);
	}

}
