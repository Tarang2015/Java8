package com.test.functionalinterface;

interface  I6{
  public void m6();
  public default String m7(){
    return "m7";
  }

}
class D implements I6{

  @Override
  public void m6() {
System.out.println("I6-m6()");
  }
}

public class TestFunctional3 {
  public static void main(String[] args) {
    I6 i6=new D();
    i6.m6();
    System.out.println(i6.m7());
  }
}
