package com.coderscampus.arraylist;

public class ArrayTestApplication {

	public static void main(String[] args) {

		CustomList<Integer> myCustomList = new CustomArrayList<>();

		for (int i = 1; i <= 39; i++) {
			myCustomList.add(i);
		}

		myCustomList.add(40);
		myCustomList.add(41);

		System.out.println("This is myCustomList: " + myCustomList);
		System.out.println();

		System.out.println("There are " + myCustomList.getSize() + " elements in myCustomList");
		System.out.println();

		System.out.println("The element in this index is: " + myCustomList.get(9));
		System.out.println();

		System.out.println(myCustomList.get(45));

	}
}
