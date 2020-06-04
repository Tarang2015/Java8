package com.test.functionalinterface;

interface I1{
  public void m1();
}

class A implements  I1{

  public void m1() {
System.out.println("method m1 -I1");
  }
}

public class TestFunctional {
  public static void main(String[] args) {
I1 a=new A();
a.m1();

  }
}
