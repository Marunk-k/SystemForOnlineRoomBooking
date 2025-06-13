package com.project.hotelBookingSystem.service.impl;

import com.project.hotelBookingSystem.entity.Employee;
import com.project.hotelBookingSystem.repository.ClientRepository;
import com.project.hotelBookingSystem.repository.EmployeeRepository;
import com.project.hotelBookingSystem.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public String updateEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Successfully updated employee!";
    }

    @Override
    public String deleteEmployee(Long id) {
        if (!employeeRepository.existsById(id)) {
            return "Employee not found";
        }
        employeeRepository.deleteById(id);
        return "Employee successfully deleted";
    }
}
