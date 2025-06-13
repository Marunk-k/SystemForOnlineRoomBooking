package com.project.hotelBookingSystem.repository;

import com.project.hotelBookingSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
