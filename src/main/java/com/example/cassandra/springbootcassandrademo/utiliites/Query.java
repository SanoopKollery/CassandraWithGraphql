package com.example.cassandra.springbootcassandrademo.utiliites;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.cassandra.springbootcassandrademo.model.Employee;
import com.example.cassandra.springbootcassandrademo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private EmployeeService employeeService;

	public Optional<Employee> getEmployee(String id) {
		return this.employeeService.getEmployee(id);
	}
}
