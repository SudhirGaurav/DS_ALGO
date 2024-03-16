package com.example.test;

public class LeftShiftArray {
	

	public static void main(String[] args) {
		int[] nums = {2,4,5,6,7};
		int shift =2;
		int[] arr=	leftShift(nums, shift);
		UtilArrayClass.printArray(arr);
	}

	private static int[] leftShift(int[] nums, int shift) {
		if(nums == null ||  nums.length==0) {
			return nums;
		}
		int[] tempArr = new int[nums.length];
		for (int i = shift; i < nums.length; i++) {
			tempArr[i-shift]= nums[i];
		}
		int lastFillingIndex = nums.length - shift;
		int startIndex=0;
		while(shift !=startIndex) {
			tempArr[lastFillingIndex] = nums[startIndex];
			startIndex++;
			lastFillingIndex++;
		}
		return tempArr;
	}

}
