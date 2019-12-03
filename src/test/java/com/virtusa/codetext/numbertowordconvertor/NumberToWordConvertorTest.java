package com.virtusa.codetext.numbertowordconvertor;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NumberToWordConvertorTest {

	private NumberToWordConvertor subject;

	@Before
	public void setup() {
		subject = new NumberToWordConvertor();
	}
	
	@Test
	public void testIfAnyNegativeDigitNumberIsConvertedToWord() {
		String expectedStringForSingleDigit = "Minus Nine";
		assertEquals(expectedStringForSingleDigit, subject.convertNumberToWord(-9));

	}

	@Test
	public void testIfAnySingleDigitNumberIsConvertedToWord() {
		String expectedStringForSingleDigit = "Nine";
		assertEquals(expectedStringForSingleDigit, subject.convertNumberToWord(9));

	}

	@Test
	public void testIfAnyTeenDigitNumberIsConvertedToWord() {
		String expectedStringForTeenDigit = "Nineteen";
		assertEquals(expectedStringForTeenDigit, subject.convertNumberToWord(19));

	}

	@Test
	public void testIfAnyDigitLessThanHundredIsConvertedToWord() {
		String expectedStringForTeenDigit = "Ninety Nine";
		assertEquals(expectedStringForTeenDigit, subject.convertNumberToWord(99));
		expectedStringForTeenDigit = "Fifty Five";
		assertEquals(expectedStringForTeenDigit, subject.convertNumberToWord(55));

	}

	@Test
	public void testIfAnyDigitLessThanThousandIsConvertedToWord() {
		String expectedStringForTeenDigit = "Nine Hundred and Ninety Nine";
		assertEquals(expectedStringForTeenDigit, subject.convertNumberToWord(999));

		expectedStringForTeenDigit = "Eight Hundred and Eighty Eight";
		assertEquals(expectedStringForTeenDigit, subject.convertNumberToWord(888));

	}

	@Test
	public void testIfAnyDigitLessThanHundredThousandIsConvertedToWord() {
		String expectedStringForTeenDigit = "Nine Thousand Nine Hundred and Ninety Nine";
		assertEquals(expectedStringForTeenDigit, subject.convertNumberToWord(9999));

		expectedStringForTeenDigit = "Eight Thousand Eight Hundred and Eighty Eight";
		assertEquals(expectedStringForTeenDigit, subject.convertNumberToWord(8888));

	}

	@Test
	public void testIfAnyDigitMoreThanHundredThousandIsConvertedToWord() {
		String expectedStringForTeenDigit = "Ninety Nine Thousand Nine Hundred and Ninety Nine";
		assertEquals(expectedStringForTeenDigit, subject.convertNumberToWord(99999));

		expectedStringForTeenDigit = "Forty Five Thousand Seven Hundred and Eighty One";
		assertEquals(expectedStringForTeenDigit, subject.convertNumberToWord(45781));

	}

	@Test
	public void testIfAnyDigitLessThanMillionIsConvertedToWord() {
		String expectedStringForTeenDigit = "Five Million Five Hundred and Ninety Nine Thousand Nine Hundred and Eight";
		assertEquals(expectedStringForTeenDigit, subject.convertNumberToWord(5599908));

	}
	@Test
	public void testIfAnyDigitLessThanTenMillionIsConvertedToWord() {
		String expectedStringForTeenDigit = "Fifty Six Million Nine Hundred and Forty Five Thousand Seven Hundred and Eighty One";
		assertEquals(expectedStringForTeenDigit, subject.convertNumberToWord(56945781));

	}

}
