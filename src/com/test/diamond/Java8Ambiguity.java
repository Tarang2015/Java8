package com.test.diamond;

interface I1 {
  default void show() {
    System.out.println("I1 show");
  }

  interface I2 {
    default void show() {
      System.out.println("I2 show");
    }
  }

  public class Java8Ambiguity implements I1, I2 {
    @Override
    public void show() {
I1.super.show();
I2.super.show();
    }

    public static void main(String[] args) {
      Java8Ambiguity test=new Java8Ambiguity();
      test.show();
    }
  }
}
