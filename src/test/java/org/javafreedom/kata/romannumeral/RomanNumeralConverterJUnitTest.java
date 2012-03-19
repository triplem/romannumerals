package org.javafreedom.kata.romannumeral;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class RomanNumeralConverterJUnitTest {

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

		arabicNumber = 980;
		romanNumeral = romanNumeralConverter.convert(arabicNumber);
		assertEquals("CMLXXX", romanNumeral);

		arabicNumber = 70;
		romanNumeral = romanNumeralConverter.convert(arabicNumber);
		assertEquals("LXX", romanNumeral);

		arabicNumber = 4;
		romanNumeral = romanNumeralConverter.convert(arabicNumber);
		assertEquals("IV", romanNumeral);
	}

}
