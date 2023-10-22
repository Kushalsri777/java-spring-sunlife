package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDAO;
import com.dao.InsuranceDAO;
import com.dao.ProjectDAO;
import com.model.Employee;
import com.model.Insurance;
import com.model.Project;

@Service
public class EmpInsServiceImpl implements EmpInsService{

	@Autowired
	private EmployeeDAO employeeDAO;
	@Autowired
	private InsuranceDAO insuranceDAO;
	@Autowired
	private ProjectDAO projectDAO;
	
	@Override
	@Transactional
	public void assignInsToEmp(Employee employee, Insurance insurance, Project project) {
		employeeDAO.addEmployee(employee);
		if(employee.getEmpId() == 104) {
			throw new RuntimeException("Something went wrong");
		}
		insuranceDAO.addInsuranceToEmp(insurance);
		projectDAO.addProjectToEmp(project);
	}

}
