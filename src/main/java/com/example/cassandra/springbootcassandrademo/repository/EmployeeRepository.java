package com.example.cassandra.springbootcassandrademo.repository;

import com.example.cassandra.springbootcassandrademo.model.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@EnableCassandraRepositories
public interface EmployeeRepository extends CassandraRepository<Employee,String> {
}
