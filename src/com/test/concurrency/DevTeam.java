package com.test.concurrency;

import java.util.concurrent.CountDownLatch;

public class DevTeam extends   Thread {

  private CountDownLatch latch;
  public DevTeam(CountDownLatch latch,String name){
    super(name);
    this.latch=latch;
  }

  @Override
  public void run(){
    System.out.println("Task assigined to " +  Thread.currentThread().getName() + "team");
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Task completed by" +  Thread.currentThread().getName() +" team");
    latch.countDown();
  }

}
