package com.main;

import java.util.ArrayList;

import com.model.Metal;
import com.model.Question;
import com.model.Unit;
import com.utils.InputParser;

public class Calculator {
	static ArrayList<Unit> units = new ArrayList<Unit>();
	static ArrayList<Question> questions = new ArrayList<Question>();
	static ArrayList<Metal> metals = new ArrayList<Metal>();

	public static  void calculateAnswers(String[] input)
	{
		
		InputParser inputParser = new InputParser();
		questions = inputParser.getQuestions(input);
		units = inputParser.getUnits(input);
		metals = inputParser.getMetals(input, units);

		for (Question question : questions) {
			System.out.println(question.calculateAns(units, metals));
		}
	}
}
