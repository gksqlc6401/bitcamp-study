package com.eomcs.lang.ex07;

public class Test0260 {
  static void hello(String...names) {
    for(int i=0;i<names.length;i++) {
      System.out.printf("%s님 반갑습니다!",names[i]);
    }
  }
  static void hello2(String[] names,int[] age) {
    for(int i=0;i<names.length;i++) {
      for(int j=0;j<age.length;j++ ) {
        System.out.printf("%d살 %s님 반갑습니다!!!",names[i],age[j]);
      }
    }
  }
  public static void main(String[] args) {
    hello("최한빛","남승범","이승환");
    System.out.println("");

    String[] arr= {"최한빛","남승범","이승환"};
    hello(arr);
    System.out.println("");

    String[] arr2={"최한빛","남승범","이승환","엄진영"};
    age[] arr3{25}
    hello2(arr2);
    System.out.println("");
  }
}
