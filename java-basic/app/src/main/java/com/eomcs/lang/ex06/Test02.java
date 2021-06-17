package com.eomcs.lang.ex06;

import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
    Scanner ks = new Scanner(System.in);
    for(;;){
      int menu[]=new int[3];
      int price;
      int mchange;
      int money;


      System.out.println("--------------");
      System.out.println("음료수 자판기");
      System.out.println("--------------");
      System.out.println("1.콜라");
      System.out.println("2.사이다");
      System.out.println("3.물");
      System.out.print("번호를 입력하세요:");
      int num = ks.nextInt();
      //System.out.println("금액을 입력하세요:");
      //int money = ks.nextInt();
      switch(num){
        case 1: 
          System.out.println("콜라 받으세요.");
          break;
        case 2: 
          System.out.println("사이다 받으세요.");
          break;
        case 3: 
          System.out.println("물 받으세요.");
          break;
        default: 
          System.out.println("잘못 입력하셨습니다.");
      }
    }
  }
}