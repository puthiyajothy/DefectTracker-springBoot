package com.Defect.Tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Defect.Tracker.entities.AddDefect;

public interface AddDefectRepository extends JpaRepository<AddDefect,Long> {
	
	AddDefect findBydefectId(Long id);

}
