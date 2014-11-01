package com.model;

import java.util.ArrayList;

import com.utils.RomanToDecimalConverter;
import com.utils.RomanConverter;

public class CreditQuestion implements Question {

private String question;
	public CreditQuestion(String qurestionString) {
		// TODO Auto-generated constructor stub
	this.question=qurestionString;
	}
	//glob prok Silver ?
	public String calculateAns(ArrayList<Unit> units, ArrayList<Metal> metals) {

		String[] splitedQuestion = question.split("is ");
		String[] splitedValues = splitedQuestion[1].split(" ");

		String metalName = splitedValues[splitedValues.length - 2];

		int multiplier = new RomanToDecimalConverter().convert(new RomanConverter()
				.convert(splitedQuestion[1], " ", units));

		for (Metal metal : metals) {
			if (metal.getName().equals(metalName))
				return splitedQuestion[1].substring(0,
						question.split("is ")[1].indexOf('?'))
						+ "is " + metal.getCredit() * multiplier + " Credits";
		}
		return null;
	}

}
