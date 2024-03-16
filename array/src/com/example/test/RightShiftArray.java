package com.example.test;

public class RightShiftArray {

	public static void main(String[] args) {

		int[] nums = { 2, 4, 5, 6, 7 };
		int shift = 3;
		int[] arr = rightShift(nums, shift);
		UtilArrayClass.printArray(arr);
	}

	private static int[] rightShift(int[] nums, int shift) {

		int n = nums.length;
		int rightIndex = n - shift;
		int startIndex = 0;
		int[] retArr = new int[n];
		while (rightIndex != n) {
			retArr[startIndex] = nums[rightIndex];
			rightIndex++;
			startIndex++;
		}
		for (int i = 0; i < n - shift; i++) {
			retArr[shift + i] = nums[i];
		}
		return retArr;
	}

}
