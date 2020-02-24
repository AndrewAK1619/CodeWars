package pl.example.CodeWars;

import java.util.Arrays;
import java.util.Comparator;

//Highest Scoring Word
//
//Description:
//
//Given a string of words, you need to find the highest scoring word.
//
//Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//
//You need to return the highest scoring word as a string.
//
//If two words score the same, return the word that appears earliest in the original string.
//
//All letters will be lowercase and all inputs will be valid.

public class Kata2 {
	public static String high(String s) {
		return Arrays.stream(s.split(" "))
				.max(Comparator.comparingInt(a -> a.chars()
						.map(i -> i - 96)
						.sum()))
				.get();
	}

	public static void main(String[] args) {
		System.out.println(Kata2.high("man i need a taxi up to ubud"));
		System.out.println(Kata2.high("what time are we climbing up to the volcano"));
		System.out.println(Kata2.high("take me to semynak"));
	}
}
