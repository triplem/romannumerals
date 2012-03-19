package org.javafreedom.kata.romannumeral;

import spock.lang.Specification

class RomanNumeralSpecTest extends Specification {

  RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();

  def "1990 must return correct value"() {
    expect:
    romanNumeralConverter.convert(1990) == "MCMXC"
  }

}