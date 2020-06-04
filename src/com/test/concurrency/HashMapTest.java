package com.test.concurrency;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest  extends  Thread {
  static HashMap map=new HashMap<>();
  public void run(){
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Thread is updating map");
    map.put(3,"ui");
  }

  public static void main(String[] args) throws InterruptedException {
    map.put(1,"tr");
    map.put(2,"bb");
    HashMapTest t1=new HashMapTest();
    t1.start();
    Set s=map.keySet();
    Iterator it=s.iterator();
    while (it.hasNext()){
      Integer i= (Integer) it.next();
      Thread.sleep(3000);
      System.out.println(Thread.currentThread().getName() + " Iterating " + i);
    }
    System.out.println(map);
  }
}
