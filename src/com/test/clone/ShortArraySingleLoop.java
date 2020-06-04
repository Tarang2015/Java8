package com.test.clone;

public class ShortArraySingleLoop {
  public static void main(String[] args) {
    int arr[]={10,9,24,8};
    for(int n:arr){
      System.out.println(n);
    }
    for(int j=0;j>arr.length-1;j++){
      if(arr[j+1]<arr[j]){
        int temp = arr[j];
        arr[j]=arr[j+1];
        arr[j]=temp;
      }
    }
    for(int n:arr){
      System.out.println(n);
    }
  }
}
