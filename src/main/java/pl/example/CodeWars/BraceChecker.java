package pl.example.CodeWars;

//Write a function that takes a string of braces, and determines
//if the order of the braces is valid. It should return true
//if the string is valid, and false if it's invalid.
//
//     This Kata is similar to the Valid Parentheses Kata,
//     but introduces new characters: brackets [], and curly braces {}.
//     Thanks to @arnedag for the idea!
//
//     All input strings will be nonempty, and will
//     only consist of parentheses, brackets and curly braces: ()[]{}.
//     What is considered Valid?
//
//     A string of braces is considered valid if all
//     braces are matched with the correct brace.
//     Examples
//
//     "(){}[]"   =>  True
//     "([{}])"   =>  True
//     "(}"       =>  False
//     "[(])"     =>  False
//     "[({})](]" =>  False

public class BraceChecker {

 public boolean isValid(String braces) {
     int lengthOfBraces = braces.length();
     for(int i = 0; i < lengthOfBraces; i++){
         braces = braces.replace("{}", "").replace("[]", "").replace("()", "");
     }
     return braces.isEmpty();
 }

 public static void main(String[] args) {
     BraceChecker checker = new BraceChecker();

     System.out.println("1: " + checker.isValid("()"));  //true
     System.out.println("2: " + checker.isValid("[(])"));    //false
     System.out.println("3: " + checker.isValid("[({})][]"));    //true
     System.out.println("4: " + checker.isValid("()")); // true
     System.out.println("5: " + checker.isValid("[]")); // true
     System.out.println("6: " + checker.isValid("{}")); // true
     System.out.println("7: " + checker.isValid("(){}[]")); // true
     System.out.println("8: " + checker.isValid("([{}])")); // true
     System.out.println("9: " + checker.isValid("(}")); // false
     System.out.println("10: " + checker.isValid("[(])")); // false
     System.out.println("11: " + checker.isValid("({})[({})]")); // true
     System.out.println("12: " + checker.isValid("(})")); // false
     System.out.println("13: " + checker.isValid("(({{[[]]}}))")); //true
     System.out.println("14: " + checker.isValid("{}({})[]")); // true
     System.out.println("15: " + checker.isValid(")(}{][")); // false
     System.out.println("16: " + checker.isValid("())({}}{()][][")); // false
     System.out.println("17: " + checker.isValid("(((({{"));  // false
     System.out.println("18: " + checker.isValid("}}]]))}])")); // false
 }
}
