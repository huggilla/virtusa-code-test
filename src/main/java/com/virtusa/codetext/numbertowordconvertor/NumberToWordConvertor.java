package com.virtusa.codetext.numbertowordconvertor;

import com.virtusa.codetext.numbertowordconvertor.constants.DigitConstant;

public class NumberToWordConvertor {

	public String convertNumberToWord(int number) {

		if (number < 0) {
			return "Minus" + convertNumberToWord(-number);
		} else if (number < 20) {
			return "" + DigitConstant.UNITS[number];

		} else if (number < 100) {
			return "" + DigitConstant.TENS[number / 10]
					+ ((number % 10 != 0 ? " " : "") + convertNumberToWord(number % 10));
		} else if (number < 1000) {
			return DigitConstant.UNITS[number / 100] + " Hundred and"
					+ ((number % 100 != 0 ? " " : "") + convertNumberToWord(number % 100));

		} else if (number < 1000000) {
			return convertNumberToWord(number / 1000) + " Thousand"
					+ ((number % 1000 != 0 ? " " : "") + convertNumberToWord(number % 1000));

		} else if (number < 1000000000) {
			return convertNumberToWord(number / 1000000) + " Million"
					+ ((number % 1000000 != 0 ? " " : "") + convertNumberToWord(number % 1000000));

		}

		return convertNumberToWord(number / 1000000000) + " billion" + ((number % 1000000000 != 0) ? " " : "")
				+ convertNumberToWord(number % 1000000000);
	}

}
