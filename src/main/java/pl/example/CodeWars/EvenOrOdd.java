package pl.example.CodeWars;

// Create a function (or write a script in Shell) that takes an integer as an argument 
// and returns "Even" for even numbers or "Odd" for odd numbers.

public class EvenOrOdd {
    public static String even_or_odd(int number) {

    	if(number%2 == 0) {
    		return "Even";
    	} else {
    		return "Odd";
    	}
    }

	public static void main(String[] args) {
		EvenOrOdd.even_or_odd(0);
		EvenOrOdd.even_or_odd(0);
	}
}
