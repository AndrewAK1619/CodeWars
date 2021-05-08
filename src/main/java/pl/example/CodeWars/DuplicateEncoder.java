package pl.example.CodeWars;

//	The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
//	
//	Examples
//	"din"      =>  "((("
//	"recede"   =>  "()()()"
//	"Success"  =>  ")())())"
//	"(( @"     =>  "))((" 
//	Notes
//	
//	Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateEncoder {
	static String encode(String word) {
		return Stream.of(word.toLowerCase().split(""))
				.map(n -> {
					if (1 < Stream.of(word.toLowerCase().split(""))
							.filter(m -> m.equals(n)).count()) {
						return ")";
					} else {
						return "(";
					}
				}).collect(Collectors.joining());
	}

	public static void main(String[] args) {
		DuplicateEncoder.encode("Prespecialized");
		DuplicateEncoder.encode("   ()(   ");
	}
}
