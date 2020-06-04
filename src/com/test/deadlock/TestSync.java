package com.test.deadlock;

public class TestSync {
  public static void main(String[] args) throws InterruptedException {
      MyThread1 t=new MyThread1();
      MyThread2 t1=new MyThread2();
      t.start();
      t1.start();

    }

}
