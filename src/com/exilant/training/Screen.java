package com.exilant.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Screen {
	
	@Value("dsgf")
	private String glassType;
	@Value("45")
	private int len;
	@Value("67")
	private int bre;
	
	
	public Screen() {
		System.out.println("crating screen");
	}


	public String getGlassType() {
		return glassType;
	}


	public void setGlassType(String glassType) {
		this.glassType = glassType;
	}


	public int getLen() {
		return len;
	}


	public void setLen(int len) {
		this.len = len;
	}


	public int getBre() {
		return bre;
	}


	public void setBre(int bre) {
		this.bre = bre;
	}

	
}
