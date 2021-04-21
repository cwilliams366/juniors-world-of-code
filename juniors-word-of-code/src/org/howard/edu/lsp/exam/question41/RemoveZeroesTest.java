package org.howard.edu.lsp.exam.question41;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RemoveZeroesTest {
   ArrayList<Integer> intList;
   RemoveZeroes rmZero;
   
	@BeforeEach
	void setUp() {
		rmZero = new RemoveZeroes();
		intList = new ArrayList<Integer>();
	}
	
	@Test
	@DisplayName("Test for the removeZeroes method")
	void testRemoveZeroes() {
		//Temp ArrayList
		ArrayList<Integer> temp =  new ArrayList<Integer>();
		//Test 1
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(0);
		intList.add(3);
		intList.add(0);
		intList.add(5);
		intList.add(0);
		intList.add(4);
		intList.add(0);
		temp.add(1);
		temp.add(2);
		temp.add(3);
		temp.add(4);
		temp.add(5);
		temp.add(3);
		temp.add(5);
		temp.add(4);
		rmZero.removeZeroes(intList);
		assertEquals(temp,intList);
		//Test 2
		intList.clear();
		temp.clear();
		intList.add(0);
		intList.add(0);
		intList.add(0);
		intList.add(0);
		intList.add(0);
		intList.add(0);
		intList.add(0);
		intList.add(1);
		temp.add(1);
		rmZero.removeZeroes(intList);
		assertEquals(temp,intList);
		//Test 3
		intList.clear();
		temp.clear();
		intList.add(0);
		intList.add(7);
		intList.add(2);
		intList.add(0);
		intList.add(0);
		intList.add(4);
		intList.add(0);
		temp.add(7);
		temp.add(2);
		temp.add(4);
		rmZero.removeZeroes(intList);
		assertEquals(temp,intList);
	}

}
