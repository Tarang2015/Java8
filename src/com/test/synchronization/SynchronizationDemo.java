package com.test.synchronization;

class Display{
  //public synchronized void display(String name){
  public static synchronized void display(String name){
    for(int i=0;i<5;i++){
      System.out.print("Good  Morning: ");
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(name);
    }
  }

    }
    class MyThread extends Thread{
  Display d;
  String name;
  public MyThread(Display d,String name){
    this.d=d;
    this.name=name;
  }
  public void run(){
    d.display(name);
  }

    }
public class SynchronizationDemo {
  public static void main(String[] args) {
    Display d=new Display();
   // Display d1=new Display();
MyThread t1=new MyThread(d,"Dhoni");
   // MyThread t2=new MyThread(d1,"Yuvraj");
    MyThread t2=new MyThread(d,"Yuvraj");
t1.start();
t2.start();
  }
}
