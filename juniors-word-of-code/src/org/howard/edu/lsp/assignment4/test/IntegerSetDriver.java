/**
 * Name: Carleton Williams
 * Date: 3/1/2021
 */
package org.howard.edu.lsp.assignment4.test;

import java.util.ArrayList;
import java.util.List;
import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

public class IntegerSetDriver {

	public static void main(String[] args) throws IntegerSetException {
		//First Test Case Scenario
		//First Integer ArrayList
		List<Integer> intSet = new ArrayList<Integer>();
		IntegerSet intSetObj1 = new IntegerSet(intSet);
		//Add to the list
		intSetObj1.add(1);
		intSetObj1.add(2);
		intSetObj1.add(3);
		intSetObj1.add(4);
		intSetObj1.add(5);
		intSetObj1.add(6);
		//Now show the new list
		System.out.println("Set 1: "+intSetObj1.toString());
		//Now add another 2 from list
		intSetObj1.add(2);
		intSetObj1.add(3);
		intSetObj1.add(4);
		intSetObj1.add(5);
		intSetObj1.add(7);
		//Display Again
		System.out.println("After adding additional element(s) 2, 3, 4, 5, and 7 it should only add the 7: "+intSetObj1.toString());
		//Let's remove all even numbers now
		intSetObj1.remove(2);
		intSetObj1.remove(4);
		intSetObj1.remove(6);
		//Display again
		System.out.println("After removing even numbers from list: "+intSetObj1.toString());
		//Largest of Set
		try {
		System.out.println("Largest integer of the set: "+intSetObj1.largest());
		//Smallest of Set
		System.out.println("Smallest integer of the set: "+intSetObj1.smallest());
		}catch(IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		//Check if the set contains a number
		System.out.println("Does the set: "+intSetObj1.toString()+" contain the number '5': "+intSetObj1.contains(5));
		//Now if it checks to see if the set contains an int that doesn't exist
		System.out.println("How about the number '6'?: "+intSetObj1.contains(6));
		
		//Now make another object
		List <Integer> intSet2 = new ArrayList<Integer>();
		IntegerSet intSetObj2 = new IntegerSet(intSet2);
		intSetObj2.add(3);
		intSetObj2.add(6);
		intSetObj2.add(9);
		intSetObj2.add(12);
		intSetObj2.add(15);
		
		//Display the 2nd set of numbers:
		System.out.println("Set 2: "+intSetObj2.toString());
		System.out.println("Does Set 1 equal Set 2?: "+intSetObj1.equals(intSetObj2));
		System.out.println("Does Set 2 equal Set 1?: "+intSetObj2.equals(intSetObj1));
		//Union
		intSetObj1.union(intSetObj2);
		//Display the union
		System.out.println("The union set of Set 1 and Set 2 is: "+intSetObj1.toString());
		
		//Clear the set
		intSetObj1.clear();
		//Re-add the elements for Set #1
		intSetObj1.add(1);
		intSetObj1.add(2);
		intSetObj1.add(3);
		intSetObj1.add(4);
		intSetObj1.add(5);
		intSetObj1.add(6);
		intSetObj1.add(7);
		System.out.println("Readding all elements of Set 1: "+intSetObj1.toString());
		//Applying the intersect set
		intSetObj1.intersect(intSetObj2);
		//Display the intersect set
		System.out.println("The intersect set of Set 1 and Set 2 is: "+intSetObj1.toString());
		//Clear Set #1 back to default
		intSetObj1.clear();
		intSetObj1.add(1);
		intSetObj1.add(2);
		intSetObj1.add(3);
		intSetObj1.add(4);
		intSetObj1.add(5);
		intSetObj1.add(6);
		//Set Difference
		intSetObj1.diff(intSetObj2);
		System.out.println("The set difference of Set 1 and Set 2 is: "+intSetObj1.toString());
		//Clear Set #1 back to default
		intSetObj1.clear();
		intSetObj1.add(1);
		intSetObj1.add(2);
		intSetObj1.add(3);
		intSetObj1.add(4);
		intSetObj1.add(5);
		intSetObj1.add(6);
		//Set Difference of Set 2 and Set 1
		intSetObj2.diff(intSetObj1);
		System.out.println("The difference of Set 2 and Set 1: "+intSetObj2.toString()+"\n");
		
		//Test Case Scenario #2
		//Empty Set
		List <Integer> intSet3 = new ArrayList<Integer>();
		IntegerSet intSetObj3 = new IntegerSet (intSet3);
		System.out.println("Set 3: "+intSetObj3.toString());
		//Check for the largest int. Should throw an exception
		System.out.print("Check for largest and smallest. Should throw an exception!: ");
		try {
		intSetObj3.largest();
		intSetObj3.smallest();
		} catch(IntegerSetException e) {
			System.out.print(e.getMessage()+"\n");
		}
		//Create set 4
		List<Integer> intSet4 = new ArrayList<Integer>();
		IntegerSet intSetObj4 = new IntegerSet(intSet4);
		//Add numbers to set 4
		intSetObj4.add(-1);
		intSetObj4.add(-2);
		intSetObj4.add(10);
		intSetObj4.add(1);
		intSetObj4.add(4);
		intSetObj4.add(19);
		//Display Set 4
		System.out.println("Set 4: "+intSet4);
		//Find the largest and smallest of Set 4
		try {
			System.out.println("The largest element of Set 4: "+intSetObj4.largest());
			System.out.println("The smallest element of Set 4: "+intSetObj4.smallest());
		}catch(IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		//set equal check
		System.out.println("Does Set 3 equal Set 4?: "+intSetObj3.equals(intSetObj4));
		System.out.println("Doest Set 4 equal Set 3?: "+intSetObj4.equals(intSetObj3));
		//set union
		intSetObj3.union(intSetObj4);
		System.out.println("The union set of Set 3 and Set 4: "+intSetObj3.toString());
		//set difference s3 - s4
		intSetObj3.diff(intSetObj4);
		System.out.println("The difference set of Set 3 and Set 4: "+intSetObj3.toString());
		//set difference S4 - S3
		intSetObj4.diff(intSetObj3);
		System.out.println("The difference set of Set 4 and Set 3: "+intSetObj4.toString());
		//set intersect
		intSetObj3.intersect(intSetObj4);
		System.out.println("The intersect set of Set 3 and Set 4: "+intSetObj3.toString());
		
		//Check if two sets are equal no matter the order
		//Set 5
		List <Integer> intSet5 = new ArrayList<Integer>();
		IntegerSet intSetObj5 = new IntegerSet(intSet5);
		//Set 6
		List <Integer> intSet6 = new ArrayList<Integer>();
		IntegerSet intSetObj6 = new IntegerSet(intSet6);
		//Adding elements for set 5
		intSetObj5.add(5);
		intSetObj5.add(10);
		intSetObj5.add(15);
		intSetObj5.add(20);
		intSetObj5.add(25);
		intSetObj5.add(30);
		intSetObj5.add(35);
		System.out.println("\nSet 5: "+intSet5);
		//Adding element for set 6
		intSetObj6.add(25);
		intSetObj6.add(30);
		intSetObj6.add(35);
		intSetObj6.add(10);
		intSetObj6.add(5);
		intSetObj6.add(20);
		intSetObj6.add(15);
		System.out.println("Set 6: "+intSet6);
		//Are they equal
		System.out.println("Does Set 5 equal Set 6?: "+intSetObj5.equals(intSetObj6));
		System.out.println("Does Set 6 equal Set 5?: "+intSetObj6.equals(intSetObj5));
		
		 
		
	}
}
