package com.leetcode.bl;

import java.util.ArrayList;

public class Application {
	public static ArrayList<ListNode> array;

	public static void main(String[] args) {
		array = new ArrayList<>();

//		Leetcode_DeleteNode lists = new Leetcode_DeleteNode();
//		addNode(lists);
//		lists.deleteNode(array.get(2));
//		System.out.println(lists);

		Reverse_LinkedList list1 = new Reverse_LinkedList();
		ListNode node1 = new ListNode(10);
		list1.addListlNode(node1);

		ListNode node2 = new ListNode(20);
		list1.addListlNode(node2);
		
		ListNode node3 = new ListNode(30);
		list1.addListlNode(node3);
		
		ListNode node4 = new ListNode(40);
		list1.addListlNode(node4);
		
		ListNode node5 = new ListNode(50);
		list1.addListlNode(node5);
		System.out.println(list1);
		
		list1.reverseList2(node5);
		System.out.println(list1);
	}

	
	private static void addNode(SubLinkedList lists) {
		ListNode node1 = new ListNode(10);
		lists.addListlNode(node1);
		array.add(node1);
		ListNode node2 = new ListNode(20);
		array.add(node2);
		lists.addListlNode(node2);
		ListNode node3 = new ListNode(30);
		array.add(node3);
		lists.addListlNode(node3);
		ListNode node4 = new ListNode(40);
		array.add(node4);
		lists.addListlNode(node4);
		ListNode node5 = new ListNode(50);
		array.add(node5);
		lists.addListlNode(node5);
	}
	
}
