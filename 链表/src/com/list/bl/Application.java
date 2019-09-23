package com.list.bl;

public class Application {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(90);
		list.add(30);
		list.add(0, 100);

		System.out.println(list.set(2, 40));
		System.out.println(list);
		list.remove(0);
		list.add(0, 100);
		list.add(0, 200);
		System.out.println(list);
		
		System.out.println(list.indexOf(40));

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(20);
		list1.add(30);
		list.add(0, 40);
		System.out.println(list1);
	}
}
