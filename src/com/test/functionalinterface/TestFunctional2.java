package com.test.functionalinterface;

interface I4{
  public default void m4(){
    System.out.println("I4-m4()");

  }


}

interface I5{
  public default void m4(){
    System.out.println("I5-m4()");

  }
}
class C implements I4,I5{


  public void m4() {
    System.out.println("C-m4() ovverides");
    I4.super.m4();
    I5.super.m4();
  }
}
public class TestFunctional2 {
  public static void main(String[] args) {
I5 i4=new C();
i4.m4();
  }
}
