package com.example.springcore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.model.Employee;
import com.model.Insurance;
import com.model.InsuranceType;
import com.model.Project;
import com.service.EmpInsService;
import com.service.EmpInsServiceImpl;


@SpringBootApplication
@ComponentScan("com")
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringCoreApplication.class, args);

		EmpInsService es = (EmpInsService) ctx.getBean(EmpInsService.class);

		Employee emp = new Employee(107, "Prateek", "Gkp");
		Insurance ins = new Insurance(107, InsuranceType.HEALTH_INSURANCE, 1000000);
		Project proj = new Project(107, 2, "TASK", "BLR");
		
		es.assignInsToEmp(emp, ins, proj);
		System.out.println("Emp with ins and proj added");	}

}
