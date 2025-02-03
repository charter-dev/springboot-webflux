package com.java.springboot.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.java.springboot.entity.Employee;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {

}
