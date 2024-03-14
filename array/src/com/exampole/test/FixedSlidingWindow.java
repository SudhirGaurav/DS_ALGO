package com.exampole.test;

public class FixedSlidingWindow {

	//find the maximum sum of 3 size subarray 
	//Find maximum (or minimum) sum of a subarray of size k
	public static int fixedSlidingWindow(int[] arr, int window) {
		int maxSum = 0;
		int tempSum=0;
		// find initial window sum is
		for (int i = 0; i < window; i++) {
			tempSum = tempSum + arr[i];
		}
		maxSum = tempSum;
		System.out.println(maxSum);
		for (int i = window; i < arr.length; i++) {
			//System.out.println(tempSum + "+"+);
			tempSum = tempSum + arr[i] - arr[i - window];   // Adding next element , subtracting just last element of window .
			System.out.println(tempSum);
			if (tempSum > maxSum) {
				maxSum = tempSum;
			}
		}
		return maxSum;
	}
	
	
	public static void main(String[] args) {

		int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
		
			int maxSum= fixedSlidingWindow(arr, 4);
			System.out.println("max sum is : "+maxSum);
		
	}

}
