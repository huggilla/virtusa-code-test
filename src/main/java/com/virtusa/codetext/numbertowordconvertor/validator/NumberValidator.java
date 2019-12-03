package com.virtusa.codetext.numbertowordconvertor.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidator {

	private static final String REGEX = "^-?\\d+$";

	public static boolean validate(String inputStr) {

		Pattern pattern = Pattern.compile(REGEX);

		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();

	}

}
