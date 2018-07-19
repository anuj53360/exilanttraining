package com.exilant.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exilant.dao.EmployeeDAO;
import com.exilant.db.IEmployeeDAO;
import com.exilant.entity.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("speaker-context4.xml");
		IEmployeeDAO employee=(IEmployeeDAO) context.getBean("employeejdbctemplate");

		Employee e1=new Employee(101, "Anuj", 1234);
		Employee e2=new Employee(102, "Anujj", 12341);
		Employee e3=new Employee(103, "Anujj", 12342);
	
//		employee.insertEmployee(e1);
//		employee.insertEmployee(e2);
//		employee.insertEmployee(e3);
	
Employee emp=	employee.getEmployee(101);
	
System.out.println(emp);


Employee emp1=(Employee) employee.getAllEmployee();
System.out.println(emp1);
	
	employee.updateEmployee(101,14556);
		
		employee.deleteEmployee(101);
	}

}
