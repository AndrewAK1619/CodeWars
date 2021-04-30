package pl.example.CodeWars;

//This time no story, no theory. The examples below show you how to write function accum:
//
//Examples:
//
//accum("abcd") -> "A-Bb-Ccc-Dddd"
//accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//accum("cwAt") -> "C-Ww-Aaa-Tttt"
//The parameter of accum is a string which includes only letters from a..z and A..Z.

public class Accumul {
	public static String accum(String s) {

		String result = "";

		for (int i = 0; s.length() > i; i++) {
			result += s.substring(i, i + 1).toUpperCase();
			if (i > 0) {
				for (int j = 0; i > j; j++)
					result += s.substring(i, i + 1).toLowerCase();
			}
			if (s.length() != i + 1)
				result += "-";
		}
		return result;
	}

	public static void main(String[] args) {
		Accumul.accum("ZpglnRxqenU");
		Accumul.accum("NyffsGeyylB");
		Accumul.accum("MjtkuBovqrU");
		Accumul.accum("EvidjUnokmM");
		Accumul.accum("HbideVbxncC");
	}
}
