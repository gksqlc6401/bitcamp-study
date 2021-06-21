package com.eomcs.lang.ex07;

public class Test0240 {
  static String hello(String name, int age) {
    String retVal=String.format("%d살 %s님 반갑습니다.",age,name);
    return retVal;
  }
  public static void main(String[] args) {
    String r =hello("최한빛",25);
    System.out.println(r);

    hello("조현진",25);
  }
}
