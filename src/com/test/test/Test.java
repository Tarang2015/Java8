package com.test.test;

public class Test {
  public static void main(String[] args) {
    String s1="Tribhuwan";
    String s2="Tribhuwan";
    System.out.println(s1.equals(s2));

    StringBuffer  sb1=new StringBuffer();
    sb1.append("Tribhuwan");
    StringBuffer  sb2=new StringBuffer();
    sb1.append("Tribhuwan");
    System.out.println(sb1.equals(sb2));

    StringBuilder  sl1=new StringBuilder();
    sl1.append("Tribhuwan");
    StringBuilder  sl2=new StringBuilder();
    sl2.append("Tribhuwan");
    System.out.println(sl1.equals(sl2));
  }

}
