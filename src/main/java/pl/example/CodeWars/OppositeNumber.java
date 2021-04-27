package pl.example.CodeWars;

//Very simple, given a number, find its opposite.
//
//Examples:
//
//1: -1
//14: -14
//-34: 34

public class OppositeNumber {
	public static int opposite(int number) {
		return -number;
	}

	public static void main(String[] args) {
		OppositeNumber.opposite(1);
	}
}
