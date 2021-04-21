package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SongsDatabaseTest {
	
	SongsDatabase db;

	@BeforeEach
	void setUp() throws Exception {
		db = new SongsDatabase();
	}

	@Test
	@DisplayName("Test for the addSong method")
	void testAddSong() {
		db.addSong("Rap","Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
	}
	
	@Test
	@DisplayName("Test for the getSongs method")
	void testGetSongs() {
		//Set up test
		testAddSong();
		Set <String> temp = new HashSet<String>();
		Set <String> rapSongs = new HashSet<String>();
		//Test 1
		temp.add("Savage");
		temp.add("Gin and Juice");
		rapSongs = db.getSongs("Rap");
		assertEquals(temp,rapSongs);
		//Test 2
		temp.clear();
		temp.add("Always There");
		assertEquals(temp,db.getSongs("Jazz"));
		//Test 3
		db.addSong("Metal", "Dyer's Eve");
		db.addSong("Metal", "Battery");
		db.addSong("Metal", "Thunder Horse");
		temp.clear();
		temp.add("Dyer's Eve");
		temp.add("Battery");
		temp.add("Thunder Horse");
		assertEquals(temp,db.getSongs("Metal"));
		
	}
	
	@Test
	@DisplayName("Test for the getGenreOfSong method")
	void testGetGenreOfSong() {
		//Set up
	    testAddSong();
		db.addSong("Metal", "Dyer's Eve");
		db.addSong("Metal", "Battery");
		db.addSong("Metal", "Thunder Horse");
		//Test 1
		assertEquals("Jazz",db.getGenreOfSong("Always There"));
		//Test 2
		assertEquals("Metal",db.getGenreOfSong("Thunder Horse"));
		//Test 3
		assertEquals("Rap",db.getGenreOfSong("Gin and Juice"));
		//Test 4
		System.out.println(db.getGenreOfSong("Thunder Horse"));
		System.out.println(db.getGenreOfSong("Savage"));// prints “Rap”
		System.out.println(db.getGenreOfSong("Always There"));// prints "Jazz”

	}
	
}
