package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	private static final int GROWTH_FACTOR = 2;

	private void resizeArray() {
		items = Arrays.copyOf(items, items.length * GROWTH_FACTOR);
	}

//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < size; i++) {
//			sb.append(items[i]);
//			if (i != size - 1) {
//				sb.append(", ");
//				// StringBuilder is appending each element and separating
//				// using a delimiter if the item is not the last item.
//			}
//		}
//		return sb.toString();
//	}
//	// only necessary if we need to print objects	

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			resizeArray();
		}
		items[size++] = item;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index out of bounds: " + index);
		}

		return (T) items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {

		if (size == items.length) {
			resizeArray();
		}
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index out of bounds: " + index);
		}

		for (int i = size - 1; i >= index; i--) {
			items[i + 1] = items[i];
		}

		items[index] = item;
		size++;
		return true;

	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {

		if (index < 0 || index > getSize()) {
			throw new IndexOutOfBoundsException("Index out of bounds: " + index);
		}

		T item = get(index);
		for (int i = index; i < getSize() - 1; i++) {
			items[i] = items[i + 1];
		}
		size--;
		return item;

	}

}
