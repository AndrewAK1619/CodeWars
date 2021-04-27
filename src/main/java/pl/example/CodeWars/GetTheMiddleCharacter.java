package pl.example.CodeWars;

public class GetTheMiddleCharacter {
	public static String getMiddle(String word) {
		int wordLenght = word.length();
		return word.substring(wordLenght / 2 - (1 - wordLenght % 2), wordLenght / 2 + 1);
	}

	public static void main(String[] args) {
		GetTheMiddleCharacter.getMiddle("test");
		GetTheMiddleCharacter.getMiddle("middle");
		GetTheMiddleCharacter.getMiddle("testing");
		GetTheMiddleCharacter.getMiddle("A");
	}
}
