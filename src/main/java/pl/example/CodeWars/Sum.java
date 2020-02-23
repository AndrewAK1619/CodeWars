package pl.example.CodeWars;

//Beginner Series #3 Sum of Numbers
//
//Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it. If the two numbers are equal return a or b.
//
//Note: a and b are not ordered!
//Examples
//
//GetSum(1, 0) == 1   // 1 + 0 = 1
//GetSum(1, 2) == 3   // 1 + 2 = 3
//GetSum(0, 1) == 1   // 0 + 1 = 1
//GetSum(1, 1) == 1   // 1 Since both are same
//GetSum(-1, 0) == -1 // -1 + 0 = -1
//GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2

public class Sum {
	public int GetSum(int a, int b) {
		int minValue = Math.min(a, b);
		int maxValue = Math.max(a, b);
		int result = 0;

		if (a == b) {
			return a;
		} else {
			for (int i = minValue; i <= maxValue; i++) {
				result += i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Sum sum = new Sum();

		System.out.println(sum.GetSum(1, 0));
		System.out.println(sum.GetSum(1, 2));
		System.out.println(sum.GetSum(0, 1));
		System.out.println(sum.GetSum(1, 1));
		System.out.println(sum.GetSum(-1, 0));
		System.out.println(sum.GetSum(-1, 2));
	}
}
