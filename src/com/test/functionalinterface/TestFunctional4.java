package com.test.functionalinterface;

interface I7{
  public void m7();
  default public void m8(){
    System.out.println(" defaults I7 -m8()");
  }
}
class E implements I7{

  @Override
  public void m7() {
System.out.println("m7()-E");
  }
  public void m8(){
    System.out.println("defualt override E-m7()");
  }
}
class  F implements I7{
  @Override
  public void m7() {
    System.out.println("m7()-F");
  }
  public void m8(){
    System.out.println("defualt override F-m7()");
  }

}
public class TestFunctional4 {
  public static void main(String[] args) {
    I7 i7=new E();
    i7.m7();
    i7.m8();
    i7=new F();
    i7.m7();
    i7.m8();
  }
}
