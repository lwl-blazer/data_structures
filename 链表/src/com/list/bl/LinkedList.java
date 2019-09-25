package com.list.bl;

public class LinkedList<E> extends AbstractList<E> {

	private Node<E> firstNode;

	private static class Node<E> {
		E element;
		Node<E> next;

		public Node(E element, Node<E> next) {
			this.element = element;
			this.next = next;
		}
	}

	@Override
	public void clear() {
		size = 0;
		firstNode = null;
	}

	@Override
	public boolean contains(E element) {
		return indexOf(element) != ELEMENT_NOT_FOUND;
	}

	@Override
	public E get(int index) {
		return node(index).element;
	}

	@Override
	public E set(int index, E element) {
		Node<E> node = node(index);
		E old = node.element;
		node.element = element;
		return old;
	}

	@Override
	public void add(int index, E element) {
		rangeCheckForAdd(index);
		if (index == 0) {
			firstNode = new Node<>(element, firstNode);
		} else {
			Node<E> prev = node(index - 1);
			prev.next = new Node<>(element, prev.next);
		}
		size ++;
	}

	@Override
	public E remove(int index) {
		rangeCheckForAdd(index);
		E old = firstNode.element;
		if (index == 0) {
		    firstNode = firstNode.next;
		} else {
			Node<E> node = node(index - 1);
			old = node.next.element;
			node.next = node.next.next;
		}
		size--;
		return old;
	}

	@Override
	public int indexOf(E element) {
		if (element == null) {
			return ELEMENT_NOT_FOUND;
		}
		
		Node<E> node = firstNode;
		int i = 0;
		while (node != null) {
			
			if (element.equals(node.element)) {
				return i;
			}
			node = node.next;
			i ++;
		}
		 
		return ELEMENT_NOT_FOUND;
	}

	@Override
	public String toString() {
		Node<E> node = firstNode;
		StringBuffer string = new StringBuffer();
		string.append("size=").append(size).append(",[");
		for (int i = 0; i < size; i++) {
			if (i != 0) {
				string.append(", ");
			}

			string.append(node.element);
			node = node.next;
		}
		string.append("]");
		return string.toString();
	}
	
	private Node<E> node(int index) {
		rangeCheck(index);
		
		Node<E> node = firstNode;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}
}
