package com.eomcs.lang.ex04;

public class Test04{
    public static void main(String[] args) {
    int[] a;
    a= new int[3];

    a[0]=100;
    a[1]=200;
    a[2]=300;
    
    a= new int[5];
    a[0]=200;

    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    }
}