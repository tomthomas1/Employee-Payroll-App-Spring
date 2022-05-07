package com.example.EmployeePayrollApp.service;

import com.example.EmployeePayrollApp.entity.Employee;
import com.example.EmployeePayrollApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements IEmployeeService {

    //We have Autowired teh repo so that we can use the methods of the JPA repository
    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * Method to add the employee to the database
     *
     * @param employee - Will pass the employee to add
     * @return - will return the added employee
     */
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Method to get the list of all employees from the database
    @Override
    public List<Employee> getList() {
        return employeeRepository.findAll();
    }

    //Method to delete the employee from the repo
    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }

    //Method to edit or update the repo
    @Override
    public Employee editEmployee(Employee employee) {
        if (employeeRepository.findById(employee.getId()).isPresent())
            return employeeRepository.save(employee);
        return null;
    }

    //Method to get the employee data by id
    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).get();
    }

    //Method to get the employee data by name
    @Override
    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByfirstName(name);
    }

    //Method to get the employee data by salary
    @Override
    public Employee getEmployeeBySalary(long salary) {
        return employeeRepository.findBySalary(salary);
    }
}
