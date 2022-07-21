package com.example.Employee.Management.System.service;

import com.example.Employee.Management.System.model.Employee;

import java.util.List;

public interface EmployeeService {
    //deleteEmployee
    boolean deleteEmployee(Long id);

    //updateEmployee
    Employee updateEmployee(Long id,Employee employee);

    //createEmployee
    Employee createEmployee(Employee employee);

    //get all employees
    List<Employee> fetchAllEmployees();

    //get employee by id
    Employee fetchEmployeeById(Long id);

}
