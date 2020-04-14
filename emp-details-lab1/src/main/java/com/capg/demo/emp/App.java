package com.capg.demo.emp;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
   
public static void main( String[] args )
{
    Employee emp;
    SBU sbu;
    ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfigurations.class);
    emp=(Employee)context.getBean("employee");
    sbu=(SBU)context.getBean("sbu");
    System.out.println("Employee Details:");
    System.out.println("__________________________________________________");
    System.out.println(emp);
    System.out.println(sbu);
}}
    
