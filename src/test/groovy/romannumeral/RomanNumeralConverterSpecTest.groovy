package org.javafreedom.kata.romannumeral;

import spock.lang.Specification

class RomanNumeralConverterSpecTest extends Specification {

  RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();

  def "RomanNumeralConverter must return correct value"() {
    expect:
    romanNumeralConverter.convert(arabicNumber) == romanNumeral

    where:
    arabicNumber  | romanNumeral
    1990          | "MCMXC"
    980           | "CMLXXX"
    70            | "LXX"
    4             | "IV"
  }

}