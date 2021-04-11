package org.howard.edu.lsp.assignment7.junit;

import org.howard.edu.lsp.assignment7.tollbooth.CheverletColorado;
import org.howard.edu.lsp.assignment7.tollbooth.DistrictTollbooth;
import org.howard.edu.lsp.assignment7.tollbooth.Tollbooth;
import org.howard.edu.lsp.assignment7.tollbooth.Truck;

public class Driver {

	public static void main(String[] args) {
		Tollbooth booth = new DistrictTollbooth();

		Truck chev = new CheverletColorado(5, 12000); 	// 5 axles and 12000 kilograms
		//Truck nissan = new NissanTruck(2, 5000); 	// 2 axles and 5000kg
			//Truck daewoo = new DaewooTruck(6, 17000); // ….

		booth.calculateToll(chev);
		booth.displayData();
		//	booth.calculateToll(nissan);
		booth.reset();	// zero out receipts, print out aforementioned summary information.
		//booth.calculateToll(daewoo);
		booth.displayData();	


	}

}


