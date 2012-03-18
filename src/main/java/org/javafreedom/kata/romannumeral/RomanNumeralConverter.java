package org.javafreedom.kata.romannumeral;

import java.util.ArrayList;

/**
 *
 */
public class RomanNumeralConverter {

	private String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	private String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	private String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	private String[] thousands = {"", "M", "MM", "MMM"};

	public String convert(Integer arabicNumber) {
		String romanNumeral = "";
		
		int thousandsAccess = arabicNumber / 1000;
		arabicNumber = arabicNumber - thousandsAccess * 1000;
		romanNumeral = thousands[thousandsAccess];
		
		int hundredsAccess = arabicNumber / 100;
		arabicNumber = arabicNumber - hundredsAccess * 100;
		romanNumeral = romanNumeral + hundreds[hundredsAccess];
		
		int tensAccess = arabicNumber / 10;
		arabicNumber = arabicNumber - tensAccess * 10;
		romanNumeral = romanNumeral + tens[tensAccess];
		
		int onesAccess = arabicNumber;
		arabicNumber = arabicNumber - onesAccess;
		romanNumeral = romanNumeral + ones[onesAccess];
		
		return romanNumeral;
	}
	
}
