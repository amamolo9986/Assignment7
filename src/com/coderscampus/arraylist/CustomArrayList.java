package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	private final int initialCapacity = 10;
	private Object[] originalArray;
	//private Object[] newArray;
	private int size;

	// creating our variables

	public CustomArrayList() {
		originalArray = new Object[initialCapacity];
		size = 0;
	}

	@Override
	public String toString() {
		String something = ""; // we're returning a string so we have to create a string
		for (int i = 0; i < size; i++) {
			something = something + originalArray[i] + ", "; // String = previous + current -> different syntax "something =+" (but we need to truncate) 
		}
		something = something.substring(0, something.length() - 2); // removing the last two characters -> comma and space
		return something;
	}

	@Override
	public boolean add(T item) {
			if (size == originalArray.length) { // if the size of the array equals the initial capacity
				originalArray = Arrays.copyOf(originalArray, originalArray.length * 2); //original the array to be copied, the length of the copy to be returned
			}
		originalArray[size++] = item; // adding new items and incrementing array size
		return true;

	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index >= size || index < 0) {
	        throw new IndexOutOfBoundsException("Index out of bounds: " + size);
	    }
		
		return (T) originalArray[index];
	}

}
