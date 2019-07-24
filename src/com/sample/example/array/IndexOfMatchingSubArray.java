package com.sample.example.array;

/*
 * Program to find index of matching SubArray from given Array
 */
public class IndexOfMatchingSubArray {

	public static void main(String[] args) {

		char[] sourceArray = new char[] {'a','b',1,2,'c','d','f'};
		char[] targetArray = new char[] {'a','b',1};

		System.out.println("Index - " + firstIndexOfMatchingSubArray(sourceArray, targetArray));
	}

	/*
	 * method to return first index of matching SubArray  
	 */
	private static int firstIndexOfMatchingSubArray(char[] source, char[] target) {

		if (source == null || target == null || source.length <  target.length) 
			throw new IllegalStateException("Invalid input!");

		int startIndex=0;
		for (int i=0;i<source.length;i++) {
			if (source[i] == target[startIndex]) {
				startIndex++;
			} else if (startIndex > 0) {
				startIndex = 0;
			}
			if (startIndex == target.length) return i - (target.length -1);
		}

		throw new IllegalStateException("No match found!");
	}

}
