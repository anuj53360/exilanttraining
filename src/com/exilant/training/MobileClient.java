package com.exilant.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileClient {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring-context3.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-context3.xml");
		Mobile mob=context.getBean("mobile",Mobile.class);
		
	System.out.println(mob.getCammera().getType());
	System.out.println(mob.getScreen().getGlassType());
	System.out.println(mob.getSpeaker().getVolLevels());

	}

}
