package com.vikas.java.string_operation;

/**
 * <br> Problem Statement :
 *  
 * Reverse of a string
 * 
 * </br>
 * 
 * @author Vikas Jha
 */
public class StringReverse {
	
	public static void main(String[] args) {
		
		System.out.println("Reverse of VIKAS :" + stringReverseOption1("VIKAS"));	
		System.out.println("Reverse of JHA :" + stringReverseOption2("JHA"));	
	}
	
	// 1 - String reverse using stringBuffer
	private static String stringReverseOption1(String str){
		
		char[] stringToReverse = str.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		
		for(int i=stringToReverse.length-1;i>=0;i--){
			stringBuffer.append(stringToReverse[i]);
		}
		return stringBuffer.toString();
	}
	
	// 1 - String reverse using divide and swap
	private static String stringReverseOption2(String str){
		
		char[] stringToReverse = str.toCharArray();	
		int length = stringToReverse.length;
		int mid = length/2;
		
		for(int i=0 ; i < mid ; i++) {
			char c = stringToReverse[i];
			stringToReverse[i] = stringToReverse[length-i-1];
			stringToReverse[length-i-1] = c;
		}
		
		return String.valueOf(stringToReverse);
	}
}
