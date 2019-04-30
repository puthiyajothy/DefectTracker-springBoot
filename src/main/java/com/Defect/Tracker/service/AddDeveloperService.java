package com.Defect.Tracker.service;

import java.util.List;

import com.Defect.Tracker.entities.AddDeveloper;


public interface AddDeveloperService {
	void saveDeveloper(AddDeveloper adddeveloper);
	List<AddDeveloper>getAlldeveloper();
	AddDeveloper findBydeveloperId(Long id);
}
