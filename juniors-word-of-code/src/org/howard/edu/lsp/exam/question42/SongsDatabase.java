package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SongsDatabase {
	private Map<String, Set<String>> map = 
             new HashMap<String, Set<String>>();
	Set <String> songs = new HashSet <String>();
		/**
		 *  Add a song title to a genre 
		 */
	public void addSong(String genre, String songTitle) {
		Set <String> newSongList = new HashSet <String>();
			if(map.containsKey(genre)) {
				map.get(genre).add(songTitle);
			} else {
				newSongList.add(songTitle);
				map.put(genre, newSongList);
			}
		}

	/**
	 *  Return the Set that contains all songs for a genre 
	 *  @return returns the list of songs
	 */
	public Set<String> getSongs(String genre) {
		return map.get(genre);
	}

	/**
	 *  Return genre, i.e., jazz, given a song title 
	 *  @return return the genre of the song
	 */
	public String getGenreOfSong(String songTitle) {
		for(Entry<String, Set<String>> temp: map.entrySet()) {
			if(temp.getValue().contains(songTitle)) {
				return temp.getKey();
			}
		}
		return null;
	}
}
