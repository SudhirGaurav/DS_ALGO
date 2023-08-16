package com.example.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {

		LinkedList<Integer> lnkedList= new LinkedList<>();
		
		lnkedList.add(2);
		lnkedList.add(3);
		lnkedList.add(5);
		lnkedList.add(7);
		lnkedList.add(8);
		
		lnkedList.print();
		
		lnkedList.removeAtLocation(0);
		lnkedList.print();
		
		
	}

}
