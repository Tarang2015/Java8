package com.test.deadlock;

public class MyThread1 extends Thread {
  Counter c=new Counter();
  public void run(){
    for(int i=0;i<200;i++) {
      c.increment();
    }
  }

}
