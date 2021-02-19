/*Name: Carleton Williams
 * Date: 2/3/2021
 * 
 */
  package org.howard.edu.lsp.assignment2.combination;

  import java.util.ArrayList;
  import java.util.Arrays;

  public class Combination {
	private int numArr[], targetNum;
	
	//Class Variable to hold all possible 2^n Subsets for the given sum from the given array
	private ArrayList <ArrayList<Integer>> listOfSubsets = new ArrayList<>();
	
	//Constuctor for CombinationDriver
	/**
	 * @param numArr holds the given array set of elements
	 * @param targetNum holds the target sum 
	 * 
	 */
	public Combination(int numArr[], int targetNum){
		this.numArr = numArr;
		this.targetNum = targetNum;
	}
	
  /**Method calculates and distributes all possible subsets of the target sum
   * based on the given array. Takes no arguments. 
   * 
   */
    public void combinationSumCalculation() {
	  
	  //Holds the Indices of the 2^n possible combination subsets
	  ArrayList<ArrayList<Integer>> subsetIndices = new ArrayList<>();
	  
	  /*Applying that fact that the number of subsets of a set
	  is 2^n (n being the number of elements within the set (array),
	  */ 
	  for(int i = 0; i < Math.pow(2, numArr.length); i++) {
		  //Create an ArrayList that will be used to hold a possible
		  //set each all
		  ArrayList <Integer> tempSubsetHolder = new ArrayList<>();
		  
		  //Create an array list to hold the indexes of each 
		  ArrayList <Integer> tempSubsetIndexHolder = new ArrayList<>();
		  
		  //Now we use a bit manipulator technique to find all possible subsets
		  // of the given array. By using the '&' 'And' and the '<<' 'shift left' operators,
		  //we take the all subsets that don't have a 0 as bit and exclude them from
		  // the ones that do. All subsets that do have a 1 bit will be taken into to be
		  //added into the subset. 
		  for(int x  = 0; x < numArr.length;x++) {	  
			  
			  //We use this equation to add in the elements within the subset 2^n times.
			  //If the i & (1 left shift of x bits) is not equal to zero. 
			  //Add the element into the current subset. 
			  //else enter an empty subset
			  if((i & (1 << x)) != 0) {
				  tempSubsetHolder.add(numArr[x]);
				  tempSubsetIndexHolder.add(x);
			  }
		  }
		  //Add all 2^n possible sets
		  listOfSubsets.add(tempSubsetHolder);
		  //Add all the sets' respective indices
		  subsetIndices.add(tempSubsetIndexHolder);
	  }
	  
	 
	  //Finally, display the subsets and their respective indices 
	  for(int x = 0; x < listOfSubsets.size();x++) {  
		  //An easier way to calculate the sum of all subsets(indices of arrylist) within the arraylist
		  Integer subsetSum = listOfSubsets.get(x).stream().mapToInt(Integer::intValue).sum();
		  //if the sum of the subsets equal the target number
		  if(subsetSum == targetNum) {
			  System.out.print(subsetIndices.get(x)+"-> ");
			  System.out.println(listOfSubsets.get(x));
		 } else if(listOfSubsets.get(x).isEmpty() && x == listOfSubsets.size()-1) {
			 System.out.println("Array is empty");
		 }
	 }
	     System.out.println();
  } 

  /*Displays contents of the original array
   * */
   public void displayArray() {
	//Display array
	  System.out.print("Input: [");
	  for(int i = 0; i < numArr.length;i++) {
		  System.out.print(numArr[i]);
		  if(i == numArr.length-1) {
			  System.out.println("]");
			  break;
		  }
		  System.out.print(",");
	  }
	  
	  System.out.println("Target Sum: "+targetNum);
   }
}
