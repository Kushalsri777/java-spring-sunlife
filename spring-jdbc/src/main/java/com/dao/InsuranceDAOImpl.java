package com.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Insurance;
@Repository
public class InsuranceDAOImpl extends JdbcDaoSupport implements  InsuranceDAO{

	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void init() {
		setDataSource(dataSource);
	}
	
	@Override
	public void addInsuranceToEmp(Insurance insurance) {
		String sqlquery = ("insert into insurance(emp_id, ins_type, cvrg_amt) values(?,?,?)");
		getJdbcTemplate().update(sqlquery, new Object[] {insurance.getEmpId(), insurance.getInsuranceType().toString(), insurance.getCoverageAmount()});
	}

}
