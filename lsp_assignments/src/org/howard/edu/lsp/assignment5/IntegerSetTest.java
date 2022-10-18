package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThrows;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class IntegerSetTest {
	@Test
	@DisplayName("add")
	public void TestAdd() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		assertEquals("[1, 2, 3]",setA.toString());
		assertNotEquals("[]", setA.toString());
		assertNotEquals("[1,2]", setA.toString());			
	}
	

	@Test
	@DisplayName("Test case for Remove")
	public void TestRemove() throws org.howard.edu.lsp.assignment4.IntegerSetException, IntegerSetException {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {10, 20, 30, 40, 50};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		setA.remove(10);
		setA.remove(50);
		assertEquals("[20, 30, 40]",setA.toString());
		assertNotEquals("[]", setA.toString());
		assertNotEquals("[30, 20, 40]", setA.toString());

		IntegerSet setB = new IntegerSet();
		int[] numbers_1 = {90, 60, 80, 12, 34};
		for (int i = 0; i < numbers_1.length; i ++) {
			setB.add(numbers_1[i]);
		}
		
		setB.remove(90);
		setB.remove(50);
		assertEquals(false, setB.contains(90));
		assertEquals(true, setB.contains(60));
		assertNotEquals("[]", setB.toString());
	}


	@Test
	@DisplayName("test case for testRemove throws exception")
	public void testRemove_THROWS_EXCEPTION() {
		IntegerSet setA = new IntegerSet();
		IntegerSetException exception = assertThrows(IntegerSetException.class, ()->{
			setA.remove(50);
		});
		String expectedMessage = "Can't remove from an empty set";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.equals(expectedMessage));
	}
	
	
	@Test
	@DisplayName("Test Contains")
	public void TestContains() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		assertEquals(true,setA.contains(4));
		assertEquals(false,setA.contains(100));
		assertEquals(true,setA.contains(2));
		assertNotEquals(true,setA.contains(-10));
		assertNotEquals(true,setA.contains(509));
	}
	
	@Test
	@DisplayName("Test isEmpty")
	public void TestEmpty() {
		IntegerSet setA= new IntegerSet();
		assertEquals(true, setA.isEmpty());
		assertNotEquals(false,setA.isEmpty());
	}
	
	@Test
	@DisplayName("Test toString")
	public void testToString() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
			}
	
	assertEquals("[1, 2, 3, 4, 5]",setA.toString());
	assertNotEquals("12345",setA.toString());
	assertNotEquals("[1,9,111]",setA.toString());
	
	}

	
	@Test
	@DisplayName("Test Union")
	public void testUnion() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1, 2, 3, 4, 5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1, 3, 5, 7, 9};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		
		setA.union(setB);
		assertEquals("[1, 2, 3, 4, 5, 7, 9]",setA.toString());
		assertNotEquals("[1, 3, 5]",setA.toString());
		}
	
	@Test
	@DisplayName("Test Intersect")
	public void testIntersect() {
		IntegerSet setA = new IntegerSet();
		int[] numbers = {1, 2, 3, 4, 5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
	
		IntegerSet setB = new IntegerSet();
		int[] numbers1 = {1, 2, 3, 4};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
	
		setA.intersect(setB);
		assertEquals("[1, 2, 3, 4]", setA.toString());
		assertNotEquals("[1, 2, 3, 4, 5, 6]", setA.toString());
	}


	@Test
	@DisplayName("Test Difference")
	public void testDifference() {
	 
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {5, 6, 7};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		
		setA.diff(setB);
		assertEquals("[1, 2, 3, 4]",setA.toString());
		assertNotEquals("[1, 3, 5,7]", setA.toString());
	}

	
	@Test
	@DisplayName("Test Equals")
	public void testEquals() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,40};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,2,3,40};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		
		assertEquals(setA.toString(),setB.toString());
	}


	@Test
	@DisplayName("Test Largest")
	public void testLargest() throws IntegerSetException {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1, 2, 3, 4, 5, 500, 1000};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,2,3,4,500,700};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		
		assertEquals(1000,setA.largest());
		assertEquals(700,setB.largest());
		}

	
	@Test
	@DisplayName("Test case for Smallest")
	public void testSmallest() throws IntegerSetException {
	IntegerSet setA= new IntegerSet();
	int[] numbers = {18, 22, 33, 54, 35, 50, 1000};
	for (int i = 0; i < numbers.length; i ++) {
		setA.add(numbers[i]);
	}
	IntegerSet setB= new IntegerSet();
	int[] numbers1 = {98, 32, 23, 44, 500,1000};
	for (int i = 0; i < numbers1.length; i ++) {
		setB.add(numbers1[i]);
	}
	assertEquals(18,setA.smallest());
	assertEquals(23,setB.smallest());
	}

	@Test
	@DisplayName("Test case for smallest throws exception")
	public void testSmallest_THROWS_EXCEPTION() {
		IntegerSet setA = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, ()->{
			setA.smallest();
		});
		String expectedMessage = "An empty set can't have smallest element!";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.equals(expectedMessage));
	}
	
	
	@Test
	@DisplayName("Test case for Largest throws exception")
	public void testLargest_THROWS_EXCEPTION() {
		IntegerSet setA = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, ()->{
			setA.largest();
		});
		String expectedMessage = "An empty set can't have largest element!";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.equals(expectedMessage));
	}
}
