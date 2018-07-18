package com.exilant.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Speaker {
	
	@Value("dgf")
	private String type;
	@Value("10")
	private int volLevels;
	
	public Speaker() {
		System.out.println("creating Speaker");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getVolLevels() {
		return volLevels;
	}

	public void setVolLevels(int volLevels) {
		this.volLevels = volLevels;
	}
	
	

}
