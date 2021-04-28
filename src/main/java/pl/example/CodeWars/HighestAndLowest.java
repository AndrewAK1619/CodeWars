package pl.example.CodeWars;

//	In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
//	
//	Example:
//	
//	highAndLow("1 2 3 4 5")  // return "5 1"
//	highAndLow("1 2 -3 4 5") // return "5 -3"
//	highAndLow("1 9 3 4 -5") // return "9 -5"
//	Notes:
//	
//	All numbers are valid Int32, no need to validate them.
//	There will always be at least one number in the input string.
//	Output string must be two numbers separated by a single space, and highest number is first.

import java.util.*;

public class HighestAndLowest {
	public static String highAndLow(String numbers) {
		int[] numArr = Arrays.stream(numbers.split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		Arrays.sort(numArr);
		return numArr[numArr.length - 1] + " " + numArr[0];
	}

	public static void main(String[] args) {
		HighestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
	}
}
