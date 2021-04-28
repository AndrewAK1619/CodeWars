package pl.example.CodeWars;

//	Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (like the name of this kata).
//	
//	Strings passed in will consist of only letters and spaces.
//	Spaces will be included only when more than one word is present.
//	Examples:
//	
//	spinWords("Hey fellow warriors") => "Hey wollef sroirraw" 
//	spinWords("This is a test") => "This is a test" 
//	spinWords("This is another test") => "This is rehtona test"

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
	public String spinWords(String sentence) {
		return Arrays.stream(sentence.split(" "))
				.map(i -> i.length() >= 5 ? new StringBuilder(i).reverse().toString() : i)
				.collect(Collectors.joining(" "));
	}

	public static void main(String[] args) {
		SpinWords spinWords = new SpinWords();
		spinWords.spinWords("Welcome");
		spinWords.spinWords("Hey fellow warriors");
		spinWords.spinWords("This is a test");
		spinWords.spinWords("This is another test");
	}
}
