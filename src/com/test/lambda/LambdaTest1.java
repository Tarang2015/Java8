package com.test.lambda;
interface I{
  public void m1();
}
public class LambdaTest1 {
  public static void main(String[] args) {
    I i=()->System.out.println("Lambda test");
    i.m1();

  }
}
