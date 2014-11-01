package com.model;

import java.util.ArrayList;


public class InvalidQuestion implements Question {
	
	private String question;
	public InvalidQuestion(String questionString) {
		// TODO Auto-generated constructor stub
	 this.question  = questionString;
	}

	public String calculateAns(ArrayList<Unit> units, ArrayList<Metal> metals) {

		return "I have no idea what you are talking about";
	}

}
