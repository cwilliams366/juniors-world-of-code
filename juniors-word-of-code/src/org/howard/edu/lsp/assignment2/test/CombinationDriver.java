/*Name: Carleton Williams
 * Date: 2/3/2021
 * 
 */
package org.howard.edu.lsp.assignment2.test;


import org.howard.edu.lsp.assignment2.combination.Combination;

public class CombinationDriver {

	public static void main(String[] args) {
		System.out.println("Indices|Subsets");
		
		//Test Case: 1
	    int numArr1 [] = {1,2,3,4,5};
	    Combination combo1 = new Combination(numArr1,5);
	    combo1.displayArray();
		combo1.combinationSumCalculation();
		
		//Test Case: 2
		int numArr2 [] = {2,4,6,8,10};
		Combination combo2 = new Combination(numArr2,6);
		combo2.displayArray();
		combo2.combinationSumCalculation();
		
		//Test Case: 3
		int numArr3 [] = {2,4,8,16,32,62,128,256};
		Combination combo3 = new Combination(numArr3,62);
		combo3.displayArray();
		combo3.combinationSumCalculation();
		
		//Test Case: 4
		int numArr4 [] = {5,10,15,20,25,30,35,40,45,50};
		Combination combo4 = new Combination(numArr4,40);
		combo4.displayArray();
	    combo4.combinationSumCalculation();
		
	    //Test Case: 5
		int numArr5 [] = {1,1,3,3,5,12,10,15,4};
		Combination combo5 = new Combination(numArr5,12);
		combo5.displayArray();
	    combo5.combinationSumCalculation();
		
	    //Test Case: 6
		int numArr6 [] = {100,200,300,400,500,600};
		Combination combo6 = new Combination(numArr6,500);
		combo6.displayArray();
	    combo6.combinationSumCalculation();
		
	    //Test Case: 7
		int numArr7 [] = {10,7,3,9,1,27,30,4,5,1};
		Combination combo7 = new Combination(numArr7,30);
		combo7.displayArray();
	    combo7.combinationSumCalculation();
	
	    //Test Case: 8
		int numArr8 [] = {1,2,3,4,5,6};
		Combination combo8 = new Combination(numArr8,6);
		combo8.displayArray();
	    combo8.combinationSumCalculation();
	
	    //Test Case: 9
		int numArr9 [] = {5,5,15,10};
		Combination combo9 = new Combination(numArr9,15);
		combo9.displayArray();
		combo9.combinationSumCalculation();
		
		//Test Case: 10
		int numArr10 [] = {};
		Combination combo10 = new Combination(numArr10,15);
		combo10.displayArray();
		combo10.combinationSumCalculation();

	}

}
