package com.sample.example.string;

/**
 * <br> Problem Statement :
 *  
 * Validate palindrome string
 * 
 * </br>
 * 
 * @author Vikas Jha
 */
public class PalindromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Is 'Vikas' palindrome: " + isPalindromeString("Vikas"));
		System.out.println("Is 'level' palindrome: " + isPalindromeString("level"));
	}
	
	private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }

}
