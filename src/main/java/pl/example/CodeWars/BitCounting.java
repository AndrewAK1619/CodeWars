package pl.example.CodeWars;

//Write a function that takes an integer as input,and returns the number of bits
//that are equal to one in the binary representation of that number.You can
//guarantee that input is non-negative.
//
//Example:The binary representation of 1234is 10011010010,so the
//function should return 5in this case

public class BitCounting {

  public static int countBits(int n) {
      return Integer.bitCount(n);
  }

  public static void main(String[] args) {
      System.out.println(BitCounting.countBits(1234));    //return 5
      System.out.println(BitCounting.countBits(4));   //return 1
      System.out.println(BitCounting.countBits(7));   //return 3
      System.out.println(BitCounting.countBits(9));    //return 2
      System.out.println(BitCounting.countBits(10));  //return 2
  }
}