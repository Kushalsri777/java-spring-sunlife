package com.java.employees.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.java.employees.dao.EmployeeRepository;
import com.java.employees.model.Employee;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {
	@InjectMocks
	EmployeeService service;
	
	@Mock
	EmployeeRepository repository;
	
	public void init() {
		MockitoAnnotations.openMocks(this);
		
	}
	
	@Test
	public void testFindEmp() {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Alex", "Raza"));
		emps.add(new Employee("Sam", "Quinn"));
		emps.add(new Employee("Hana", "Herbart"));
		emps.add(new Employee("Amit", "Jain"));

		Mockito.when(repository.findAll()).thenReturn(emps);
		
		List<Employee> empList=service.findAll();
		assertEquals(4, empList.size());
	}
}
