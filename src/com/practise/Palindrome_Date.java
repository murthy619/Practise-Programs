package com.practise;

public class Palindrome_Date {

	public static void main(String[] args) {
		String inputDate = "10-02-1999";
		long startYear = Long.valueOf(String.valueOf(inputDate).substring(6, 10)).longValue();
		long date;
		long month;
		boolean dateValidationFlag = false;

		for (long i = startYear - 1; i > 0; i--) {
		String reversedYear = new StringBuffer(String.valueOf(i)).reverse().toString();
		System.out.println(reversedYear);
		month = Long.valueOf(String.valueOf(reversedYear).substring(0, 2)).longValue();
		System.out.println(month);
		date = Long.valueOf(String.valueOf(reversedYear).substring(2, 4)).longValue();
		System.out.println(date);
		if (month < 13 && date < 32) {
		if (date == 28 && month == 2) {
		dateValidationFlag = true;
		}
		if (date == 31) {
		if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 10) || (month == 12)) {
		dateValidationFlag = true;
		}
		}
		}
		if (dateValidationFlag) {
		System.out.println("Palindrome date is " + date + "-" + month + "-" + i);
		break;
		}
		}

	}

}
