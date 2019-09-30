package com.leetcode.bl;

/**
 * @author luowailin
 *  206
 *  https://leetcode-cn.com/problems/reverse-linked-list/
 *  反转链表
 */
public class Reverse_LinkedList extends SubLinkedList{
	
	public ListNode reverseList1(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode newNode = reverseList1(head.next);
		head.next = newNode;
		return newNode;
	}
	
	public ListNode reverseList2(ListNode head) {
		ListNode newHead = null;
		while (head != null) {
			ListNode tmp = head.next;
			head.next = newHead;
			newHead = head;
			head = tmp;
		}
		return newHead;
	}
}
