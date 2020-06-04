package com.test.concurrency;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest extends Thread{

  static ArrayList list=new ArrayList();
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
    ArrayListTest t1=new ArrayListTest();
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
