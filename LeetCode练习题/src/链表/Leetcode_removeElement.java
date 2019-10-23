package 链表;

/**
 * @author luowailin
 * 203题
 * 移除链表元素
 * https://leetcode-cn.com/problems/remove-linked-list-elements/solution/
 *  
 */

public class Leetcode_removeElement extends SubLinkedList {
	//从Leetcode上的运行时间来看，方法1为2ms 内存消耗为39.6mb   方法2为1ms 内存消耗38.5mb
	//方法1:递归
	public ListNode removeElements(ListNode head, int val) {		
		if (head == null) {
            return null;
        }
        
        head.next = removeElements(head.next, val);
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
	}
	
	//方法2：迭代
	public ListNode removeElement2(ListNode head, int val) {
		if (head == null ) {
            return null;
        } 
        if (head.next == null) {
            if (head.val == val) {
                head = null;
            }
            return head;
        }
        
        while (head.val == val) {
            head = head.next;
            if(head == null) return head;
        }
        
        ListNode node = head;
        ListNode preNode = head;
        while (node != null) {
			if (node.val == val) {
                preNode.next = node.next;
				node.next = null;
                node = preNode;
			}
            preNode = node;
			node = node.next;
		}
		return head;
	}
}
