package com.test.deadlock;

public class Counter {
  private int i;

  public void increment(){

    synchronized (this){
      i++;
    }
    System.out.println(i);
  }

  public int getI() {
    System.out.println(i);
    return i;
  }
}
