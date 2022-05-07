package com.example.EmployeePayrollApp.service;

import com.example.EmployeePayrollApp.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee addEmployee(Employee employee);

    List<Employee> getList();

    void delete(int id);

    Employee editEmployee(Employee employee);

    Employee getEmployeeById(int id);

    Employee getEmployeeByName(String name);

    Employee getEmployeeBySalary(long salary);
}
