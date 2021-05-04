package pl.example.CodeWars;

//	Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
//	
//	It should remove all values from list a, which are present in list b keeping their order.
//	
//	array_diff({1, 2}, 2, {1}, 1, *z) == {2} (z == 1)
//	If a value is present in b, all of its occurrences must be removed from the other:
//	
//	array_diff({1, 2, 2, 2, 3}, 5, {2}, 1, *z) == {1, 3} (z == 2)

import java.util.*;
import java.util.stream.Collectors;

public class ArrayDiff {
	public static int[] arrayDiff(int[] a, int[] b) {
		List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
		List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
		listA.removeAll(listB);
		return listA.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		ArrayDiff.arrayDiff(new int[]{1, 2}, new int[]{1});
		ArrayDiff.arrayDiff(new int[]{1, 2, 2}, new int[]{1});
		ArrayDiff.arrayDiff(new int[]{1, 2, 2}, new int[]{2});
		ArrayDiff.arrayDiff(new int[]{1, 2, 2}, new int[]{});
		ArrayDiff.arrayDiff(new int[]{}, new int[]{1, 2});
	}
}
