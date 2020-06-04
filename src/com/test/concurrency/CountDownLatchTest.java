package com.test.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

  public static void main(String[] args) throws InterruptedException {
   CountDownLatch countDownLatch=new CountDownLatch(2);
    DevTeam devTeam1=new DevTeam(countDownLatch,"DEV1");
    DevTeam devTeam2=new DevTeam(countDownLatch,"DEV2");
    devTeam1.start();
    devTeam2.start();
    countDownLatch.await();
    QATeam q=new QATeam("QA Team");
    q.start();

  }



}
