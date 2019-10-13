package com.sample.example.array;

/*
 * Program to split an array into two equal Sum subarrays (without changing an order)
 * 
 */

public class SplitArrayIntoTwoEqualSumSubArray {
	
	// split array into two equal sum subarray
	private static boolean isSplitArrayIntoTwoEqualSumSubArray(int[] iArray) {

		// User input validation
		if (iArray == null || iArray.length <= 1)
			return false;

		int leftIndex = 0, rightIndex = iArray.length - 1, leftSum = 0, rightSum = 0;

		while (leftIndex < rightIndex) {

			while (leftSum == rightSum && leftIndex < rightIndex) {
				leftSum += iArray[leftIndex++];
				rightSum += iArray[rightIndex--];
			}

			while (leftSum < rightSum) {
				leftSum += iArray[leftIndex++];
			}
			while (rightSum < leftSum) {
				rightSum += iArray[rightIndex--];
			}

		}
		if (leftSum == rightSum && leftIndex != rightIndex) {
			displaySubArray(iArray, --leftIndex, ++rightIndex);
			return true;
		}
		return false;
	}

	// display split array
	private static void displaySubArray(int[] iArray, int leftIndex, int rightIndex) {

		System.out.print("[ ");
		for (int i = 0; i < iArray.length; i++) {
			if (i <= leftIndex)
				System.out.print(iArray[i] + " ");
			else if (i == rightIndex) {
				System.out.print("] [ " + iArray[i] + " ");
			} else {
				System.out.print(iArray[i] + " ");
			}
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
	
		boolean status = false;

		// Example1
		int[] aArrays_Example1 = {};
		status = isSplitArrayIntoTwoEqualSumSubArray(aArrays_Example1) ? true : false;
		System.out.println("Test1 : Empty array - " + status);

		// Example2
		int[] aArrays_Example2 = { 1 };
		status = isSplitArrayIntoTwoEqualSumSubArray(aArrays_Example2) ? true : false;
		System.out.println("Test2 : Array with single elelment test - " + status);

		// Example3
		int[] aArrays_Example3 = { 1, 1 };
		status = isSplitArrayIntoTwoEqualSumSubArray(aArrays_Example3) ? true : false;
		System.out.println("Test3 : Array with 2 elelment test - " + status);

		// Example4
		int[] aArrays_Example4 = { 1, 2, 1 };
		status = isSplitArrayIntoTwoEqualSumSubArray(aArrays_Example4) ? true : false;
		System.out.println("Test4 : Array with 3 elelment test - " + status);

		// Example5
		int[] aArrays_Example5 = { 2, 3, 1, 1, 2, 2 };
		status = isSplitArrayIntoTwoEqualSumSubArray(aArrays_Example5) ? true : false;
		System.out.println("Test5 : Array with N elelment test - " + status);

		// Example6
		int[] aArrays_Example6 = { 2, 3, 2, 1, 1, 1, 2, 2 };
		status = isSplitArrayIntoTwoEqualSumSubArray(aArrays_Example6) ? true : false;
		System.out.println("Test6 : Array with N elelment test - " + status);

	}
}
