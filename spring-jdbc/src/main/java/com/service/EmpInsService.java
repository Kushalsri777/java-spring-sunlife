package com.service;

import com.model.Employee;
import com.model.Insurance;
import com.model.Project;

public interface EmpInsService {
	public void assignInsToEmp(Employee employee, Insurance insurance, Project project);

}
