package com.sample.example.array;

import java.util.Arrays;

/*
 * Program to merge array with below condition 
 * Condition1 - "last element of an array" = "first element of next array"
 * Condition2 - remove empty array
 */

public class MergeSubArrayWithMatchingElement {

	// merge array if "last element of an array" = "first element of next array"
	private static void getMergedArray(int[][] iArrays) {

		if (iArrays == null || iArrays.length == 0)
			throw new IllegalStateException("Invalid Input!");

		int COUNTER = 0;
		int index = COUNTER;

		while (COUNTER < iArrays.length) {

			if (iArrays[COUNTER].length == 0) {
				COUNTER++;
				continue;
			}

			int current_item_first_element = iArrays[COUNTER][0];

			while (COUNTER + 1 < iArrays.length && iArrays[COUNTER + 1].length != 0
					&& iArrays[COUNTER][iArrays[COUNTER].length - 1] == iArrays[COUNTER + 1][0]) {
				COUNTER++;
			}
			iArrays[index++] = new int[] { current_item_first_element, iArrays[COUNTER][iArrays[COUNTER].length - 1] };
			COUNTER++;
		}

		while (index < iArrays.length) {
			iArrays[index++] = null;
		}

	}

	// private method to display merged Arrays
	private static void displayArray(int[][] iArrays) {
		for (int[] aArray : iArrays) {
			if (Arrays.toString(aArray) != "null")
				System.out.print(Arrays.toString(aArray));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example1
		int[][] aArrays_Example1 = { {} };
		getMergedArray(aArrays_Example1);
		System.out.println("Arrays Example 1");
		displayArray(aArrays_Example1);

		// Example2
		int[][] aArrays_Example2 = { {},{} };
		getMergedArray(aArrays_Example2);
		System.out.println("\n\nArrays Example 2");
		displayArray(aArrays_Example2);

		// Example3
		int[][] aArrays_Example3 = { { 2, 3 },{} };
		getMergedArray(aArrays_Example3);
		System.out.println("\n\nArrays Example 3");
		displayArray(aArrays_Example3);

		// Example4
		int[][] aArrays_Example4 = { { 2, 3 } };
		getMergedArray(aArrays_Example4);
		System.out.println("\n\nArrays Example 4");
		displayArray(aArrays_Example4);

		// Example5
		int[][] aArrays_Example5 = { {},{ 2, 3 } };
		getMergedArray(aArrays_Example5);
		System.out.println("\n\nArrays Example 5");
		displayArray(aArrays_Example5);

		// Example6
		int[][] aArrays_Example6 = { {4},{ 4, 7 } };
		getMergedArray(aArrays_Example6);
		System.out.println("\n\nArrays Example 6");
		displayArray(aArrays_Example6);

		// Example7
		int[][] aArrays_Example7 = { { 2, 3 }, { 4, 5 }, { 5, 6 }, { 7, 8 }, { 9, 11 } };
		getMergedArray(aArrays_Example7);
		System.out.println("\n\nArrays Example 7");
		displayArray(aArrays_Example7);

		// Example8
		int[][] aArrays_Example8 = { { 2, 3 }, {}, { 5, 6 }, {}, { 6, 8 }, { 9, 11 } };
		getMergedArray(aArrays_Example8);
		System.out.println("\n\nArrays Example 8");
		displayArray(aArrays_Example8);

		// Example9
		int[][] aArrays_Example9 = { { 2, 3 }, { 3, 4 }};
		getMergedArray(aArrays_Example9);
		System.out.println("\n\nArrays Example 9");
		displayArray(aArrays_Example9);

		// Example10
		int[][] aArrays_Example10 = { { 2, 3 }, {}, {}, { 5, 6 }, {}, { 6, 8 }, { 9, 11 } };
		getMergedArray(aArrays_Example10);
		System.out.println("\n\nArrays Example 10");
		displayArray(aArrays_Example10);
	}
}
