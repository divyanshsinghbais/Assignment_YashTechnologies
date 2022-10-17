package com.yash.ftp.solutions.probSolving;

public class LinkedList {
	// Head node initialize
	Node head;
	//static node class to call from main method
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}
	//insert operation
	public static LinkedList insert(LinkedList list, int data) {
		Node new_node = new Node(data);
		//If list is empty, then put head node with data
		if(list.head == null) {
			list.head = new_node;
		} //Else travel the existing list and add the new node at when next is null
		else {
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	//delete operation
	public static LinkedList deleteByKey(LinkedList list,int key) {
		Node currNode = list.head;
		Node prev = null;

		// CASE 1: If head node itself holds the key to be deleted
		if (currNode != null && currNode.data == key) {
			list.head = currNode.next; // Changed head to next node
			System.out.println(key + " found and deleted");
			return list;
		}

		// CASE 2: If the key is somewhere other than at head
		// Search for the key to be deleted,keep track of the previous node, as it is needed to change currNode.next
		while (currNode != null && currNode.data != key) {
			prev = currNode;
			currNode = currNode.next;
		}

		// If the key was present, it should be at currNode. Therefore the currNode shall not be null
		if (currNode != null) {
			// Link prev node next to current node next, so that middle node is deleted from list.
			prev.next = currNode.next;
			System.out.println(key + " found and deleted");
		} else {
			System.out.println(key + " key not found in list");
		}
		return list;
	}

	//print linked list method
	public static void show(LinkedList list) {
		Node current_node = list.head;
		while(current_node.next != null) {
			System.out.print(current_node.data +" ");
			current_node = current_node.next;
		}
		System.out.print(current_node.data);
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		insert(list,10);
		insert(list,20);
		insert(list,30);
		insert(list,40);
		insert(list,50);
		insert(list,60);
		show(list);
		deleteByKey(list, 20);
		show(list);
		deleteByKey(list,100);
		show(list);
		System.out.println("reverse function called");
		//reverseList(list.head); 
		//show(list);
	}
}