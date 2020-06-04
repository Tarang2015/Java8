package com.test.singleton;

public class ClonedSingleton extends SuperClass {
private static  ClonedSingleton clonedSingleton;
private ClonedSingleton(){}
public static ClonedSingleton getInstance(){
  if(clonedSingleton==null){
    clonedSingleton =new ClonedSingleton();
  }
  return clonedSingleton;
}

protected Object clone() throws CloneNotSupportedException{
  return clonedSingleton;
}

  public static void main(String[] args) throws CloneNotSupportedException {
    ClonedSingleton clonedSingleton1;
        clonedSingleton1=ClonedSingleton.getInstance();
    ClonedSingleton clonedSingleton2=(ClonedSingleton) clonedSingleton1.clone();
    System.out.println(clonedSingleton1.hashCode());
    System.out.println(clonedSingleton2.hashCode());
  }
}
