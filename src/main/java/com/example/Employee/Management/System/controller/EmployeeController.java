package com.example.Employee.Management.System.controller;


import com.example.Employee.Management.System.model.Employee;
import com.example.Employee.Management.System.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ems/api/v1")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/createemployee")
    public Employee createEmployee(Employee employee){
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("/deleteemployee/{id}")
    public boolean deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }

    @GetMapping("/getallemployees")
    public List<Employee> fetchAllEmployees(){
        return employeeService.fetchAllEmployees();
    }

    @GetMapping("/getemployeebyid/{id}")
    public Employee fetchEmployeeById(@PathVariable Long id){
        return employeeService.fetchEmployeeById(id);
    }

    @PutMapping("/updateemployee/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

}
