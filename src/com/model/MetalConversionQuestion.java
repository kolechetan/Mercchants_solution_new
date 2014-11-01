package com.model;

import java.util.ArrayList;

import com.utils.RomanConverter;
import com.utils.RomanToDecimalConverter;

public class MetalConversionQuestion implements Question {
	private String question;

	public MetalConversionQuestion(String qurestionString) {
		// TODO Auto-generated constructor stub
		this.question = qurestionString;
	}

	public String calculateAns(ArrayList<Unit> units, ArrayList<Metal> metals) {

		String[] splitedQuestion = question.split("how many ");
		String[] splitedValues = splitedQuestion[1].split(" ");

		String metal1 = splitedValues[0];
		String metal2 = splitedValues[splitedValues.length - 2];

		String unitValue = splitedQuestion[1].replace(metal1 + " ", "");
		unitValue = unitValue.replace(metal2, "");
		unitValue = unitValue.replace("is", "");
		unitValue = unitValue.replace(" ?", "");

		int multiplier = new RomanToDecimalConverter()
				.convert(new RomanConverter().convert(unitValue, " ", units));

		return (metal2
				+ " is "
				+ (multiplier * (getMetalValue(metal2, metals) / getMetalValue(
						metal1, metals))) + " " + metal1);

	}

	private double getMetalValue(String metal, ArrayList<Metal> metals) {

		for (Metal obj : metals) {
			if (obj.getName().equals(metal.trim()))
				return obj.getCredit();

		}

		return 0;
	}
}
