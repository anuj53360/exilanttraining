package com.exilant.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.training.employee.Employee;

public class EmployeeBeanProcessor implements BeanPostProcessor {

	
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		if(bean instanceof Employee) {
			Employee emp=(Employee) bean;
		emp.setEmpName(emp.getEmpName().toUpperCase());
		System.out.println(emp);
		return emp;
		}
		System.out.println("wwwwwwwwwwwwwwww");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		if(bean instanceof Employee) {
			Employee emp=(Employee) bean;
		emp.setEmpName(emp.getEmpName().toLowerCase());
		System.out.println(emp+"asfdfgjkhn");
		return emp;
		}
		System.out.println("zzzzzzzzzzzzzz");
		return bean;
		
		
		
	}

}
