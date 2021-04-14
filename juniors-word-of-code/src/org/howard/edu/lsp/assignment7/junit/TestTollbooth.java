package org.howard.edu.lsp.assignment7.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.howard.edu.lsp.assignment7.tollbooth.CheverletColorado;
import org.howard.edu.lsp.assignment7.tollbooth.DistrictTollbooth;
import org.howard.edu.lsp.assignment7.tollbooth.KenworthT680;
import org.howard.edu.lsp.assignment7.tollbooth.Tollbooth;
import org.howard.edu.lsp.assignment7.tollbooth.ToyotaLandCruiser;
import org.howard.edu.lsp.assignment7.tollbooth.Truck;
import org.howard.edu.lsp.assignment7.tollbooth.VolkswagenAmarok;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestTollbooth {
	
	Tollbooth booth;
	Truck chev, ken, toyota, volks;
	
	@BeforeEach
	public void setUp() {
		 booth = new DistrictTollbooth(); //Implement the interface TollBooth
		 chev = new CheverletColorado(1800,6); //Weight is 1800kilograms with 6 axles
		 ken = new KenworthT680(25000,5); 	// Weight is 25000kgs with 5 axles
		 toyota = new ToyotaLandCruiser(1900,4); // Weight is 1900 kgs with 4 axles
		 volks = new VolkswagenAmarok(3000,7); // Weight is 3000kgs with 7 axles
	}
	
	@Test
	@DisplayName("Test for the calculateToll method")
	public void testCalculateToll() {
		booth.calculateToll(chev);
		assertEquals(48.0,booth.getTollCost(),0.001);
		booth.calculateToll(ken);
		assertEquals(275.0,booth.getTollCost(),0.001);
		booth.calculateToll(toyota);
		assertEquals(39.0,booth.getTollCost(),0.0001);
		booth.calculateToll(volks);
		assertEquals(65.0,booth.getTollCost(),0.0001);
	}
	
	@Test
	@DisplayName("Test for the currentReceiptProgress method")
	public void testCurrentReceiptProgress() {
		System.out.println("\n\n****Testing currentReceiptProgress method****\n");
		booth.calculateToll(chev);
		System.out.println(booth.currentReceiptProgress());
		assertEquals("Total since last collection-Receipts: $48.0 Trucks: 1\n",booth.currentReceiptProgress());
		booth.calculateToll(ken);
		booth.calculateToll(toyota);
		booth.calculateToll(volks);
		System.out.println(booth.currentReceiptProgress());
		assertEquals("Total since last collection-Receipts: $427.0 Trucks: 4\n", booth.currentReceiptProgress());
	}
	
	@Test
	@DisplayName("Test for the displayData method")
	public void testDisplayMethod() {
		//Test 1
		String message = "Truck Arrival\n-------------\nName: Cheverlet Colorado Axles: 6 Total Weight: 1800 Toll Due: $48.0\n";
		booth.calculateToll(chev);
		String messageCheck = booth.displayData();
		System.out.println(messageCheck);
		assertEquals(message,messageCheck);	
		//Test 2
		message = "Truck Arrival\n-------------\nName: Kenworth T680 Axles: 5 Total Weight: 25000 Toll Due: $275.0\n";
		booth.calculateToll(ken);
		messageCheck = booth.displayData();
		System.out.println(messageCheck);
		assertEquals(message,messageCheck);
		//Test 3
		message = "Truck Arrival\n-------------\nName: Toyota LandCruiser Axles: 4 Total Weight: 1900 Toll Due: $39.0\n";
		booth.calculateToll(volks);
		messageCheck = booth.displayData();
		System.out.println(message);
		assertNotEquals(message,messageCheck);
		//Test 4
		message = "Truck Arrival\n-------------\nName: Volkswagen Amarok Axles: 7 Total Weight: 3000 Toll Due: $65.0\n";
		booth.calculateToll(volks);
		System.out.println(messageCheck);
		messageCheck = booth.displayData();
		assertEquals(message,messageCheck);
	}
	
	@Test
	@DisplayName("Test for the reset method")
	public void reset() {
		System.out.println("\n\n****Testing Reset Method****\n");
		//Test 1
		String message = "*****Collecting Receipts*****\nTotal since last collection-Receipts: $323.0 Trucks: 2\n";
		booth.calculateToll(chev);
		System.out.println(booth.displayData());
		System.out.println(booth.currentReceiptProgress());
		booth.calculateToll(ken);
		System.out.println(booth.displayData());
		String messageCheck = booth.reset();
		System.out.println(messageCheck);
		assertEquals(message,messageCheck);
		//Test 2
		message = "*****Collecting Receipts*****\nTotal since last collection-Receipts: $427.0 Trucks: 4\n";
		booth.calculateToll(chev);
		System.out.println(booth.displayData());
		booth.calculateToll(ken);
		System.out.println(booth.displayData());
		System.out.println(booth.currentReceiptProgress());
		booth.calculateToll(toyota);
		System.out.println(booth.displayData());
		booth.calculateToll(volks);
		System.out.println(booth.displayData());
		messageCheck = booth.reset();
		System.out.println(messageCheck);
		assertEquals(message,messageCheck);
		System.out.println();
		//Test 3
		message = "*****Collecting Receipts*****\nTotal since last collection-Receipts: $104.0 Trucks: 2\n";
		booth.calculateToll(toyota);
		System.out.println(booth.displayData());
		System.out.println(booth.currentReceiptProgress());
		booth.calculateToll(volks);
		System.out.println(booth.displayData());
		messageCheck = booth.reset();
		System.out.println(messageCheck);
		assertEquals(message,messageCheck);
		
	}
	
	

}
