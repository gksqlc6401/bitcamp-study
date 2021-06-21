package com.eomcs.lang.ex07;

import java.util.Scanner;

//# 메서드 : 사용 전
//
public class Test01113 {

  static void spaces(int len) {
    for(int i=0; i<len;i++) {
      System.out.println(" ");
    }
  }

  static void star(int len) {
    for(int i=0;i<len;i++) {
      System.out.println("*");
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("밑변의 길이는?:");
    int len=sc.nextInt();

    for(int starLen=1; star<len; starLen++) {
      spaces((len-starLen) /2);
      star(starLen);
      System.out.println();
    }
    sc.close();
  }
}

