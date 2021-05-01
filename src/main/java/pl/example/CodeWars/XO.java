package pl.example.CodeWars;

//	Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
//	
//	Examples input/output:
//	
//	XO("ooxx") => true
//	XO("xooxx") => false
//	XO("ooxXm") => true
//	XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//	XO("zzoo") => false

public class XO {
	public static boolean getXO(String str) {
		return str.toLowerCase().replace("x", "").length() == 
				str.toLowerCase().replace("o", "").length();
	}

	public static void main(String[] args) {
		XO.getXO("ooxx");
		XO.getXO("xooxx");
		XO.getXO("ooxXm");
		XO.getXO("zpzpzpp");
		XO.getXO("zzoo");
	}
}
