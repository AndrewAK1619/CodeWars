package pl.example.CodeWars;

//  We need a function that can transform a number into a string.
//
//        What ways of achieving this do you know?
//
//        Examples:
//        123 --> "123"
//        999 --> "999"

public class NumberToString {
    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        NumberToString.numberToString(67);
        NumberToString.numberToString(123);
        NumberToString.numberToString(999);
    }
}
