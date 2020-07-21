package com.kandalama.Employeemanagementsystem;

import com.kandalama.Employeemanagementsystem.services.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class EmployeeManagementSystemApplication {

	public static void main( String[] args )
	{
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
		EmployeeService x=new EmployeeService();
		x.fetchEmployee();
	}

}
