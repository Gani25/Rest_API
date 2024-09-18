package com.sprk.demo_rest.repository;

import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sprk.demo_rest.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    // Hibernate

    // Dependency Injection

    private final EntityManager entityManager;

    @Autowired
    public EmployeeRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return entityManager.merge(employee);

    }




}
