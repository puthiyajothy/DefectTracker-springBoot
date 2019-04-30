package com.Defect.Tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Defect.Tracker.entities.AddDefect;
import com.Defect.Tracker.repository.AddDefectRepository;

@Service
public class AdddefectserviceImp implements AddDefectService {
	
	@Autowired
	private AddDefectRepository addDefectrepository;

	@Override
	public void saveDefect(AddDefect adddefect) {
		addDefectrepository.save(adddefect);
		
	}

	@Override
	public List<AddDefect> getAllDefects() {
	
		return addDefectrepository.findAll() ;
	}

	@Override
	public AddDefect findById(Long id) {
	
		return addDefectrepository.findBydefectId(id);
	}

	@Override
	public void deleteDefectById(Long id) {
		addDefectrepository.delete(findById(id));
		
	}

	@Override
	public void updateDefect(AddDefect adddefect) {
		addDefectrepository.save(adddefect);
		
	}

	

	
	
	

}
