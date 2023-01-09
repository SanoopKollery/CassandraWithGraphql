package com.example.cassandra.springbootcassandrademo.utiliites;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.cassandra.springbootcassandrademo.model.ApiResponse;
import com.example.cassandra.springbootcassandrademo.model.Employee;
import com.example.cassandra.springbootcassandrademo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;


@Component
public class Mutation implements GraphQLMutationResolver {

	@Autowired
	private EmployeeService employeeService;

	public Employee createEmployee(String fname, String lname,int age,String joinDate,
								   float salary) {
		return this.employeeService.newEmployee(fname, lname,age,joinDate,salary);
	}

	public ApiResponse deleteEmployee(String id)
	{
		return employeeService.deleteEmployee(id);
	}

	public Employee updateEmployee(String id, String fname, String lname,int age,String joinDate,
								   float salary)
	{
		return employeeService.updateEmployee(id,fname, lname,age,joinDate,salary);
	}
}
