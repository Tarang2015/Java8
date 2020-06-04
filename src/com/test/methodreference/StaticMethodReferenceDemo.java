package com.test.methodreference;



public class StaticMethodReferenceDemo {

  public static boolean isPositive(int n) {
    return n > 0;
  }
  // A static method for checking if a number is even
  public static boolean isEven(int n) {
    return (n % 2) == 0;
  }

  public static void main(String[] args) {
    boolean result;
    int num = 9;

    IntPredicate i=n->n%2==0;
   System.out.println( i.check(9));
   IntPredicate i2=StaticMethodReferenceDemo::isEven;
    System.out.println(i2.check(10));

  }

}
