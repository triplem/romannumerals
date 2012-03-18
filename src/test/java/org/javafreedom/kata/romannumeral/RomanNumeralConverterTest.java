package org.javafreedom.kata.romannumeral;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class RomanNumeralConverterTest {

	private RomanNumeralConverter romanNumeralConverter;

	@Before
	public void setUp() {
		romanNumeralConverter = new RomanNumeralConverter();
	}
	
	@Test
	public void testConvert() {
		int arabicNumber = 1990;
		
		String romanNumeral = romanNumeralConverter.convert(arabicNumber);

		assertEquals("MCMXC", romanNumeral);
	}

}
