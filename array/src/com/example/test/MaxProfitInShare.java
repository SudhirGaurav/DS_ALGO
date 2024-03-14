package com.example.test;

import java.util.Iterator;

/*
Array: Max Profit  [Please note u have to find maximum profit ]
Returns an integer that is the maximum profit possible. If no profit can be made, the method should return 0.
note : buy should be early than sell.
*/

public class MaxProfitInShare {
	
	public static int getMaximumProfitOfShare(int[] arr) {
		int left=0;
		int right=1;
		int currMaxProfit= 0;
		for(int i =1 ;i< arr.length;i ++) {
			if ((arr[right] - arr[left]) < 0) { // this is the case when sell prce is lower than buy
				int temp = right;
				right = left;
				left = temp;
				continue;
			}
			right =i;
			int dif = arr[right] - arr[left];
			currMaxProfit= (dif > currMaxProfit) ? dif: currMaxProfit;
		}
		return currMaxProfit;
	}

	public static void main(String[] args) {

		int[] stockPrice = {7, 1, 5, 3, 6, 4};
		System.out.println("Max share profit is : "+getMaximumProfitOfShare(stockPrice));
	}

}
