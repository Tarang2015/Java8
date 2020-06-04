package com.test.lambda;


interface Addable{
  int add(int a,int b);
}
public class JLEExampleMultipleParameters {
  public static void main(String[] args) {
    Addable ad= (a,b)->(a+b);
    System.out.println(ad.add(10,20));

    Addable ad1= (int a,int  b)->(a+b);
    System.out.println(ad1.add(20,20));

    Addable ad2= (a,b)->{
      return a+b;
    };
    System.out.println(ad2.add(30,20));
  }
}
