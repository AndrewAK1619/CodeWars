package pl.example.CodeWars;

//	An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
//	
//	isIsogram "Dermatoglyphics" == true
//	isIsogram "aba" == false
//	isIsogram "moOse" == false -- ignore letter case

public class Isogram {
	public static boolean isIsogram(String str) {
		return str.toLowerCase()
				.chars()
				.distinct()
				.count() == str.length();
	}

	public static void main(String[] args) {
		Isogram.isIsogram("Dermatoglyphics");
		Isogram.isIsogram("isogram");
		Isogram.isIsogram("moose");
		Isogram.isIsogram("isIsogram");
		Isogram.isIsogram("aba");
		Isogram.isIsogram("moOse");
		Isogram.isIsogram("thumbscrewjapingly");
		Isogram.isIsogram("");
	}
}
