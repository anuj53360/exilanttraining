package com.exilant.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	private Camera cammera;
	private Speaker speaker;
	private Screen screen;
	
	public Mobile() {
		System.out.println("mobile is creating");
	}

	public Camera getCammera() {
		return cammera;
	}
	@Autowired
	public void setCammera(Camera cammera) {
		this.cammera = cammera;
	}

	public Speaker getSpeaker() {
		return speaker;
	}
	@Autowired
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public Screen getScreen() {
		return screen;
	}
	@Autowired
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	
	
}
