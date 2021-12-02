package com.bridgelabz.springapplication;

import com.bridgelabz.springapplication.component.DemoBean;
import com.bridgelabz.springapplication.component.EmployeeBean;
import com.bridgelabz.springapplication.controller.HelloRestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NewHelloWorldApplication {
    public static final Logger logger = LoggerFactory.getLogger(NewHelloWorldApplication.class);

    public static void main(String[] args) {
        logger.debug("Hello from Bridgelabz");
        ApplicationContext context = SpringApplication.run(NewHelloWorldApplication.class, args);
        logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
        logger.debug("\n*** Example using @Autowire annotation on property ***");
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.setEid(104);
        employeeBean.setEname("Spring Framework Guru");
        employeeBean.showEmployeeDetails();
    }
}
