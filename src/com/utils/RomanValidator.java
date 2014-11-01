package com.utils;

public class RomanValidator {

	
	


	public static boolean isValidRoman(String roman) {

		String[] arr = { "IL", "IC", "ID", "IM", "XD", "XM", };
		String[] threetimes = { "IIII", "XXXX", "CCCC", "MMMM", };
		String[] norepetation = { "D", "L", "V" };

		for (String string : threetimes) {
			if (roman.contains(string)) {
				return false;
			}
		}

		for (String string : arr) {
			if (roman.contains(string)) {
				return false;
			}
		}

		String romanCharset = "IVXLCDM";

		for (String string : norepetation) {
			String newRomanCharSet = romanCharset.replace(string, "");
			if (!(roman.matches("[" + newRomanCharSet + "]*" + string + "["
					+ newRomanCharSet + "]*") || roman.matches("["
					+ newRomanCharSet + "]*"))) {
				return false;
			}
		}

		return true;
	}

}
