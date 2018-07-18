package com.exilant.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exilant.collections.MyCollection;

public class MessageSourceClient {
public static void main(String []args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("message-resource-context.xml");
 
//	String eng=context.getMessage("goodmorning", new Object[] {},null);
//	String fre=context.getMessage("goodmorning", new Object[] {},new Locale("FR"));
	String chi=context.getMessage("goodmorning", new Object[] {},new Locale("ZH"));
//	System.out.println(eng);
//	System.out.println(fre);
	
	System.out.println(chi);
//	HelloWorld hello=context.getBean(HelloWorld.class);
//	
//	hello.sayHelloWorld();
//	hello.sayHelloWorld_fr();
}
}
