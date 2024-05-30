package com.example.test;

// Binary means ,array is in sorted order
// Q. U eed to find and eleemnt is present or not . retrun -1 or return index.
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,7};
		
		int number =10;
		// Return the index of 5 from array
		
		int ret = findElementFromArray(arr , number);
		System.out.println("Index of element:  "+number+  " is:  "+ret);
		
		int retRec = findElementFromArrayThroughRecursive(arr , number);
	}

	private static int findElementFromArrayThroughRecursive(int[] arr, int number) {

		
		return 0;
	}

	private static int findElementFromArray(int[] arr , int number) {
		int left =0 ;
		int right = arr.length -1;
		int mid = (left+right)/2;
		System.out.println(" Before while loop "+mid);
		while ((left < right)) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (arr[mid] == number) {
				return mid;
			}
			if(number > arr[mid]) {
				left = mid + 1;     // Hint , already mid pe check kr liya gaya hai eslye (mid +1 ) use kiya gaya h
			}else {
				right = mid -1 ;
			}
			mid=(left+right)/2;
			System.out.println("left -> "+left +" right-> "+right);
			System.out.println(mid);
		}
		return -1;
	}
}
