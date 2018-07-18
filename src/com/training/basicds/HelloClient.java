package com.training.basicds;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class HelloClient {

	public static void main(String[] args) {
	
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
		
		//ApplicationContext factry1=new ClassPathApp
		
		HelloService hello=(HelloService) factory.getBean("defaultHello");

System.out.println(hello.sayHello());
	}

}
