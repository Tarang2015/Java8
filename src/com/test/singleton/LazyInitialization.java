package com.test.singleton;


public class LazyInitialization {
  private static LazyInitialization lazyInitialization;
  private LazyInitialization(){}

  public static LazyInitialization getInstance(){
    if(null==lazyInitialization){
      lazyInitialization =new LazyInitialization();
    }
    return lazyInitialization;
  }

}
