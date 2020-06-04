package com.test.singleton;

public class SingletonTest {
  public static void main(String[] args) {
    EagerSingleton eagerSingleton1;
    EagerSingleton eagerSingleton2;
    eagerSingleton1=EagerSingleton.getEagerSingleton();
    eagerSingleton2=EagerSingleton.getEagerSingleton();
    System.out.println(eagerSingleton1.hashCode());
    System.out.println(eagerSingleton2.hashCode());
    System.out.println("===============");

    StaticBlock staticBlock1;
    StaticBlock staticBlock2;
    staticBlock1=StaticBlock.getStaticBlock();
    staticBlock2=StaticBlock.getStaticBlock();
    System.out.println(staticBlock1.hashCode());
    System.out.println(staticBlock2.hashCode());
  }
}
