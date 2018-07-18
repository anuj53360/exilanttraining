package com.exilant.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		((AnnotationConfigApplicationContext)context).getEnvironment().setActiveProfiles("Production");
//		((AnnotationConfigApplicationContext)context).getEnvironment().setActiveProfiles("Development");
//		((AnnotationConfigApplicationContext)context).scan(basePackages);
//context.getBean()
		
	}

}
