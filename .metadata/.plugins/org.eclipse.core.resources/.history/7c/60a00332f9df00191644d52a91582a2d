package com.leetcode.bl;

/**
 * @author luowailin
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * 
 */
public class Leetcode_DeleteNode {

	private ListNode first;
	int size;
	
	//删除链表中的某个节点
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

    public void addListlNode(ListNode node) {
    	node.next = null;
    	if (first == null) {
			first = node;
    	} else {
    		ListNode tmpNode = first;
			while(tmpNode.next != null) {   //复杂度为O(n)
				tmpNode = tmpNode.next;
			}
			tmpNode.next = node;
    	}
		size ++;
	}
	
	@Override
	public String toString() {
		ListNode node = first;
		StringBuffer string = new StringBuffer();
		string.append("[");
		while (node != null) {
			string.append(node.val).append(", ");
			node = node.next;
		}
		string.append("]");
		return string.toString();
	}
}
