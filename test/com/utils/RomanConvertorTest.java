package com.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.model.Unit;

public class RomanConvertorTest {

	@Test
	public void StringToRamanConverterTest() {

		ArrayList<Unit> units = new ArrayList<Unit>();

		units.add(new Unit("ABC", "I"));
		units.add(new Unit("DEF", "V"));
		units.add(new Unit("GHI", "X"));
		units.add(new Unit("JKL", "L"));
		units.add(new Unit("MNO", "C"));
		units.add(new Unit("PQR", "D"));
		units.add(new Unit("STU", "M"));

		RomanConverter romanConverter = new RomanConverter();

		String[] inadd = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQR", "STU",
				"ABC DEF GHI JKL MNO PQR STU", "JKL PQR STU",
				"Hi this is test", };

		String[] expectedOutadd = { "I", "V", "X", "L", "C", "D", "M",
				"IVXLCDM", "LDM", "" };
		for (int i = 0; i < inadd.length; i++) {
			assertEquals(romanConverter.convert(inadd[i], " ", units),
					expectedOutadd[i]);
		}
	}

}
