package com.eomcs.lang.ex07;

import java.util.Scanner;

//# 메서드 : 사용 전
//
public class Test0111 {

  static void printSpaces(int len){
    for(int i=0; i<len; i++){
      System.out.print(" ");
    }
  }
  static void printStar(int len){
    for(int i=0; i<len; i++){
      System.out.print("*");

    }
  }

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();


    for(int starLen=1; starLen<=len; starLen+=2){
      printSpaces((len - starLen) / 2 );
      printStar(starLen);
      System.out.println();
    }
    keyScan.close();
  }
}
