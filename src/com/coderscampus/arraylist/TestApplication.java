package com.coderscampus.arraylist;

public class TestApplication {
	public static void main(String[] args) {

		CustomList<Integer> myArray = new CustomArrayList<>();

		for (int i = 1; i <= 10; i++) {
			myArray.add(i);
		}

		System.out.println("Before removal: " + myArray);
		System.out.println();

		int removedItem = myArray.remove(1);
		System.out.println("Removed item: " + removedItem);
		System.out.println("After removal: " + myArray);
	}
}
//Just used this to test the remove method that remove method 