package com.sprk.demo_rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprk.demo_rest.entity.Employee;
import com.sprk.demo_rest.repository.EmployeeRepository;
import com.sprk.demo_rest.service.EmployeeService;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    // Dependency Injection
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    @Transactional
    public Employee insertEmployee(Employee employee) {
        return employeeRepository.saveEmployee(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public Employee getEmployeeById(int empId) {
        return employeeRepository.findById(empId);
    }


}
