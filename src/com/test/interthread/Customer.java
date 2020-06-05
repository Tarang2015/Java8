package com.test.interthread;

public class Customer {
  int balance=5000;

  public synchronized void withDraw(int amount){
    if(amount>balance){
      System.out.println("In sufficient amount");
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    balance=balance-amount;
    System.out.println("withDraw completed");

  }

  public synchronized void deposit(int amount){

    System.out.println("going to completed");
    balance=balance+amount;
    System.out.println("deposit completed");
    notify();
  }

  public static void main(String[] args) {
    Customer c=new Customer();
    new Thread(() -> c.withDraw(10000)).start();
    new Thread(() -> c.deposit(1000)).start();
  }
}
