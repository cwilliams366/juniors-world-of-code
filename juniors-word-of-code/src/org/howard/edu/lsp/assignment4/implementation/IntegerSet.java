/**
 * Name: Carleton Williams
 * Date: 3/1/2021
 */
package org.howard.edu.lsp.assignment4.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();
	
	/*A constructor to take in a set of elements
	@param set takes in a set of integer elements
	*/
	public IntegerSet(List<Integer> set) {
		this.set = set;
	}

	/*Clears the current class's set of elements*/
    public void clear() {
    List<Integer> tempList = new ArrayList<Integer>();
    set = tempList;
    };

    /*Returns the size of the set*/
    public int length() {
    	return set.size();
    }; // returns the length

     /*
      * Returns true if the 2 sets are equal, false otherwise;
      * Two sets are equal if they contain all of the same values in ANY order.
      @param Another class object to be used to compare its set with the current class's set
     */
    public boolean equals(IntegerSet b) {
    	//Determines the amount of similar elements within both sets
    	int sentinel = 0;
    	//If both sets are not equal of length
    	if(length() != b.length()) {
    		return false;
    	}
    	
    	for(int i = 0; i < length(); i++) {
    		if(contains(b.set.get(i))) {
    			sentinel++;
    		}
    	}
    	
    	//If the amount of correct elements within both
    	//sets are equal to the amount of elements.
    	//return true
    	if(sentinel== length()) {
    		return true;
    	}
    	
    	return false;
    }; 

    /**Searches the current class's set for a specified element
     * 
     * @param value specified element to be found in current class's set
     * @return true if the element was found, false otherwise
     */
    public boolean contains(int value) {
    	for(int i = 0; i < set.size(); i++) {
    		if(set.get(i) == value) {
    			return true;
    		}
    	}
    	return false;
    };    

   /**Searches the current class's set for largest integer element
    * 
    * @return the largest integer element of current class's set
    * @throws IntegerSetException if set is empty
    */
    public int largest() throws IntegerSetException { 	
    	//Check to see if the set is empty
    	if(isEmpty()) {
    		//throws exception if set it empty
    		throw new IntegerSetException("!!Error! Set is empty!!");
    	}
    	//Check for largest integer element
      int largest = set.get(0);
    	for(int i = 1; i < set.size();i++) {
    		if(largest < set.get(i)) {
    			largest = set.get(i);
    		}
    	}
    	return largest;
    }; 

   /**Checks set for the smallest integer element
    * @return the smallest element within current class's set
    * @throws IntegerSetException if the set is empty
    */
    public int smallest() throws IntegerSetException {
    	//Check to see if the set is empty
    	int smallest = set.get(0);
    	if(isEmpty()) {
    		//Exception will throw if set is empty
    		throw new IntegerSetException("!!!Error! Set is empty!!!!!");
    	}
    	//Find the smallest element
    	for(int i = 1; i < set.size();i++) {
    		if(smallest > set.get(i)) {
    			smallest = set.get(i);    	
    		}
    	}
    	return smallest;
    };

    /**
     * Adds an element to the current class's set
     * @param item element to be added within the current class's set
     */
 	public void add(int item) {
 		//sentinel for value found confirmation
 		boolean isInSet= false;
 		//Check to see if the element is within set
 		for(int i = 0; i < set.size(); i++) {
 			if(contains(item)) {
 				isInSet = true;
 				break;
 			} 
 		}
 		//if sentinel is false add the item
 		if(!isInSet) {
 			set.add(item);
 		}
 	}; 

	/** Removes a specified element from the current class's set
	 * @param item the element to be removed from current class's set
	 */
    public void remove(int item) {
     //Make a temporary list
      List<Integer> tempList = new ArrayList <Integer>();
      //Copy the current set list to the temporary
      tempList = set;
      //Clear the current set
      clear();
    	//Add the new numbers that aren't the specified item
      for(int i = 0; i < tempList.size();i++) {
    		if(tempList.get(i) == item) {
    			continue;
    		}
    		add(tempList.get(i));
    	}
    }; 

    /** Creates a union set between the current class's and the object argument's
     * sets
     * @param intSetb Class object used to find the union set 
     */
    public void union(IntegerSet intSetb) {
    	//Temporary ArrayList
    	List <Integer> bSet = new ArrayList<Integer>();
    	//Assign the temp ArrayList
    	bSet = intSetb.set;
    	
    	for(int i = 0; i < bSet.size();i++) {
    		if(contains(bSet.get(i))) {
    			continue;
    		}else {
    			add(bSet.get(i));
    		}
    	}
    }

  /**Creates an intersection set between the current class's and object argument
   * sets
   * @param intSetb = Class object used to find the intersect set
   */
    public void intersect(IntegerSet intSetb) {
		 //Traverse through the set #1 and check if any elements of set #1
    	// are contained within set #2. If so, skip, if not take the element out
    	//of set#1
		 for(int i = 0; i < set.size();i++) {
			 //If set #2 does not have an element of set #1, remove the element
			 //from set #1.
			 if(!intSetb.contains(set.get(i))) {
				 remove(set.get(i));
				 //Restart the index to -1 which will then increment back to 0
				 i = -1;
			 }
		 }
  }

    /**Creates the difference set between the current class's set and
     * the object argument's set s1 - s2
     * 
     * @param intSetb = A different class object to find the difference set
     */
    public void diff(IntegerSet intSetb) {
		 for(int i = 0; i < set.size();i++) {
		 //If set #2 does have an element of set #1, remove the element
		 //from set #1.
		 if(intSetb.contains(set.get(i))) {
			remove(set.get(i));
		  //Restart the index to -1 which will increment back to 0
		  i = -1;
	   }
	}
  }

   /** Checks if the set is empty
    * 
    * @return true if the set is empty, false otherwise
    */
   boolean isEmpty() {
		 if(length() == 0) {
			return true;
		 }
	 return false;
 }; 

   /*String representation of the set
    * 
    * */
   public String toString() {
	   //Sort the set
	   Collections.sort(set);
	   //Create a string to hold the first bracket
	  String stringRep = "[";
	  //One by one, add the elements of the set, including a comma to the string variable
	  for(int i = 0; i < set.size();i++) {
		  stringRep += set.get(i);
		 //if it isn't the last index add a comma
		  if(i != set.size()-1) {
			  stringRep += ",";
			  //if it is add the end bracelet
		  } 
	  }
	  stringRep += "]";
	  return stringRep;
  };
}

