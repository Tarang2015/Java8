package com.test.lambda;

interface IAvarage{
  double avg(int[] array);
}
public class JLEExampleMultipleStatements {
  public static void main(String[] args) {
    IAvarage avarage=(ar)->{
      int sum=0;
      int size=ar.length;
      for(int i=0;i<size;i++){
        sum=sum+ar[i];
      }
      System.out.println(sum);
      return (sum/size);
    };
    int arr[]={1,3,4,6,7};
   System.out.println (avarage.avg(arr));
  }
}
