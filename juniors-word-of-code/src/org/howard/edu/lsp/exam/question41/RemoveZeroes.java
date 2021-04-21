package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

public class RemoveZeroes {
	
	/**This method will purge the incoming list of integers of zeroes and
	 * will return to the called point. 
	 * @param intList list of integers that will be purged of zeroes
	 * @return the new purged list of integers
	 */
	public ArrayList<Integer> removeZeroes(ArrayList<Integer> intList){
		for(int i = 0; i < intList.size();i++) {
			if(intList.get(i) == 0) {
				intList.remove(i);
				i = -1;
			}
		}
		return intList;
	}
}
