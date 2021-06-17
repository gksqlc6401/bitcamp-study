package com.eomcs.lang.ex06;

public class Test04 {

  static int countEvenNumbers(int value) {
    int count =0;

    //이 메소드는 파라미터(value)로 주어진 값을 분석하여
    //짝수 개수를 리턴하는 메소드이다.
    //커드를 완성하시오!
    //예) value =4567034 --> 리턴 값 =4
    //예) value =8088753 --> 리턴 값 =4
    //boolean r1 =4%2==0;
    //System.out.println(4%2==0);

    int n =value;
    while (n != 0) {
      if((n%2)==0)
        count++;
      n = n / 10;

    }

    return count;
  }

  public static void main(String[] args) {
    int result = countEvenNumbers(4567034);
    System.out.println(result); //4

    result = countEvenNumbers(8088753);
    System.out.println(result); //4
  }

}
