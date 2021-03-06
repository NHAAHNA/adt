package com.data.adt;

import com.data.node.Node;

public class LinkedList{
	Node head;
    Node current;
	
	public void append(int data){
		if(null==head){
			head = new Node(data);
		}
		current = head;
		while(head.next !=null){
			current = current.next;
		}
		current = new Node(data);
	}
	
	public void prepend(int data){
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void deleteWithValue(int data){
		if(head == null){
			return;
		}
		if(head.data == data){
			head = head.next;
			return;
		}
		Node current  = head;
		while(current.next!=null){
			if(current.next.data == data){
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	public void display(){
		Node current = head;
		while(current.next!=null){
			System.out.println("[Node : "+current.next.data);
			current = current.next;
		}
	}
}