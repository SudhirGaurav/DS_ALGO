package com.example.logical;

//Q: Print 0 , 10, 100,1000,10000..... Print n =10

public class Print10sMultipe {

	public static void main(String[] args) {

		int mul = 1;
		for(int i =0 ; i <10 ; i ++) {
			if(i==0) {
				System.out.println(0);
				continue;
			}
			mul = mul*10;
			System.out.println(mul);
		}
	}
}
