package pl.example.CodeWars;

public class ReversedString {
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        ReversedString.solution("world");
    }
}
