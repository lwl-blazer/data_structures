package 链表;

import java.util.ArrayList;

/**
 * @author luowailin
 * 链表的中间结点
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */

public class _876_链表的中间结点 {

	//利用数组，把所有的节点保存进去，然后去size/2的下标就可以了
	public ListNode middleNode2(ListNode header) {
		ArrayList<ListNode> lists = new ArrayList<>(); 
		while (header != null) {
			lists.add(header);
			header = header.next;
		}
		
		if (lists.isEmpty()) {
			return header;
		}
		lists.siz
		
		int index = lists.size() % 2 == 0 ? lists.size() / 2 : lists.size() / 2 + 1;
		return lists.get(index);
	}
	
	//利用快慢指针
	public ListNode middleNode(ListNode head) {
		ListNode slowNode = head;
		ListNode fastNode = head;

		while (fastNode != null || fastNode.next != null) {
		  slowNode = slowNode.next;
		  fastNode = fastNode.next.next;
		}
		return slowNode;
	}
}
