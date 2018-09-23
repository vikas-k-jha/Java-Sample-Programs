package com.sample.example.string;

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
		
		System.out.println("Reverse of VIKAS : " + stringReverseOption1("VIKAS"));	
		System.out.println("Reverse of JHA : " + stringReverseOption2("JHA"));
		System.out.println("Reverse of PRANK : " + stringReverseWithRecursion2("PRANK") );
		System.out.print("Reverse of FRANK : ");
		stringReverseWithRecursion1("", "FRANK");
		
	}
	
	// 1 - String reverse using stringBuffer
	private final static String stringReverseOption1(String str){
		
		char[] stringToReverse = str.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		
		for(int i=stringToReverse.length-1;i>=0;i--){
			stringBuffer.append(stringToReverse[i]);
		}
		return stringBuffer.toString();
	}
	
	// 2  - String reverse using divide and swap
	private final static String stringReverseOption2(String str){
		
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
	
	// 3 - String reverse recursively 
    private final static void stringReverseWithRecursion1(String reverseString, String str) {
        
    	if (str.length() == 0) 
            System.out.print(reverseString);
        else {
        	stringReverseWithRecursion1(reverseString + str.charAt(str.length()-1), str.substring(0, str.length()-1));
        }
    }
    
    // 4 - String reverse recursively 
	private final static String stringReverseWithRecursion2(String str) {

		if ((str == null) || (str.length() <= 1))
			return str;
		return stringReverseWithRecursion2(str.substring(1)) + str.charAt(0);
	}    
    
}
