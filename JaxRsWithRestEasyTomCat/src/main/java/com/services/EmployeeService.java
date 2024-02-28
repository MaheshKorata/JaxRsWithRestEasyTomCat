package com.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.services.entity.Employee;

@Path("/employeeService")
public class EmployeeService {

	@GET
	@Path("/returnEmployeeObj")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee() {

		System.out.println("--------");

		return new Employee("JAX RS");
	}

}
