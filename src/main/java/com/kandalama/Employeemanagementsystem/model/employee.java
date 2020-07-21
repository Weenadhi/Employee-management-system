package com.kandalama.Employeemanagementsystem.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class employee {
    String empName;


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }



    @PostConstruct
    public void initIt() throws Exception {
        System.out.println("Employee name set : " + empName);
    }

    @PreDestroy
    public void cleanUp() throws Exception {
        System.out.println("Spring Container is destroy! clean up");
    }
}
