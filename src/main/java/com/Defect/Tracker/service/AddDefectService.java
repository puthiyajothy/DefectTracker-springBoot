package com.Defect.Tracker.service;

import java.util.List;

import com.Defect.Tracker.entities.AddDefect;

public interface AddDefectService {
	void saveDefect(AddDefect adddefect);
	List<AddDefect> getAllDefects();
	AddDefect findById(Long id);
	void deleteDefectById(Long id);
	void updateDefect(AddDefect adddefect);



}
