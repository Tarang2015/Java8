package com.test.functionalinterface;
interface I8{
  public default void m9(){
    System.out.println("default m9()");
  }
  public void m10();
  public static void m11(){
    System.out.println("static m11()");
  }
}
public class TestFunctional6 {
  public static void main(String[] args) {


    I8 i8 = new I8() {

      @Override
      public void m9() {
        System.out.println("ann m9()");
      }

      @Override
      public void m10() {
        System.out.println("ann m10()");
      }

    };
    i8.m9();
    i8.m10();
    I8.m11();
  }
}
