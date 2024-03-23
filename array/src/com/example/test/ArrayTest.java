package com.example.test;

import java.util.ArrayList;
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
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		 int[] arr = new int[4];
		 arr[0]='_';
		 arr[1]=1;
		List temp= Arrays.asList(arr);
		//finalList.add(Arrays.asList(arr));
		System.out.println("FInal List is : "+finalList);
		
		//list.remove(0);
		//System.out.println(list);
		
		
	}

}
