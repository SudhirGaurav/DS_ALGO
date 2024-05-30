package com.example.test;
/*
 * Given an array of integers nums sorted in non-decreasing order, 
 * find the starting and ending position of a given target value.
	If target is not found in the array, return [-1, -1].
	You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearchLeet34 {

	public static void main(String[] args) {

		int[] nums = {1};
		int target =1;
		
	int[] retArr=	searchRange(nums,target);
	UtilArrayClass.printArray(retArr);
	}

	 public static int[] searchRange(int[] nums, int target) {
	        
         int[] retArr = {-1,-1};
        int left = 0;
        int right = nums.length -1 ;
        int mid = (left +right )/2;
        while (left <= right ){
            if(target == nums[mid]){
            	System.out.println(" nums.length : "+ nums.length);
            	if(nums.length <= 1) { // this is for corner case
            		return retArr;
            	}
            	System.out.println("After if :");
                if(target == nums[mid-1]){
                  retArr[0] = mid -1 ;
                    retArr[1] = mid;
                }
                else if(target == nums[mid+1]){
                       retArr[0]= mid;
                    retArr[1] = mid+1;
                    }
                    return retArr;
            }

            if(target > nums[mid] ){
                left = mid+1;
            }else{
                right = mid-1;
            }
            mid= (left+right)/2;
        }

        return retArr;
    }
}

