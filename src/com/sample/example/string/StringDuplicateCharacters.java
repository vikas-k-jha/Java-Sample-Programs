package com.sample.example.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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
		duplicateCharactersUsingHashMap("Vikaskumarjha");
		System.out.println("################################");
		duplicateCharactersUsingStreams("Vikaskumarjha");
	}

	/*
	 * find repeated/duplicate characters using collections 
	 */
	private static void duplicateCharactersUsingHashMap(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		int stringLength = str.length();
		for (int i=0; i < stringLength/2; i ++) {
			map.put(charArray[i], map.containsKey(charArray[i])? map.get(charArray[i])+1:1);
			map.put(charArray[stringLength-1-i], map.containsKey(charArray[stringLength-1-i])? map.get(charArray[stringLength-1-i])+1:1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()){
			System.out.println("Key = " + entry.getKey() +  ", Value = " + entry.getValue());
		}
		
	}
	/*
	 * find repeated/duplicate characters using Java8 
	 */
	private static void duplicateCharactersUsingStreams(String str) {
		Map<String , Long> map =  Arrays.stream(str.split("")).collect(Collectors.groupingBy(c -> c , Collectors.counting()));
		        map.forEach( (k, v) -> System.out.println(k + " : "+ v));
	}	
}
