package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class AnagramOfArray {
	static List<int[]> anagramList = new ArrayList<>();

	public static void main(String[] args) {

		//int[] nums = new int[5];
		int [] nums= {1,2,3};
		printAnagram(nums);
	}

	private static void printAnagram(int[] nums) {

		anagramList.add(nums);
		//for (int i = 0; i < nums.length; i++) {
			shiftingArr(nums,nums.length-1);
		//}
		//shiftingArray(nums);
	}

	private static void shiftingArr(int[] nums, int index) {
		if (index == (nums.length - 1)) {
			for (int i = index; i > 0; i--) {
				int temp = nums[i - 1];
				nums[i - 1] = nums[i];
				nums[i] = temp;
				UtilArrayClass.printArray(nums);
				anagramList.add(nums);
			}
		}
	}

}
