package com.example.EmployeePayrollApp.controller;

import com.example.EmployeePayrollApp.entity.Employee;
import com.example.EmployeePayrollApp.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    //We have use the Autowired in the Interface so that we use the service of the implementation.
    @Autowired
    private IEmployeeService iEmployeeService;

    /**
     * Method to add the employee to the database
     *
     * @param employee - We are passing Employee of type class
     * @return -  Will add and return the employee
     */
    @PostMapping(value = "/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return iEmployeeService.addEmployee(employee);
    }

    /**
     * Method to list all the employee from the database
     *
     * @return -  Will return all the employee from the database
     */
    @GetMapping("/list")
    public List<Employee> getList() {
        return iEmployeeService.getList();
    }

    /**
     * Method delete an employee from the repo
     *
     * @param id - We are passing the id of the employee to delete
     */
    @DeleteMapping("/delete")
    public void deleteById(@RequestParam(value = "id") int id) {
        iEmployeeService.delete(id);
    }

    /**
     * Method to edit the employee from the database
     *
     * @param employee We are passing the employee class to edit with data as Json on postman
     * @return -  Will return the updated data of the employee
     */
    @PutMapping("/edit")
    public Employee editEmployee(@RequestBody Employee employee) {
        return iEmployeeService.editEmployee(employee);
    }

    /**
     * Method to get the employee from the id.
     *
     * @param id - We are passing the employee id
     * @return - Will return the data of the employee
     */
    @GetMapping("/get-by-id")
    public Employee getEmployeeById(@RequestParam int id) {
        return iEmployeeService.getEmployeeById(id);
    }

    /**
     * Method to get the employee from the name
     *
     * @param name - We are passing the employee firstName
     * @return - Will return the data of the employee with that specific name
     */
    @GetMapping("/get-by-name")
    public Employee getEmployeeByName(@RequestParam String name) {
        return iEmployeeService.getEmployeeByName(name);
    }

    /**
     * Method to get the employee from the salary
     *
     * @param salary - We are passing the employee salary
     * @return -  Will return the data of the employee with that specific salary
     */
    @GetMapping("/get-by-salary")
    public Employee getEmployeeBySalary(@RequestParam long salary) {
        return iEmployeeService.getEmployeeBySalary(salary);
    }
}
