package com.test.functionalinterface;

interface I2{
  public void m2();
}
interface I3{
  public void m3();
}

class B implements I2,I3{

  @Override
  public void m2() {
System.out.println("I2 -m2()");
  }

  @Override
  public void m3() {
    System.out.println("I3 -m3()");
  }
}

public class TestFunctional1 {
  public static void main(String[] args) {
    I2 i2=new B();
    i2.m2();
    I3 i3=new B();
    i3.m3();

  }
}
