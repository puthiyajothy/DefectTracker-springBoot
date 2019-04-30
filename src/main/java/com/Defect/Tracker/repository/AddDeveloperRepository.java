package com.Defect.Tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Defect.Tracker.entities.AddDeveloper;

public interface AddDeveloperRepository  extends JpaRepository<AddDeveloper, Long> {
	AddDeveloper findBydeveloperId(Long id);

}
