package com.sprk.demo_rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprk.demo_rest.entity.Employee;
import com.sprk.demo_rest.repository.EmployeeRepository;
import com.sprk.demo_rest.service.EmployeeService;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

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

        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(int empId) {

        Optional<Employee> dbEmployee = employeeRepository.findById(empId);

        if(dbEmployee.isPresent()) {
            return dbEmployee.get();
        }
        return null;
    }

    @Override
    @Transactional
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    @Transactional
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeByPhoneNum(String phone) {
        Optional<Employee> dbEmployee = employeeRepository.findByPhone(phone);

        if(dbEmployee.isPresent()) {
            return dbEmployee.get();
        }
        return null;
    }


}
