package com.vides.hotel_api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vides.hotel_api.models.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
    Employee findByEmail(String username);  
}
