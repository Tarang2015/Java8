package com.test.lambda;

interface Sayable{
   String say();
}
public class JLEExampleNoParameter {
  public static void main(String[] args) {
    Sayable s = () -> "Say  something";
   System.out.println( s.say());
  }




}
