package com.vikas.java.string_operation;

/**
 * <br> Problem Statement :
 *  
 * Find the Permutation of given string
 * 
 * </br>
 * 
 * @author Vikas Jha
 */
public class StringPermutation {

	public static void main(String[] args) {
		String str="ABC";
		permutation(str);
	}

	private static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++) 
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
}