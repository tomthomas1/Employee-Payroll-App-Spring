package com.example.EmployeePayrollApp.repository;

import com.example.EmployeePayrollApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findByfirstName(String name);

    Employee findBySalary(long salary);
}

