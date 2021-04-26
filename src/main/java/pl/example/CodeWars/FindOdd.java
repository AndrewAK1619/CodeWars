package pl.example.CodeWars;

// Given an array of integers, find the one that appears an odd number of times.
// There will always be only one integer that appears an odd number of times.

public class FindOdd {
	public static int findIt(int[] a) {
		int odd = 0;
		
		for (int item : a) {
			odd = odd ^ item;
		}
		return odd;
	}

	public static void main(String[] args) {
		FindOdd.findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5});
		FindOdd.findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5});
		FindOdd.findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5});
		FindOdd.findIt(new int[]{10});
		FindOdd.findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1});
		FindOdd.findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10});
	}
}
