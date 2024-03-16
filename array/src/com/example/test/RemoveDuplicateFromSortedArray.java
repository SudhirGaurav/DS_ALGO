package com.example.test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {

		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		int[] retArr= removeDuplicateFromSortedArrayThroughSet(arr);
		System.out.println();
	}

	private static int[] removeDuplicateFromSortedArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j2 = i+1; j2 < arr.length; j2++) {
				
			}
		}
		return null;
	}

	private static int[] removeDuplicateFromSortedArrayThroughSet(int[] arr) {
		Set<Integer> sets = new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			sets.add(arr[i]);
		}
		System.out.println("Set is : "+sets);
		return createArr(sets);
	}

	private static int[] createArr(Set<Integer> sets) {
		int[] retArr = new int[sets.size()];
		Object[] oArr= sets.toArray();
		for (int i = 0; i < sets.size(); i++) {
			retArr[i] = (int) oArr[i];
		}
		return retArr;
	}
	
	public static void printArr (int[]  arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}
}
