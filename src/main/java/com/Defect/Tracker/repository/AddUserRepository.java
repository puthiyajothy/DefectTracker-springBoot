package com.Defect.Tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Defect.Tracker.entities.AddUser;

public interface AddUserRepository extends JpaRepository<AddUser,Long>{

	AddUser findByuserId(Long userId);
	

}	
