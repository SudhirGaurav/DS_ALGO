package com.example.stack;

import java.util.Stack;

public class CheckStringParanthasis {

	
	public static boolean isBalancedParentheses(String s){
	    char[] charArr = s.toCharArray();
	     Stack<Character> stack= new Stack<>();
	     System.out.println("Stirg is : "+s);
	     for(int i=0; i<s.length() ; i++){
	         if(stack.isEmpty()){
	             stack.push(charArr[i]);
	             continue;
	         }
             System.out.println("Stirg is 16 : "+stack.peek());

	         if((charArr[i]== ')' && '('==stack.peek() )){
	             stack.pop();
	         }else{
	              stack.push(charArr[i]);
	         }
	     }
	     if(stack.isEmpty()){
	         return true;
	     }else{
	       return false;  
	     }
	     
	}
	public static void main(String[] args) {

		  String s1 = "(()())";
		  
		  System.out.println(isBalancedParentheses(s1));
		
	}

}
