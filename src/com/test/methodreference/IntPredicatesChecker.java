package com.test.methodreference;

public class IntPredicatesChecker {
  public static boolean isPositive(int n) {
    return n > 0;
  }
  // A static method for checking if a number is even
  public static boolean isEven(int n) {
    return (n % 2) == 0;
  }
}
