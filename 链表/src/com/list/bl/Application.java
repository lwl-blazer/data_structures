package com.list.bl;

public class Application {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(90);
		list.add(30);
		System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(20);
		list1.add(30);
		list.add(0, 40);
		System.out.println(list1);
	}
}
