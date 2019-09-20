package com.list.bl;

@SuppressWarnings("unchecked")
public class ArrayList<E> extends AbstractList<E> {
	
	private E[] elements;
	
	private static final int DEFAULT_CAPACITY = 10;
	
	
	/**
	 * 构造函数*/
	public ArrayList(int capaticy) {
		capaticy = (capaticy < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capaticy;
		elements = (E[]) new Object[capaticy];
	}
	
	/**
	 * 构造函数*/
	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}
	
	/**
	 * 清除所有元素*/
	public void clear() {
		for (int i = 0; i < size; i ++) {
			elements[i] = null;
		}
		size = 0;
	}
	
	/**
	 * 是否包含某个元素
	 * @param element
	 * @return*/
	public boolean contains(E element) {
		return indexOf(element) != ELEMENT_NOT_FOUND;
	}
	
	/**
	 * 添加元素到尾部
	 * @param element*/
	public void add(E element) {
		add(size, element);
	}
	
	/**
	 * 获取index位置的元素
	 * @param index
	 * @return*/
	public E get(int index) {
		rangeCheck(index);
		return elements[index];
	}
	
	/**
	 * 设置index位置的元素
	 * @param index
	 * @param element
	 * @return 原来的元素*/
	public E set(int index, E element) {
		rangeCheck(index);
		E old = elements[index];
		elements[index] = element;
		return old;
	}
	
	/**
	 * 在index位置插入一个元素
	 * @param index
	 * @param element*/
	public void add(int index, E element) {
		rangeCheckForAdd(index);
		ensureCapacity(size + 1);
		
		for (int i = size; i > index; i--) {
			elements[i+1] = elements[i];
		}
		elements[index] = element;
		size ++;
	}
	
	/**
	 * 删除index位置的元素
	 * @param index
	 * @return */
	public E remove(int index) {
		rangeCheck(index);
		E old = elements[index];
		for (int i = index; i < size; i ++) {
			elements[i] = elements[i+1];
		}
		elements[size--] = null;
		return old;
	}
	
	/**查看元素的索引
	 * @param element
	 * @return */
	public int indexOf(E element) {
		if (element == null) {
			for (int i = 0; i < size; i++) {
				if (elements[i] == null) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < size; i++) {
				if (element.equals(elements[i])) {
					return i;
				}
			}
		}
		return ELEMENT_NOT_FOUND;
	}
	
	/**
	 * 保证要有capacity的容量
	 * @param capacity*/
	private void ensureCapacity(int capacity) {
		int oldCapacity = elements.length;
		if (oldCapacity >= capacity) {
			return;
		}
		//新容量为旧容量的1.5
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		E[] newElements = (E[]) new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newElements[i] = elements[i];
		}
		elements = newElements;
		System.out.println(oldCapacity + "扩容为" + newCapacity);
	}
	
	
	
	@Override
	public String toString() {
		StringBuffer string = new StringBuffer();
		string.append("size=").append(size).append(",[");
		for (int i = 0; i < size; i ++) {
			if (i != 0) {
				string.append(", ");
			}
			string.append(elements[i]);
		}
		string.append("]");
		return string.toString();
	}
}
