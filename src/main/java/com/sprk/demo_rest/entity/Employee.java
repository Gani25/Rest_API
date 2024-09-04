package com.sprk.demo_rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {

    // Primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    // @Column(name = "f_name",length = 20)
    @Column(length = 20)
    private String firstName;

    private String lastName;

    @Column(length = 15, nullable = false, unique = true)
    private String phone;

    private double salary;

}
