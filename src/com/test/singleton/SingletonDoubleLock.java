package com.test.singleton;

public class SingletonDoubleLock {
  private static SingletonDoubleLock instance;

  private SingletonDoubleLock(){}

  public static SingletonDoubleLock getInstance(){
    if(instance==null){
      synchronized (SingletonDoubleLock.class){
        if(instance==null){
          instance=new SingletonDoubleLock();
        }
      }

    }
    return instance;
  }
}
