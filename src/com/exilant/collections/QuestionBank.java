package com.exilant.collections;

import java.util.List;

public class QuestionBank {
	
	public QuestionBank() {
	
	}
	private String questions;
	private List<String> options;
	
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	@Override
	public String toString() {
		return "QuestionBank [questions=" + questions + ", options=" + options + ", getQuestions()=" + getQuestions()
				+ ", getOptions()=" + getOptions() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
