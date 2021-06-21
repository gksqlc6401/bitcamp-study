package com.eomcs.lang.ex07;

public class Test0440 {
  static int m1(int value) {
    int r1 = m2(value);
    int r2 = m3(value);
    return r1+r2;
  }
  static int m2(int value) {
    return value+200;
  }
  static int m3(int value) {
    return value+300;
  }
  public static void main(String[] args) {
    int r = m1(10);
    System.out.println(r);
  }
}
