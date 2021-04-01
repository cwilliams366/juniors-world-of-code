/**
 * Name: Carleton Williams II
 * Date: 3/29/2021
 */
package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {

	private IntegerSet intSet, intSet2, intSet3;
	private List <Integer> intArr, intArr2, intArr3;
	
	@BeforeEach
	public void setUp() throws Exception {
	   //Fist List Object
	   intArr = new ArrayList<Integer>();
	   intSet = new IntegerSet(intArr);
	    //Add numbers to object list
	    intSet.add(1);
		intSet.add(2);
		intSet.add(3);
		intSet.add(4);
		intSet.add(5);
		intSet.add(6);
		intSet.add(7);
		intSet.add(8);
		intSet.add(9);
		intSet.add(10);
		intSet.add(-10); 	    	    
	  //Second List Object
      intArr2 = Arrays.asList(2,4,6,8,10,12,-10,-8,-6,-4,-2,0);
	  intSet2 = new IntegerSet(intArr2);
	  //Third List Object
	  intArr3 = new ArrayList<Integer>();
	  intSet3 = new IntegerSet(intArr3);	
	}
	
    @Test
	@DisplayName("Test cases for the add method")
	public void testAdd() {
    	//Make temp array
    	List <Integer> temp = Arrays.asList(1,2,3,4,5,6,7,8,9,10,-10);
		//Checks if object's list and temporary list is the same
		assertEquals(temp,intArr);
	}
	
    
	@Test
	@DisplayName("Test cases for smallest method")
	public void testSmallest() throws IntegerSetException {
		//Check for the smallest of the list
		assertEquals(-10,intSet.smallest());
		assertEquals(-10,intSet2.smallest());
	}
	
	         @Test
			@DisplayName("Test cases for the largest method")
			public void testLargest() throws IntegerSetException {
	        	//Check for the largest
				assertEquals(10,intSet.largest());
				assertEquals(12, intSet2.largest());
			}
			
	
	 @Test
     @DisplayName("Test cases for equals method")
     public void testEquals() {
		//Make temp object
	    List <Integer> temp = Arrays.asList(1,2,3,4,5,6,7,8,9,10,-10);
	    IntegerSet intSet2 = new IntegerSet(temp);
		//Checks if object's list and temporary list is the same
	    assertEquals(true,intSet.equals(intSet2));
	    assertEquals(false,intSet.equals(intSet3));
	 }
	    
	    
	    @Test
		@DisplayName("Test cases for the contains method")
		public void testContains() {
			assertEquals(true,intSet.contains(2));
			assertEquals(false,intSet.contains(-100));
		}
		
	    
	    @Test
		@DisplayName("Test cases for the union method")
		public void testUnion() {
			List <Integer> temp = Arrays.asList(1,2,3,4,5,6,7,8,9,10,-10,12,-8,-6,-4,-2,0);
			intSet.union(intSet2);
			assertEquals(temp,intArr);
		}
	    
	    @Test
	    @DisplayName("Test cases for the difference method")
	    public void testDifference() {
	    	//Make a temporary array
	    	List <Integer>temp = Arrays.asList(1,3,5,7,9);
	    	intSet.diff(intSet2);
	    	assertEquals(temp,intArr);
	    	//Empty the temp list
	    	List <Integer>temp1 = Arrays.asList();
	    	intSet3.diff(intSet);
	    	assertEquals(temp1,intArr3);
	    }
	    
	    @Test
	    @DisplayName("Test cases for the intersect method")
	    public void testIntersect() {
	    	//Make temporary array
	    	 List <Integer> temp = Arrays.asList(2,4,6,8,10,-10);
	    	 intSet.intersect(intSet2);
	    	 assertEquals(temp,intArr);
	    	 //Empty List Check
	    	 List <Integer> temp1 = new ArrayList <Integer>();
	    	 intSet3.intersect(intSet);
	    	 assertEquals(temp1,intArr3);
	    }
	    
	    @Test
	    @DisplayName("Test cases for the remove method")
	    public void testRemove() {
	    	//Make a temporary list
	    	List <Integer> temp = Arrays.asList(1,3,5,7,9);
	    	//Remove all even numbers from first array
	    	intSet.remove(2);
	    	intSet.remove(4);
	    	intSet.remove(6);
	    	intSet.remove(8);
	    	intSet.remove(10);
	    	intSet.remove(-10);
	    	//Check
	    	assertEquals(temp,intArr);
	    	
	    	
	    }
		
	    @Test
		@DisplayName("Test cases for the length method")
		public void testLength() {
			assertEquals(0,intSet3.length());
			assertEquals(11,intSet.length());
			assertEquals(12,intSet2.length());
		}
	   
	    @Test
		@DisplayName("Test cases for the smallest method")
		public void testClear() {
			intSet.clear();
			intSet2.clear();
			intSet3.clear();
			assertEquals(0,intSet.length());
			assertEquals(0,intSet2.length());
			assertEquals(0,intSet3.length());
		}
		
		@Test
		@DisplayName("Test cases for the isEmpty method")
		public void testIsEmpty() {
			//Check if first object list is empty
			intSet.clear();
			assertEquals(true,intSet.isEmpty());
			//Check if second object list is empty
			assertEquals(false,intSet2.isEmpty());
			
		}
}
