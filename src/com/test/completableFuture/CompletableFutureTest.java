package com.test.completableFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFutureTest {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<String> res
    =calculateAsync();
    String result=res.get();
    System.out.println(result);
    System.out.println(Thread.currentThread().getName());
  }

  private static CompletableFuture<String> calculateAsync() {
    CompletableFuture<String> completableFuture=new CompletableFuture<>();
List<String> list=new ArrayList<>();
list.add("KK");
list.add("PK");
list.add("CK");
    Executors.newCachedThreadPool().submit(()->{
      try {
        System.out.println(Thread.currentThread().getName());

        Thread.sleep(20);
        String joinStr=String.join(",",list);
        completableFuture.complete(joinStr);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return null;
    });
    return completableFuture;
  }
}
