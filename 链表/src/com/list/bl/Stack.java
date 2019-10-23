package com.list.bl;


/**
 * @author luowailin
 *
 * 栈 ----- 先进后出/后进先出   
 * 
 * 区别于 先进先出FIFO  队列
 */
public class Stack<E> {
	private ArrayList<E> lists = new ArrayList<>();
	
	//元素的数量
	public int size() {
		return lists.size;
	}
	
	//是否为空
	public boolean isEmpty() {
		return lists.isEmpty();
	}
	
	//压栈
	public void push(E element) {
		lists.add(element);
	}
	
	//出栈
	public E pop() {
		return lists.remove(lists.size - 1);
	}
	
	//获取栈顶元素
	public E top() {
		return lists.get(lists.size - 1);
	}
 
	//清空
	public void clear() {
		lists.clear();
	}
}
