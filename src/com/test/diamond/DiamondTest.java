package com.test.diamond;

interface InterfaceA {

  public void doSomething();
}
  interface InterfaceB extends  InterfaceA{

  public void doSomething();
}
interface InterfaceC extends  InterfaceA{

  public void doSomething();
}

public class DiamondTest implements InterfaceB, InterfaceC {
  public void doSomething(){
    System.out.println("cbksbckbsck");
  }
  public static void main(String[] args) {
    InterfaceA  i1=new DiamondTest();
    i1.doSomething();
    InterfaceB  i2=new DiamondTest();
    i2.doSomething();
  }

}
