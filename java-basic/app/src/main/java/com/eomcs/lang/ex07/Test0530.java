package com.eomcs.lang.ex07;

public class Test0530 {
  public static void main(String[] puls) {
    int sum = 0;
    for(String puls1 : puls)
      sum += Integer.parseInt(puls1);
    System.out.printf("합계:%d\n",sum);
  }
}