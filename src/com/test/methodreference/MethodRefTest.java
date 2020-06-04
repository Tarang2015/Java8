package com.test.methodreference;

public class MethodRefTest {
  public static int add(int a,int b){
    return a+b;
  }
  public static void test(){
    for(int i=0;i<5;i++){
      System.out.println("Child thread1");
    }
  }
  public static void main(String[] args) {
    //lambda
    Calculation c= (a,b)-> (a+b);
    System.out.println(c.sum(10,20));
    Calculation c1=MethodRefTest::add;

    System.out.println(c1.sum(100,200));


    Runnable r=MethodRefTest::test;
    Thread t=new Thread(r);
    t.start();
    for(int i=0;i<5;i++){
      System.out.println("main thread");
    }

  }
}
