package com.sprk.demo_rest.repository;

import com.sprk.demo_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Optional<Employee> findByPhone(String phone);

    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);

//    https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
}
