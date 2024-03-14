package com.exampole.test;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {


	public static void main(String[] args) {

		System.out.println("Hii");
	
		int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int [] arr2 = nums1;
		
		for(int a : arr2) {
			System.out.print(" "+a);
		}
		
	}

}
