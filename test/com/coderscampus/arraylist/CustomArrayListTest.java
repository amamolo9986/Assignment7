package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_item_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();

		sut.add(5);
		int expectedResult = sut.get(0);

		assertEquals(5, expectedResult);
	}

	@Test
	void should_add_40_items_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 1; i <= 40; i++) {
			sut.add(i);
		}

		assertEquals(40, sut.getSize());
	}

	// --------------------------------- //
	@Test
	void should_get_size_of_list() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 1; i <= 5; i++) {
			sut.add(i);
		}
		int size = sut.getSize();

		assertEquals(5, size);
	}

	// --------------------------------- //
	@Test
	void should_get_item_at_specified_index() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 1; i <= 5; i++) {
			sut.add(i);
		}
		int index = sut.get(3);

		assertEquals(4, index);
	}

	@Test
	void should_get_first_item() {
		CustomList<String> sut = new CustomArrayList<>();

		sut.add("First");
		sut.add("Second");

		String item = sut.get(0);

		assertEquals("First", item);
	}

	@Test
	void should_get_last_item() {
		CustomList<String> sut = new CustomArrayList<>();

		sut.add("First");
		sut.add("Second");
		sut.add("Third");

		String item = sut.get(sut.getSize() - 1);

		assertEquals("Third", item);
	}

	// --------------------------------- //
	@Test
	void should_add_item_at_specified_index() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 1; i <= 5; i++) {
			sut.add(i);
		}

		sut.add(4, 100);

		assertEquals(100, sut.get(4));
		assertEquals(6, sut.getSize());
	}

	@Test
	void should_add_item_at_index_zero() {
		CustomList<String> sut = new CustomArrayList<>();

		sut.add("World");
		sut.add(0, "Hello");

		assertEquals("Hello", sut.get(0));
		assertEquals("World", sut.get(1));
		assertEquals(2, sut.getSize());
	}

	@Test
	void should_add_item_at_last_index() {
		CustomList<String> sut = new CustomArrayList<>();

		sut.add("Hello");
		sut.add(sut.getSize(), "World");

		assertEquals("Hello", sut.get(0));
		assertEquals("World", sut.get(1));
		assertEquals(2, sut.getSize());
	}

	// --------------------------------- //
	@Test
	void should_remove_item_from_list() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 1; i <= 5; i++) {
			sut.add(i);
		}
		int remove = sut.remove(0);

		assertEquals(1, remove);
		assertEquals(4, sut.getSize());
	}
	
	@Test
	void should_remove_item_in_middle_of_list() {
	    CustomList<String> sut = new CustomArrayList<>();
	    
	    sut.add("First");
	    sut.add("Second");
	    sut.add("Third");
	    sut.add("Fourth");

	    String removedItem = sut.remove(1);

	    assertEquals("First", sut.get(0));
	    assertEquals("Third", sut.get(1));
	    assertEquals("Fourth", sut.get(2));
	    assertEquals("Second", removedItem);
	    assertEquals(3, sut.getSize());
	}

}