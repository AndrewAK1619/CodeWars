package pl.example.CodeWars;

public class Vowels {
	public static int getCount(String str) {
		int vowelsCount = 0;

		vowelsCount = (int) str.chars()
				.filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				.count();

		return vowelsCount;
	}

	public static void main(String[] args) {
		Vowels.getCount("abracadabra");
	}
}
