package com.example.EmployeePayrollApp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;

    @Column(name = "salary", nullable = false)
    private long salary;
}
