package com.sprk.demo_rest.repository;

import com.sprk.demo_rest.entity.Employee;

import java.util.List;

public interface EmployeeRepository {
    // Declaration
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee findById(int eid);
}
