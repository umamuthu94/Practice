package com.example.practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.model.Employee;

public interface EmpRepo extends JpaRepository<Employee,Integer> {
    
}

//we create a branch5 in a pom.xml and now we create branch6