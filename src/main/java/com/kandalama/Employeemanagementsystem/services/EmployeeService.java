package com.kandalama.Employeemanagementsystem.services;

import com.kandalama.Employeemanagementsystem.model.employee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeService {
    ConfigurableApplicationContext context;
    public EmployeeService(){

        ConfigurableApplicationContext   context = new ClassPathXmlApplicationContext(new String[]{"Spring_employee.xml"});
    }


    public void fetchEmployee(){

        String EmpNames[]={"emp1","emp2","emp3","emp4"};
        for(String beanID:EmpNames){
            employee emp=context.getBean(beanID,employee.class);
            System.out.println(emp.getEmpName());


        }context.close();


    }
}
