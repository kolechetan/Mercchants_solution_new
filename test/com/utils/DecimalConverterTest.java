package com.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecimalConverterTest {

	@Test
	public void RomanToDecimalConvertorTest() {
		String[] input = { "XX", "MCMXLIV", "IV", "MMVI", };
		int[] expectedOutput = { 20, 1944, 4, 2006, };

		try {
			new RomanToDecimalConverter().convert("KJH");
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "Invalid Roman Number");
		}

		try {
			new RomanToDecimalConverter().convert("IIIIXV");
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "Invalid Roman Number");
		}

		try {
			new RomanToDecimalConverter().convert("XDD");
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "Invalid Roman Number");
		}

		for (int i = 0; i < input.length; i++) {
			assertEquals(new RomanToDecimalConverter().convert(input[i]),
					expectedOutput[i]);
		}
	}

}
