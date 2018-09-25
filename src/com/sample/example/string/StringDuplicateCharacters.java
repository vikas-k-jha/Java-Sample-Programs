package com.sample.example.string;

import java.util.HashMap;
import java.util.Map;

/**
 * <br>
 * Problem Statement :
 * 
 * Program to find Repeated/duplicate characters in a String
 * 
 * </br>
 * 
 * @author Vikas Jha
 */
public class StringDuplicateCharacters {

	public static void main(String[] args) {

	}

	private static void duplicateCharactersWithCollection(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		
		for (int i=0; i < str.length()/2; i ++) {
			map.put(charArray[0], value)
		}
		
	}
}
