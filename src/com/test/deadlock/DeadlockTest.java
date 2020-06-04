package com.test.deadlock;

public class DeadlockTest {
  public static void main(String[] args) {
    Object lock1=new Object();
    Object lock2 =new Object();
    DeadlockThread1 d1=new DeadlockThread1(lock1,lock2);
    DeadlockThread2 d2 =new DeadlockThread2(lock1,lock2);
    Thread t1=new Thread(d1, "T1");
    Thread t2=new Thread(d2, "T2");
    t1.start();
    t2.start();

  }
}
