package 链表;

public class SubLinkedList {
	protected ListNode first;
	protected int size;
	
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
