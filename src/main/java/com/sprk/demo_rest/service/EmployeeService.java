package com.sprk.demo_rest.service;

import com.sprk.demo_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee insertEmployee(Employee employee);

    List<Employee> findAll();
}
