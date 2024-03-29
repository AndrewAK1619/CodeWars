package pl.example.CodeWars;

//  In this simple assignment you are given a number and have to make it negative.
//  But maybe the number is already negative?
//
//        Example:
//
//        Kata.makeNegative(1); // return -1
//        Kata.makeNegative(-5); // return -5
//        Kata.makeNegative(0); // return 0
//        Notes:
//
//        The number can be negative already, in which case no change is required.
//        Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.

public class ReturnNegative {
    public static int makeNegative(final int x) {
        return (x > 0) ? -x : x;
    }

    public static void main(String[] args) {
        ReturnNegative.makeNegative(1);
        ReturnNegative.makeNegative(-5);
        ReturnNegative.makeNegative(0);
        ReturnNegative.makeNegative(42);
    }
}
