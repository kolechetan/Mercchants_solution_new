package com.utils;

import java.util.ArrayList;

import com.model.Unit;

public class RomanConverter implements StringConvertor {

	public String convert(String input, String delim, ArrayList<Unit> units) {
		String romanString = "";

		String[] splitedInput = input.split(delim);

		for (String string : splitedInput) {
			for (Unit unit : units) {
				if (unit.getOtherValue().equals(string)) {
					romanString = romanString + unit.getRomanValue();
					break;
				}
			}

		}
		return romanString;
	}

}
