package com.utils;

import com.model.RomanDigits;

public class RomanToDecimalConverter implements NumberConvertor {

	public int convert(String input) {
		if (RomanValidator.isValidRoman(input)) {
			int[] intInput = toIntArray(input);
			int val = 0;
			for (int i = 0; i < intInput.length; i++) {
				if (i > 0 && intInput[i - 1] < intInput[i]) {
					val = val + intInput[i] - 2 * intInput[i - 1];
				} else {
					val = val + intInput[i];
				}
			}

			return val;
		} else
			throw new RuntimeException("Invalid Roman Number");
	}

	private static int[] toIntArray(String input) {
		int[] intArray = new int[input.length()];
		for (int i = 0; i < input.length(); i++) {
			intArray[i] = RomanDigits.valueOf("" + input.charAt(i)).value;
		}

		return intArray;
	}

}
