package 链表;

/**
 * @author luowailin
 *  206
 *  https://leetcode-cn.com/problems/reverse-linked-list/
 *  反转链表
 */
public class Reverse_LinkedList extends SubLinkedList{
	//递归反转
	public ListNode reverseList1(ListNode head) {
		/*
		if (head == null) { // 空链表
			return null;
		}

		if (head.next == null) { // 链表中只有一个Node
			return head;
		}*/
		
		if (head == null || head.next == null) { //边界条件
			return head;
		}

		ListNode newNode = reverseList1(head.next);
		
		head.next.next = head;
		head.next = null;
		return newNode;
	}
	
	//循环反转
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
