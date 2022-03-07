package com.example.EmployeeSpringBoot.repository;

import com.example.EmployeeSpringBoot.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
