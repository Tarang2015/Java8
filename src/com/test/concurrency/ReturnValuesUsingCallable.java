package com.test.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ReturnValuesUsingCallable {
  public static void main(String[] args) throws InterruptedException, ExecutionException {

    System.out.println("Thread main started");

    ExecutorService executorService = Executors.newFixedThreadPool(5);
    List<Future<Integer>> returnedValues = executorService.invokeAll(Arrays.asList(
        new SumNumbers(50),
        new SumNumbers(40),
        new SumNumbers(30),
        new SumNumbers(10),
        new SumNumbers(20)));

    for (Future<Integer> value : returnedValues) {
      System.out.println(value.get());
    }
System.out.println("blocked..");
    executorService.shutdown();

    System.out.println("Thread main finished");
  }

}

class SumNumbers implements Callable<Integer> {
  private int n;

  public SumNumbers(int n) {
    this.n = n;
  }

  public Integer call() {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("[" + Thread.currentThread().getName() + "] Sum " + sum);
    return sum;
  }
}