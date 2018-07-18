package com.training.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.basicds.DefaultHello;

public class EmployeeClient {

	public static void main(String[] args) {
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring-context2.xml");
		AbstractApplicationContext context1=new ClassPathXmlApplicationContext("spring-context.xml","spring-context2.xml");
		
		
		
//		context.getBean(Employee.class);
		Employee employee=context1.getBean("employee", Employee.class);
		Employee employee1=context1.getBean("employee1", Employee.class);
		
DefaultHello hello=	context1.getBean("defaultHello",DefaultHello.class);
System.out.println(hello.sayHello());
		
		System.out.println(employee.hashCode());
		System.out.println(employee1.hashCode());
		
		
		System.out.println(employee.getEmpId());
		
		context1.registerShutdownHook();

		
		
	}

}
