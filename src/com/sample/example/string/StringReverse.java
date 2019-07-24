package com.sample.example.string;

/**
 * <br>
 * Problem Statement :
 * 
 * Reverse of a string
 * 
 * </br>
 * 
 * @author Vikas Jha
 */
public class StringReverse {

	public static void main(String[] args) {

		// test case
		System.out.println("Reverse of VIKAS : " + stringReverseWithStringBuffer("VIKAS"));
		System.out.println("Reverse of ROHAN : " + stringReverseDivideAndSwap("ROHAN"));
		System.out.println("Reverse of FRANK : " + stringReverseWithForwardRecursion("FRANK"));
		System.out.println("Reverse of PRANK : " + stringReverseWithReverseRecursion("PRANK"));
	}

	// 1 - String reverse using stringBuffer
	private final static String stringReverseWithStringBuffer(String str) {

		char[] stringToReverse = str.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();

		for (int i = stringToReverse.length - 1; i >= 0; i--) {
			stringBuffer.append(stringToReverse[i]);
		}
		return stringBuffer.toString();
	}

	// 2 - String reverse using divide and swap
	private final static String stringReverseDivideAndSwap(String str) {

		char[] stringToReverse = str.toCharArray();
		int length = stringToReverse.length;
		int mid = length / 2;

		for (int i = 0; i < mid; i++) {
			char c = stringToReverse[i];
			stringToReverse[i] = stringToReverse[length - i - 1];
			stringToReverse[length - i - 1] = c;
		}

		return String.valueOf(stringToReverse);
	}

	// 3 - String reverse with Forward Recursion
	private final static String stringReverseWithForwardRecursion(String str) {

		if ((str == null) || (str.length() <= 1))
			return str;
		return stringReverseWithForwardRecursion(str.substring(1)) + str.charAt(0);
	}

	// 4 - String reverse with Reverse Recursion
	private final static String stringReverseWithReverseRecursion(String str) {

		if ((str == null) || (str.length() <= 1))
			return str;
		return str.charAt(str.length() - 1) + stringReverseWithReverseRecursion(str.substring(0, str.length()-1));
	}
}
