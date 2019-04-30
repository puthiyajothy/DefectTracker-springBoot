package com.Defect.Tracker.service;

import java.util.List;

import com.Defect.Tracker.entities.AddModule;

public interface AddModuleService {
	void saveModule(AddModule addmodule);
	
	List<AddModule> getAllModules();
	AddModule  findById(Long id);
	void deleteModuleById(Long id);
	void updateModule(AddModule addModule);

}
