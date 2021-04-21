package org.howard.edu.lsp.exam.question40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnimalAirplaneTest {
	Animal goose, tiger;
	Flying flyObj1, flyObj2;
	@BeforeEach
	void setUp() {
		goose = new Goose();
		tiger = new Tiger();
		flyObj1 = new Airplane();
		flyObj2 = new Goose();
	}
	
	@Test
	@DisplayName("Test for move method")
	void testMove() {
		//Temp Message
		String message = "";
		//Test Goose
		message = "Goose moves forward";
		assertEquals(message,goose.move());
		//Test Tiger
		message = "Tiger moves forward";
		assertEquals(message,tiger.move());
		
	}
	
	@Test
	@DisplayName("Test for the speak method")
	void testSpeak() {
		//Temp Message
		String message = "";
		//Test Goose
		message = "Goose speaks";
		assertEquals(message,goose.speak());
		//Test Tiger
		message = "Tiger speaks";
		assertEquals(message,tiger.speak());
	}
	
	@Test
	@DisplayName("Test for the fly method")
	void testFly() {
		//Temp Message
		String message = "";
		//Test Airplane
		message = "Airplane flies";
		assertEquals(message,flyObj1.fly());
		//Test Goose
		flyObj2 = (Flying) goose;
		message = "Goose flies";
		assertEquals(message,flyObj2.fly());
	
	}

}
