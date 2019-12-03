package com.virtusa.codetext.numbertowordconvertor.main;

import java.util.Scanner;

import com.virtusa.codetext.numbertowordconvertor.NumberToWordConvertor;

public class MainClient {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter the Number to Conver to Word");

		NumberToWordConvertor numberToWordConvertor = new NumberToWordConvertor();

		while (scanner.hasNextInt()) {
			System.out.println(numberToWordConvertor.convertNumberToWord(scanner.nextInt()));
		}
		scanner.close();
	}

}
