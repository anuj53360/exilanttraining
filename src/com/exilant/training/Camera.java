package com.exilant.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Value("${camera.type}")
	private String type;
	
	public Camera() {
		System.out.println("creating cammera");
		

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
