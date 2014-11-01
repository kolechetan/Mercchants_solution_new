package com.utils;

import java.util.ArrayList;

import com.factory.QuestionFactory;
import com.model.Metal;
import com.model.Question;
import com.model.Unit;

public class InputParser {

	public ArrayList<Question> getQuestions(String[] input) {
		ArrayList<Question> questions = new ArrayList<Question>();

		for (String string : input) {
			if (QuestionValidator.isCorrectQuestion(string))
				questions.add(QuestionFactory.getQuestion(string));
		}

		return questions;
	}

	public ArrayList<Unit> getUnits(String[] input) {
		ArrayList<Unit> units = new ArrayList<Unit>();

		for (String string : input)
			if (UnitValidator.isCorrectUnit(string))
				units.add(new Unit(string.split(" ")[0], string.split(" ")[2]));

		return units;
	}

	public ArrayList<Metal> getMetals(String[] input, ArrayList<Unit> units) {
		ArrayList<Metal> metals = new ArrayList<Metal>();

		for (String string : input)
			if (MetalValidator.isCorrectMetal(string)) {
				metals.add(getMetalObject(string, units));
			}
		return metals;
	}

	private Metal getMetalObject(String input, ArrayList<Unit> units) {

		String[] splitedString = input.split(" ");
		String name = splitedString[splitedString.length - 4];

		return new Metal(name, getMetalValue(input, name, units));
	}

	private double getMetalValue(String input, String name,
			ArrayList<Unit> units) {

		String[] splittedValues = input.split(name);

		int value1 = new RomanToDecimalConverter().convert(new RomanConverter().convert(splittedValues[0],
				" ", units));
		double value2 = Double.parseDouble(splittedValues[1].split(" ")[2]);

		return value2 / value1;
	}

}
