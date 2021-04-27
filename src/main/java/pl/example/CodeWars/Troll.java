package pl.example.CodeWars;

//Trolls are attacking your comment section!
//
//A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
//
//Your task is to write a function that takes a string and return a new string with all vowels removed.
//
//For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
//
//Note: for this kata y isn't considered a vowel.

public class Troll {
	public static String disemvowel(String str) {
		return str.replaceAll("[aeiouAEIOU]", "");
	}

	public static void main(String[] args) {
		Troll.disemvowel("This website is for losers LOL!");
		Troll.disemvowel("No offense but,\nYour writing is among the worst I've ever read");
		Troll.disemvowel("What are you, a communist?");
	}
}
