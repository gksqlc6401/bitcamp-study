package com.eomcs.lang.ex07;

public class Teat0310 {
  static void swap(int a,int b) {
    System.out.printf("swap(): a=%d b=%d\n",a,b);
    int temp=a;
    a=b;
    b=temp;
    System.out.printf("swap(): a=%d b=%d\n",a,b);

  }

  public static void main(String[] args) {
    int a=100;
    int b=200;

    swap(a,b);
    System.out.printf("main():a=%d b=%d\n",a,b);
  }
}
