package com.example.cassandraassignment.repository;



import com.example.cassandraassignment.Model.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface EmployeeRepository extends CassandraRepository<Employee, Integer> {
    Employee save(Employee emp);
}
