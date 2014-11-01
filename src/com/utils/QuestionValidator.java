package com.utils;

public class QuestionValidator {
	public static boolean isCorrectQuestion(String input) {
		return input.endsWith("?");

	}

	public static boolean isUnitConversionQuestion(String question) {

		return question.startsWith("how much is");

	}

	public static boolean isCreditQuestion(String question) {

		return question.startsWith("how many Credits");

	}
	
	public static boolean isMetalConversionQuestion(String question) {

		return question.startsWith("how many ");

	}

}
