package com.test.singleton;

public class SuperClass implements Cloneable {
  int i=10;
  protected Object clone() throws CloneNotSupportedException{
   return super.clone();
  }
}
