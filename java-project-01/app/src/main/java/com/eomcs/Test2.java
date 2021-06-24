package com.eomcs;
public class Test2 {

  static class A {
    int x;
  }
  static class B {
    int y;
  }
  static class C {
    int z;
  }

  public static void main(String[] args) {
    A r1 = new A();
    r1.x =100;




    Object obj =new A();
    A r2 =  (A) obj;
    r2.x =100;

    System.out.println("종료");
  }

}