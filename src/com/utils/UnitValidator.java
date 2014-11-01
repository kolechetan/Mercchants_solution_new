package com.utils;

public class UnitValidator {

	public static boolean isCorrectUnit(String input) {
		return !(input.endsWith("?") || input.endsWith("Credits"));

	}

}
