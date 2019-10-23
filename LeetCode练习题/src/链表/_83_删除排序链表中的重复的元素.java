package 链表;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class _83_删除排序链表中的重复的元素 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode node = head;
		ListNode nextNode = head.next;
		while (node != null) {
			nextNode = node.next;
			while (nextNode != null) {
				if  (nextNode.val > node.val) {
					break;
				}
				
				if (nextNode.val == node.val) {
					if (nextNode.next == null) {
						node.next = null;
						return head;
					}  else {
						deleteNode(nextNode);
					}
				} else {
					nextNode = nextNode.next;
				}
			}
			node = node.next;
		}

		return head;
	}
	
	public ListNode deleteDuplicates2(ListNode head) {
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.next.val == current.val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}
	
	private void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
	
}
