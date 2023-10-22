package com.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDAO{
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void init() {
		setDataSource(dataSource);
	}

	@Override
	public void addEmployee(Employee employee) {
		String sqlquery ="insert into Employee(emp_id, emp_name, emp_city) values(?,?,?)";
		getJdbcTemplate().update(sqlquery,new Object[] {employee.getEmpId(), employee.getEmpName(), employee.getEmpCity()});
		

	}
	
	
}
