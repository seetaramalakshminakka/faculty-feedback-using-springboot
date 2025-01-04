package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<FacultyData, Integer> {
	
	boolean existsById(int id);

}
