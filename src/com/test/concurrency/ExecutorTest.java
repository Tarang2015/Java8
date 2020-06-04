package com.test.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {
  public static void main(String[] args) {
    System.out.println("Thread " + Thread.currentThread().getName());
    ExecutorService executorService= Executors.newFixedThreadPool(2);

    Runnable r1=()->{
      System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
      try {
        TimeUnit.SECONDS.sleep(2);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    Runnable r2=()->{
      System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
      try {
        TimeUnit.SECONDS.sleep(2);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };
    Runnable r3=()->{
      System.out.println("Executing Task3 inside : " + Thread.currentThread().getName());
      try {
        TimeUnit.SECONDS.sleep(2);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };
    executorService.submit(r1);
    executorService.submit(r2);
    executorService.submit(r3);
    executorService.shutdown();
  }
}
