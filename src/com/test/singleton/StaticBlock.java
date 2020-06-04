package com.test.singleton;

public class StaticBlock {
  private static StaticBlock staticBlock;
  private StaticBlock(){}
  static {
    try{
      staticBlock=new StaticBlock();
    }catch (Exception e){
      throw new RuntimeException("Unable to create instance");
    }
  }
  public static StaticBlock getStaticBlock(){
    return staticBlock;
  }
}
