package 链表;

/**
 * @author luowailin
 * 141题
 * 环形链表
 * https://leetcode-cn.com/problems/linked-list-cycle/
 *  
 */

public class _141_环形链表 {
	//快慢指针思想
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;
        
		while (fast != null && fast.next != null) {
			if (slow == fast) {
				return true;
			}
			
			head = head.next;
            slow = head;
            fast = head.next.next;
		}
		
		return false;
	}
	
}
