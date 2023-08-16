package com.example.linkedlist;

import java.util.Iterator;

class Node <T>{
	T value ;
	Node next;
	Node prev;
	public Node(T value, Node next, Node prev) {
		super();
		this.value = value;
		this.next = next;
		this.prev = prev;
	}
}

public class LinkedList<T> {
	Node head;
	Node tail;
	int size=0;
	
	public LinkedList<T> add(T value) {
		if (head == null) {
			head = new Node(value, null, null);
			tail = head;
			size++;
			return null;
		}
		Node temp = new Node(value, null, null);
		temp.prev = tail;
		tail.next = temp;
		tail = temp;
		size++;
		return null;
	}

	public LinkedList<T> print() {
		if(head==null) {
			return null;
		}
		Node temp = head;
		System.out.println("Insereted values in linked list are...");
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		return null;
	}
	
	//lets consider head is at 0th location 
	//It workes for all boundry condition 
	public LinkedList<T> removeAtLocation(int location) {
		System.out.println("Size is : "+size);
		if(size==0) {
			return null;
		}
		if ((size-1) < location) {
			System.out.println("location+"+location+" is larger than ll size : "+size);
			return null;
		}
		Node temp = head;
		for (int i = 1; i < location; i++) { // Starting from 1 bcz , temp is already pointing to loc 0
			temp=temp.next;
		}
		if(temp == head) {
			head=head.next;
			return null;
		}
		temp.next=temp.next.next;
		return null;
	}
	
	public LinkedList<T> reverse() {
		
		return null;
	}
}
