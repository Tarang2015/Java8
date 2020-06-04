package com.test.lambda;
interface Drawable{
  void draw();
}

public class LambdaExpressionExample1 {
  public static void main(String[] args) {
int width=10;
    //without lambda

    Drawable drawable=new Drawable() {
      @Override
      public void draw() {
        System.out.println("Drawable width is " + width);
      }
    };
    drawable.draw();
    //with lambda
    Drawable d=()->System.out.println("Drawable width is " + width);
    d.draw();
  }



}
