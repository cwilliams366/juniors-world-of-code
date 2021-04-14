package org.howard.edu.lsp.assignment7.junit;

import org.howard.edu.lsp.assignment7.tollbooth.CheverletColorado;
import org.howard.edu.lsp.assignment7.tollbooth.DistrictTollbooth;
import org.howard.edu.lsp.assignment7.tollbooth.KenworthT680;
import org.howard.edu.lsp.assignment7.tollbooth.Tollbooth;
import org.howard.edu.lsp.assignment7.tollbooth.ToyotaLandCruiser;
import org.howard.edu.lsp.assignment7.tollbooth.Truck;
import org.howard.edu.lsp.assignment7.tollbooth.VolkswagenAmarok;

public class Driver {

	public static void main(String[] args) {
		Tollbooth booth = new DistrictTollbooth();

		Truck chev = new CheverletColorado(1800,6); 	// 5 axles and 12000 kilograms
		Truck ken = new KenworthT680(25000,5); 	// 2 axles and 5000kg
		Truck toyota = new ToyotaLandCruiser(1900,4); // ….
		Truck volks = new VolkswagenAmarok(3000,7);
		booth.calculateToll(chev);
		booth.displayData();
		booth.calculateToll(ken);
		booth.reset();	// zero out receipts, print out aforementioned summary information.
		booth.calculateToll(toyota);
		booth.displayData();	


	}

}


