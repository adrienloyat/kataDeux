package fr.loyat.katadeux;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Iteration1TestCase {

	Iteration1 kata = new Iteration1();

	private int chop(int searched_int, Integer[] tab) {
		return kata.chop(searched_int, tab);
	}

	@Test
	public void test() {
 
		assertEquals(-1, chop(3, new Integer[] {}));
		assertEquals(-1, chop(3, new Integer[] { 1 }));
		assertEquals(0, chop(1, new Integer[] { 1 }));
		assertEquals(0, chop(1, new Integer[] { 1, 3, 5 }));
		assertEquals(1, chop(3, new Integer[] { 1, 3, 5 }));
		assertEquals(2, chop(5, new Integer[] { 1, 3, 5 }));
		assertEquals(-1, chop(0, new Integer[] { 1, 3, 5 }));
		assertEquals(-1, chop(2, new Integer[] { 1, 3, 5 }));
		assertEquals(-1, chop(4, new Integer[] { 1, 3, 5 }));
		assertEquals(-1, chop(6, new Integer[] { 1, 3, 5 }));
		assertEquals(0, chop(1, new Integer[] { 1, 3, 5, 7 }));
		assertEquals(1, chop(3, new Integer[] { 1, 3, 5, 7 }));
		assertEquals(2, chop(5, new Integer[] { 1, 3, 5, 7 }));
		assertEquals(3, chop(7, new Integer[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop(0, new Integer[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop(2, new Integer[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop(4, new Integer[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop(6, new Integer[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop(8, new Integer[] { 1, 3, 5, 7 }));
	}

}
