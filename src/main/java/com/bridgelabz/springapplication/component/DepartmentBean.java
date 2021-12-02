package com.bridgelabz.springapplication.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {

    private String departmentName;

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
