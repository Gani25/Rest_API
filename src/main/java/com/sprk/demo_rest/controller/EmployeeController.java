package com.sprk.demo_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sprk.demo_rest.entity.Employee;
import com.sprk.demo_rest.service.EmployeeService;

import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    // Dependency Injection
    // @Autowired // Field Injection
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Save Employee -> Insert

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {

        // Save Logic
        Employee savedEmployee = employeeService.insertEmployee(employee);

        return savedEmployee;
    }



}
