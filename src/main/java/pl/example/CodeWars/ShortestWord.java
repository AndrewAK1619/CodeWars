package pl.example.CodeWars;

//	Simple, given a string of words, return the length of the shortest word(s).
//	
//	String will never be empty and you do not need to account for different data types.

import java.util.stream.Stream;

public class ShortestWord {
	public static int findShort(String s) {
		return Stream.of(s.split(" "))
				.mapToInt(String::length)
				.min()
				.getAsInt();
	}

	public static void main(String[] args) {
		ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps");
		ShortestWord.findShort("turns out random test cases are easier than writing out basic ones");
	}
}
