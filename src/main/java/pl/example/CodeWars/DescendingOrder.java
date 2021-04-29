package pl.example.CodeWars;

import java.util.*;

public class DescendingOrder {
	public static int sortDesc(final int num) {
		String[] strArr = String.valueOf(num).split("");
		Arrays.sort(strArr, Collections.reverseOrder());
		return Integer.valueOf(String.join("", strArr));
	}

	public static void main(String[] args) {
		DescendingOrder.sortDesc(0);
		DescendingOrder.sortDesc(15);
		DescendingOrder.sortDesc(123456789);
		DescendingOrder.sortDesc(42145);
		DescendingOrder.sortDesc(145263);
		DescendingOrder.sortDesc(123456789);
	}
}
