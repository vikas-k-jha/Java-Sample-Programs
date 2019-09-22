package com.sample.example.array;

import java.util.Arrays;

// program to find smallest positive integer not found in given array

public class SmallestPositiveNumber {

	// method to get smallest positive integer.
	private static int getSmallestPositiveNumber(int[] A) {

		Arrays.sort(A);

		if (A.length == 0 || (A[A.length - 1] <= 0) || (A[0] > 1))
			return 1;
		if (A.length == 1 && (A[0] == 1))
			return A[0] + 1;

		int target = A[0];

		for (int i = 0; i < A.length - 1; i++) {
			if (target < 0 && A[i + 1] > 1) {
				return 1;
			} else if (target < 0) {
				target = A[i + 1];
				continue;
			} else if (A[i + 1] - target > 1) {
				return target + 1;
			} else {
				target = A[i + 1];
				continue;
			}
		}
		return A[A.length - 1] + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Example_Empty_Element = {};
		int[] Example_Zero_Element = { 0 };
		int[] Example_One_Element = { 1 };
		int[] Example_Element_GT_ONE = { 2 };
		int[] Example_Element_LT_ZERO = { -1 };
		int[] Example_2Element_LT_ZERO = { -1, -2 };
		int[] Example_Elements_ZERO_LT = { -1, -2, 0 };
		int[] Example_BIG_NigPos = { -100000, 100000 };
		int[] Example_Sequesce = { 1, 2, 3 };
		int[] Example_Random_Pos_Number = { 1, 2, 3, 5, 6, 8 };

		System.out.println("Example_Empty_Element=" + getSmallestPositiveNumber(Example_Empty_Element));
		System.out.println("Example_Zero_Element=" + getSmallestPositiveNumber(Example_Zero_Element));
		System.out.println("Example_One_Element=" + getSmallestPositiveNumber(Example_One_Element));
		System.out.println("Example_Element_GT_ONE=" + getSmallestPositiveNumber(Example_Element_GT_ONE));
		System.out.println("Example_Element_LT_ZERO=" + getSmallestPositiveNumber(Example_Element_LT_ZERO));
		System.out.println("Example_2Element_LT_ZERO=" + getSmallestPositiveNumber(Example_2Element_LT_ZERO));
		System.out.println("Example_Elements_ZERO_LT=" + getSmallestPositiveNumber(Example_Elements_ZERO_LT));
		System.out.println("Example_BIG_NigPos=" + getSmallestPositiveNumber(Example_BIG_NigPos));
		System.out.println("Example_Sequesce=" + getSmallestPositiveNumber(Example_Sequesce));
		System.out.println("Example_Random_Pos_Number=" + getSmallestPositiveNumber(Example_Random_Pos_Number));
	}
}
