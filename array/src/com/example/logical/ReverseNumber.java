package com.example.logical;


// Q: input = 1234   --> output = 4321
public class ReverseNumber {
	public static void main(String[] args) {
		int num = 1234;
		// op = 4321
		int reverse = 0;
		while (num > 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse is :" + reverse);
	}
}
