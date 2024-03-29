package pl.example.CodeWars;

//Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
//
//Examples
//    16  -->  1 + 6 = 7
//   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
//132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
//493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

public class DRoot {
	public static int digital_root(int n) {

		int count = 0;

		while (n > 0) {
			int item = n % 10;
			count += item;
			n /= 10;
		}
		if (count > 9) {
			return digital_root(count);
		}
		return count;
	}

	public static void main(String[] args) {
		DRoot.digital_root(16);
		DRoot.digital_root(456);
	}
}
