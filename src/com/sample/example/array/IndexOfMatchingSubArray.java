package com.sample.example.array;

/*
 * Program to find index of matching SubArray from given Array
 */
public class IndexOfMatchingSubArray {

	/*
	 * method to return first index of matching SubArray
	 */
	private static int firstIndexOfMatchingSubArray(char[] source, char[] target) {

		int tempIndex = -1;
		if (source == null || target == null || source.length == 0 || target.length == 0 || source.length < target.length)
			return tempIndex;

		int startIndex = 0;
		for (int i = 0; i < source.length; i++) {
			if (source[i] == target[startIndex]) {
				startIndex++;
			} else if (startIndex > 0) {
				startIndex = 0;
			}
			if (startIndex == target.length)
				return i - (target.length - 1);
		}
		return tempIndex;
	}

	public static void main(String[] args) {

		int aResult;
		// Example1
		char[] sourceArray_example1 = new char[] { 'a', 'b', 1, 2, 'c', 'd', 'f' };
		char[] targetArray_example1 = new char[] { 'a', 'b', 1 };
		aResult = firstIndexOfMatchingSubArray(sourceArray_example1, targetArray_example1);
		System.out.println("Index - " + (aResult < 0 ? "Matching subarray not found" : aResult));

		// Example2
		char[] sourceArray_example2 = new char[] {};
		char[] targetArray_example2 = new char[] { 'a', 'b', 1 };
		aResult = firstIndexOfMatchingSubArray(sourceArray_example2, targetArray_example2);
		System.out.println("Index - " + (aResult < 0 ? "Matching subarray not found" : aResult));

		// Example3
		char[] sourceArray_example3 = new char[] { 'a', 'b', 1, 2, 'c', 'd', 'f' };
		char[] targetArray_example3 = new char[] {};
		aResult = firstIndexOfMatchingSubArray(sourceArray_example3, targetArray_example3);
		System.out.println("Index - " + (aResult < 0 ? "Matching subarray not found" : aResult));

		// Example4
		char[] sourceArray_example4 = new char[] { 'a', 'b', 1, 2, 'c', 'd', 'f' };
		char[] targetArray_example4 = new char[] { 2, 'c', 'd' };
		aResult = firstIndexOfMatchingSubArray(sourceArray_example4, targetArray_example4);
		System.out.println("Index - " + (aResult < 0 ? "Matching subarray not found" : aResult));

		// Example5
		char[] sourceArray_example5 = new char[] { 'a', 'b', 1, 2, 'c', 'a', 2, 'c', 'd', 'f' };
		char[] targetArray_example5 = new char[] { 2, 'c', 'd' };
		aResult = firstIndexOfMatchingSubArray(sourceArray_example5, targetArray_example5);
		System.out.println("Index - " + (aResult < 0 ? "Matching subarray not found" : aResult));
	}
}
