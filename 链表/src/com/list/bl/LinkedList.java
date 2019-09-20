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

	}

	@Override
	public boolean contains(E element) {
		return indexOf(element) != ELEMENT_NOT_FOUND;
	}

	@Override
	public E get(int index) {

		return null;
	}

	@Override
	public E set(int index, E element) {

		return null;
	}

	@Override
	public void add(int index, E element) {
		Node<E> node = firstNode;
		if (node == null) {
			Node<E> newNode = new Node<>(element, null);
			firstNode = newNode;
		} else {
			for (int i = 1; i < index; i++) {
				node = node.next;
			}
			Node<E> newNode = new Node<>(element, node.next);
			node.next = newNode;
		}
		size ++;
	}

	@Override
	public E remove(int index) {

		return null;
	}

	@Override
	public int indexOf(E element) {

		return 0;
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
}
