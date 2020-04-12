package com.capg.demo.emp;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.capg.demo.emp")
@PropertySource("app.properties")
public class EmployeeConfigurations{
	

}

