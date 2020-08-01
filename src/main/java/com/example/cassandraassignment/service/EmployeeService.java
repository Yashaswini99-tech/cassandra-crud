package com.example.cassandraassignment.service;

import com.example.cassandraassignment.Model.Employee;
import com.example.cassandraassignment.Exception.EmployeeNotFoundException;
import com.example.cassandraassignment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    public Employee createEmployee(Employee emp) {

        return employeeRepo.save(emp);
    }


    public List<Employee> getAllEmployee() {

        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(int id) {
        Optional<Employee> optionalEmployee = employeeRepo.findById(id);
        if (!optionalEmployee.isPresent())
            throw new EmployeeNotFoundException("No such employee found");
        return employeeRepo.findById(id).get();
    }


    public Employee updateEmployeeById(int id, Employee emp) {
        Optional<Employee> optionalEmployee = employeeRepo.findById(id);
        if (!optionalEmployee.isPresent())
            throw new EmployeeNotFoundException("No such employee found");
        emp.setEmpId(id);
        return employeeRepo.save(emp);
    }

    public void deleteEmployeeById(int id) {
        Optional<Employee> optionalUser = employeeRepo.findById(id);
        if (!optionalUser.isPresent())
            throw new EmployeeNotFoundException("No such employee found");
        employeeRepo.deleteById(id);
    }
}