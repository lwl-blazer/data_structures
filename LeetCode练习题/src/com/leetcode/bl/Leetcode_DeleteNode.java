package com.leetcode.bl;

/**
 * @author luowailin
 * 237题
 * 删除某一个节点
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 *  
 */
public class Leetcode_DeleteNode extends SubLinkedList{
	
	//删除链表中的某个节点
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
