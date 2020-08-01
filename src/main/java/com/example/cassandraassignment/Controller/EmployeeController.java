package com.example.cassandraassignment.Controller;

import com.example.cassandraassignment.Model.Employee;
import com.example.cassandraassignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String helloController(){
        return "Hey the Application is running on port 8082";
    }


    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {

        return employeeService.getAllEmployee();
    }


    @GetMapping(value = "/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }


    @PostMapping("/employee")
    public Employee createEmployee( @RequestBody Employee emp) {

        return employeeService.createEmployee(emp);
    }


    @PutMapping(value = "/employee/{id}")
    public Employee UpdateEmployeeById(@PathVariable("id") int id, @RequestBody Employee emp) {
        return employeeService.updateEmployeeById(id,emp);
    }


    @DeleteMapping(value = "/employee/{id}")
    public String deleteEmployeeById(@PathVariable("id") int id) {
        employeeService.deleteEmployeeById(id);
        return "Employee with id " + id + " has been deleted!";
    }
}