package com.test.concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListTest extends Thread{

  static CopyOnWriteArrayList list=new CopyOnWriteArrayList();
  public void run(){
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("updating array list");
    list.add(10);
  }

  public static void main(String[] args) throws InterruptedException {
    list.add(1);
    list.add(90);
    CopyOnArrayListTest t1=new CopyOnArrayListTest();
    t1.start();

    Iterator it= list.iterator();
    while (it.hasNext()){

      Integer i= (Integer) it.next();
      System.out.println(Thread.currentThread().getName() +"iterating" + i);
      Thread.sleep(3000);
    }
System.out.println(list);
  }
}
