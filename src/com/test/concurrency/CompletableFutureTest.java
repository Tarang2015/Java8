package com.test.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFutureTest {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<String> completableFuture=calculateAsync();
    String result=completableFuture.get();
    System.out.println(result);
    System.out.println(Thread.currentThread().getName());
  }

  private static CompletableFuture<String> calculateAsync() {
    CompletableFuture<String> completableFuture=new CompletableFuture<>();
   List<String> list=new ArrayList<>();
   list.add("KK");
   list.add("PK");
   list.add("SK");
    Executors.newCachedThreadPool().submit(()->{
      try {
        Thread.sleep(20);
       String join= String.join(",",list);
        System.out.println(Thread.currentThread().getName());
       completableFuture.complete(join);

      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return null;

    });
    return completableFuture;
  }
}
