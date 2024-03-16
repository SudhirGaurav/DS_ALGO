package com.example.test;

public class UtilArrayClass {

	public static void printArray(int[] arr) {
		if(arr== null || arr.length==0) {
			System.out.println("Empty Array ");
			return ;
		}
		System.out.println("Array is ...");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
}
