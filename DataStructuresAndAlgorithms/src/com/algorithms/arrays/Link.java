/*package com.algorithms.arrays;

import java.util.LinkedList;

import javax.xml.soap.Node;

public class Link {
	Node head;
		int data;
		Node next;
		Link(int d){
			this.data = d;
			next = null;
	}
	
	Node reverse(Node n){
		Node current=n;Node previous=null;Node next=null;
		while(current!=null){
			next = current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		n = previous;
		return n;
		}
	public static void main(String[]args){
		Link list = new Link();
		list.head = new Node(4);
		
	}
}
*/