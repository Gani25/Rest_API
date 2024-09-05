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

    @GetMapping("/all-employees")
    public List<Employee> getAllEmployees() {

        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{empId}")
    public ResponseEntity<?> getEmployee(@PathVariable int empId) {

        Employee employee = employeeService.getEmployeeById(empId);

        if(employee == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee with id = "+empId+" not found");
        }else{
            return ResponseEntity.ok(employee);
        }
    }

}
