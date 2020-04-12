package com.capg.demo.emp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee{
	
	@Value("${employee.empId}")
	private int employeeId;
	@Value("${employee.empName}")
	private String employeeName;
	@Value("${employee.empsalary}")
	private double salary;
	@Value("${employee.empage}")
	private int age;
//   @Value("${employee.empbusinessUnit}")
	private SBU businessUnit ;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeName, double salary, int age, SBU businessUnit) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.age = age;
		this.businessUnit = businessUnit;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}

	public SBU getSbuDetails() {
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfigurations.class);
        businessUnit=(SBU)context.getBean("sbu");
		return businessUnit;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + ", age="
				+ age + "]";
	}
	
}
	
	



	
	

    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
