package com.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Project;

@Repository
public class ProjectDAOImpl extends JdbcDaoSupport implements ProjectDAO {
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void init() {
		setDataSource(dataSource);
	}
	
	@Override
	public void addProjectToEmp(Project project) {
		// TODO Auto-generated method stub
		String sqlquery = ("insert into project(emp_id, proj_id, proj_name, location) values(?,?,?,?)");
		getJdbcTemplate().update(sqlquery, new Object[] {project.getEmpId(), project.getProjId(), project.getProjName(), project.getLocation()});
		
	}

}
