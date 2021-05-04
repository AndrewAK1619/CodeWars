package pl.example.CodeWars;

import java.util.Arrays;

public class Positive {
	public static int sum(int[] arr) {
		return Arrays.stream(arr).filter(a -> a > 0).sum();
	}

	public static void main(String[] args) {
		Positive.sum(new int[]{1, 2, 3, 4, 5});
		Positive.sum(new int[]{1, -2, 3, 4, 5});
		Positive.sum(new int[]{});
		Positive.sum(new int[]{-1, -2, -3, -4, -5});
		Positive.sum(new int[]{-1, 2, 3, 4, -5});
	}
}
