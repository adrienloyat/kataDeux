package fr.loyat.katadeux;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;




public class Iteration3TestCase extends SuperTest {

	Iteration3 kata = new Iteration3();

	int chop(int searched_int, int[] tab) {
		return kata.chop(searched_int, tab);
	}

	
	@Test
	public void test() {
	
		
		assertEquals(-1, chop(3, new int[] {}));
		assertEquals(-1, chop(3, new int[] { 1 }));
		assertEquals(0, chop(1, new int[] { 1 }));
		assertEquals(0, chop(1, new int[] { 1, 3, 5 }));
		assertEquals(1, chop(3, new int[] { 1, 3, 5 }));
		assertEquals(2, chop(5, new int[] { 1, 3, 5 }));
		assertEquals(-1, chop(0, new int[] { 1, 3, 5 }));
		assertEquals(-1, chop(2, new int[] { 1, 3, 5 }));
		assertEquals(-1, chop(4, new int[] { 1, 3, 5 }));
		assertEquals(-1, chop(6, new int[] { 1, 3, 5 }));
		assertEquals(0, chop(1, new int[] { 1, 3, 5, 7 }));
		assertEquals(1, chop(3, new int[] { 1, 3, 5, 7 }));
		assertEquals(2, chop(5, new int[] { 1, 3, 5, 7 }));
		assertEquals(3, chop(7, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop(0, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop(2, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop(4, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop(6, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, chop(8, new int[] { 1, 3, 5, 7 }));
		assertEquals(500000, chop(500000, grosseTable));
		assertEquals(-1, chop(50000000, grosseTable));
		assertEquals(500000, chop(500000, grosseTable));
		assertEquals(-1, chop(50000000, grosseTable));
		assertEquals(600000, chop(600000, grosseTable));
		assertEquals(-1, chop(50000000, grosseTable));
		assertEquals(1999999, chop(1999999, grosseTable));
	}

}
