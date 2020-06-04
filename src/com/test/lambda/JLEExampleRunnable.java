package com.test.lambda;

public class JLEExampleRunnable {
  public static void main(String[] args) {
    //without lambda

    Runnable r=new Runnable() {
      @Override
      public void run() {
        System.out.println("Run method  calling..");
      }
    };
    Thread t=new Thread(r);
    t.start();

    //with lambda
    Runnable r1=()->{
      for(int i=0;i<10;i++) {
        System.out.println(i);
      }
    };
    Thread t2=new Thread(r1);
    t2.start();
  }
}
