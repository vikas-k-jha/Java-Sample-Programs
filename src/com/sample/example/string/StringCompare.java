package com.sample.example.string;

/**
 * <br> Problem Statement :
 *  
 * Compare string reference v/s value 
 * 
 * </br>
 * 
 * @author Vikas Jha
 */
public class StringCompare {

	public static void main(String[] args) {
		
		String S1="ABC";					// Stored in String pool
        String S2="ABC";					// Share the same reference as S1
        String S3 = new String("ABC");		// Stored in Heap memory
        String S4 = S3;						// Share same reference as S3
        String S5 = new String("ABC");		// Stored in Heap memory with new address
        
        // Note - Below comparison return false 
        System.out.println("Reference S1 == S2 : " + S1 == S2); // false
        
        // == : compare reference 
        System.out.println("Reference S1 == S2 : " + (S1 == S2)); // true
        System.out.println("Reference S1 == S3 : " + (S1 == S3)); // false
        System.out.println("Reference S3 == S4 : " + (S3 == S4)); // true
        System.out.println("Reference S3 == S5 : " + (S3 == S5)); // false
        
        // equals = compare value stored inside string variable
        System.out.println("Value S1 equals S2 : " + S1.equals(S2)); // true
        System.out.println("Value S1 equals S3 : " + S1.equals(S3)); // true
        System.out.println("Value S3 equals S4 : " + S3.equals(S4)); // true
        System.out.println("Value S3 equals S5 : " + S3.equals(S5)); // true
        
 	}

}
