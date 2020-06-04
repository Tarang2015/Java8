package com.test.synchronization;

class Display1 {
  //public synchronized void display(String name){
  public void display(String name) {
    synchronized (Display1.class) {
      for (int i = 0; i < 5; i++) {
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

  }

  class MyThread1 extends Thread {
    Display1 d;
    String name;

    public MyThread1(Display1 d, String name) {
      this.d = d;
      this.name = name;
    }

    public void run() {
      d.display(name);
    }

  }

  public class Synchronizationblock {
    public static void main(String[] args) {
      Display1 d = new Display1();
       Display1 d1=new Display1();
      MyThread1 t1 = new MyThread1(d, "Dhoni");
       MyThread1 t2=new MyThread1(d1,"Yuvraj");
     // MyThread1 t2 = new MyThread1(d, "Yuvraj");
      t1.start();
      t2.start();
    }
  }

