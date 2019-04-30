package com.Defect.Tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Defect.Tracker.entities.AddModule;
import com.Defect.Tracker.repository.AddModuleRepository;

@Service
public class AddModuleServiceImp implements AddModuleService  {
	
	@Autowired
	private AddModuleRepository addModuleRepository;

	@Override
	public void saveModule(AddModule addmodule) {
		addModuleRepository.save(addmodule);
		
	}

	@Override
	public List<AddModule> getAllModules() {
		// TODO Auto-generated method stub
		return addModuleRepository.findAll();
	}

	@Override
	public AddModule findById(Long id) {

		return addModuleRepository.findBymoduleId(id);
	}

	@Override
	public void deleteModuleById(Long id) {
		 addModuleRepository.delete(findById(id));
	}

	@Override
	public void updateModule(AddModule addModule) {
		addModuleRepository.save(addModule);
		
	}

}
