package pl.example.CodeWars;

import java.util.Arrays;

//	You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.
//	
//	Examples
//	[2, 4, 0, 100, 4, 11, 2602, 36]
//	Should return: 11 (the only odd number)
//	
//	[160, 3, 1719, 19, 11, 13, -21]
//	Should return: 160 (the only even number)

public class FindOutlier {
	static int find(int[] integers) {
		if (Arrays.stream(integers).filter(n -> 0 == n % 2).count() == 1)
			return Arrays.stream(integers)
					.filter(n -> 0 == n % 2)
					.findFirst().getAsInt();
		else
			return Arrays.stream(integers)
					.filter(n -> 0 != n % 2)
					.findFirst().getAsInt();
	}

	public static void main(String[] args) {
		FindOutlier.find(new int[]{2, 6, 8, -10, 3});
		FindOutlier.find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7,
				1, 35521, 1, 7781});
		FindOutlier.find(new int[]{Integer.MAX_VALUE, 0, 1});
		FindOutlier.find(new int[]{2, 4, 0, 100, 4, 11, 2602, 36});
		FindOutlier.find(new int[]{160, 3, 1719, 19, 11, 13, -21});
	}
}
