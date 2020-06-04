package com.test.concurrency;

public class QATeam extends Thread {
  private String name;

  public QATeam(String name){
    super(name);
  }
  public void run(){
    System.out.println("Task stared by " + Thread.currentThread().getName());
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Task completed by " + Thread.currentThread().getName());
  }
}
