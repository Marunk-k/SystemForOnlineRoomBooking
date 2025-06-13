package com.project.hotelBookingSystem.service;

import com.project.hotelBookingSystem.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee addEmployee(Employee employee);
    String updateEmployee(Employee employee);
    String deleteEmployee(Long id);
}
