package pl.example.CodeWars;

//  Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
//
//        For example:
//
//        persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
//        // and 4 has only one digit
//
//        persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
//        // 1*2*6 = 12, and finally 1*2 = 2
//
//        persistence(4) == 0 // because 4 is already a one-digit number

public class Persist {
    public static int persistence(long n) {
        int result = 0;

        while (n > 9) {
            int m = 1;
            while (n > 0) {
                m *= (n % 10);
                n /= 10;
            }
            n = m;
            result += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Persist.persistence(39);
        Persist.persistence(4);
        Persist.persistence(25);
        Persist.persistence(999);
        Persist.persistence(0);
    }
}
