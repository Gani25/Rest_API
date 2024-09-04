package com.sprk.demo_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprk.demo_rest.entity.Employee;
import com.sprk.demo_rest.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    // Dependency Injection
    // @Autowired // Field Injection
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Save Employee -> Insert

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {

        // Save Logic
        return employee;
    }

}
