package com.test.lambda;

interface Printable {
  String print(String msg);
}
public class JLEExampleSingleParameter {
  public static void main(String[] args) {
    Printable p=(msg)-> "hello " +msg;
   System.out.println( p.print("tribhuwan"));
  }


}
