package com.example.test.rough;

import java.util.Arrays;

public class Rough {

	public static void main(String[] args) {

		int[] arr = new int [10];

		Arrays.fill(arr, -1);
		
		System.out.println("Arr is : "+arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
