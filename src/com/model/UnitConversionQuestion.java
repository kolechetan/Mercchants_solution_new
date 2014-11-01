package com.model;

import java.util.ArrayList;

import com.utils.RomanToDecimalConverter;
import com.utils.RomanConverter;

public class UnitConversionQuestion implements Question {
	private String question;
	
	public  UnitConversionQuestion(String questionString) {
		// TODO Auto-generated constructor stub
	 this.question  = questionString;
	}
	public String calculateAns( ArrayList<Unit> units,ArrayList<Metal> metals) {

		return question.split("is ")[1].substring(0,
				question.split("is ")[1].indexOf('?'))
				+ "is "
				+ new RomanToDecimalConverter().convert(new RomanConverter().convert(
						question.split("is ")[1], " ", units));
	}

}
