package com.test.singleton;

public class EagerSingleton {
  private static EagerSingleton eagerSingleton=new EagerSingleton();
  private EagerSingleton(){}
  public static EagerSingleton getEagerSingleton(){
    return eagerSingleton;
  }
}
