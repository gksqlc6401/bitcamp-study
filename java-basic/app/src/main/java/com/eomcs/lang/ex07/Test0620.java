package com.eomcs.lang.ex07;

public class Test0620 {
  public static void main(String[] args) {
    String name = System.getProperty("name");
    String kor = System.getProperty("kor");
    String eng = System.getProperty("eng");
    String math = System.getProperty("math");

    if(name==null || kor==null || eng==null || math==null) {
      System.out.println( "실행 형식: java -cp ./bin/main -Dname=이름 -Dkor=국어점수 -Deng=영어점수 -Dmath=수학점수 com.eomcs.basic.ex07.Exam0620");
      return;
    }
    int kor1 = Integer.parseInt(kor);
    int eng1 = Integer.parseInt(eng);
    int math1 = Integer.parseInt(math);

    int sum = kor1+eng1+math1;
    System.out.printf("이름:%s\n",name);
    System.out.printf("총점:%d\n",sum);
    System.out.printf("평균:%.2f\n",sum/3f);

  }

}
