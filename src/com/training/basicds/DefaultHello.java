package com.training.basicds;

public class DefaultHello implements HelloService {

	private String name;
	private String city;
	
	public DefaultHello() {
		
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public DefaultHello(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}



	@Override
	public String sayHello() {
		
		return null;
	}

	@Override
	public String sayHello(String name, String city) {
		
		String []myStrs= {
				"hey How are you %s &","qqqqqqqqqqq%s","wwwwwwwwwww%s"
		};
		
		int randomnumber=(int) (Math.random()*3);
		return String.format(myStrs[randomnumber], name,city);
	}
	

}
