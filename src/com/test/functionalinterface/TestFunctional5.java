package com.test.functionalinterface;

interface Square{
  public default void calc(int x){

    System.out.println("The square of given no="+ (x*x));
  }

  interface Cube{
    public default void calc(int x){
      System.out.println("The cube of given no="+ (x*x*x));
    }
}
class G implements Square,Cube{
    public void calc(int x){
      System.out.println("G method calc method" + x);
      Square.super.calc(10);
      Cube.super.calc(3);

    }

}
public class TestFunctional5 {
  public static void main(String[] args) {
    G g=new G();
    g.calc(100);

  }
}
}
