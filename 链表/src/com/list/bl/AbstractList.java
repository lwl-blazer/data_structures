package com.list.bl;

public class AbstractList<E> implements List<E> {

	//元素的数量
		protected int size;
		protected static final int ELEMENT_NOT_FOUND = -1;
		/**
		 * 元素的数量*/
		public int size() {
			return size;
		}
		
		/**
		 * 是否为空*/
		public boolean isEmpty() {
			return size == 0;
		}
		
		protected void outOfBounds(int index) {
			throw new IndexOutOfBoundsException("Index:" + index + ",Size:" + size);	
		}
		
		protected void rangeCheck(int index) {
			if (index < 0 || index >= size) {
				outOfBounds(index);
			}
		}
		
		protected void rangeCheckForAdd(int index) {
			if (index < 0 || index > size) {
				outOfBounds(index);
			}
		}
		
		/**
		 * 添加元素到尾部
		 * @param element*/
		public void add(E element) {
			add(size, element);
		}

		@Override
		public void clear() {
		}

		@Override
		public boolean contains(E element) {
			return false;
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
		}

		@Override
		public E remove(int index) {
			return null;
		}

		@Override
		public int indexOf(E element) {
			return 0;
		}

}
