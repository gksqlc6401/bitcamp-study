package com.eomcs;

import java.util.Date;
import java.util.Scanner;

public class MemberHandler implements Handler {

  // 사용자 정의 데이터 타입
  // => 도메인 객체(domain object)
  // => 데이터 전송 객체(Data 

  class Member {
    String name;
    String email;
    String password;
    boolean working;
    Date registeredDate;
  }

  String memberGroupName;
  Scanner keyScan;
  ArrayList memberList = new ArrayList();

  MemberHandler(Scanner keyScan) {
    this.keyScan = keyScan;
    this.memberGroupName = "일반";
  }

  MemberHandler(String memberGroupName, Scanner keyScan) {
    this.memberGroupName = memberGroupName;
    this.keyScan = keyScan;
  }

  public void execute() {

    loop: while (true) {
      System.out.print(/*this.*/memberGroupName +"/회원관리 >");
      String command = keyScan.nextLine();

      switch (command) {
        case "list" : /*this.*/list(); break;
        case "add" : /*this.*/add(); break;
        case "update" : /*this.*/update(); break;
        case "delete" : /*this.*/delete(); break;
        case "view" : /*this.*/view(); break;
        case "back" : 
          break loop;
        default:
          System.out.println("지원하지 않는 명렵입니다.");
      }
      System.out.println();
    }
  }
  void add() {
    System.out.println("[회원 등록]");

    if (/*this.*/memberList.size == ArrayList.MAX_LENGTH) {
      System.out.println("더 이상 회원을 추가할 수 없습니다.");
      return;
    }
    Member member = new Member();

    System.out.print("이름: ");
    member.name = /*this.*/keyScan.nextLine();

    System.out.print("이메일: ");
    member.email = /*this.*/keyScan.nextLine();

    System.out.print("비밀번호: ");
    member.password = /*this.*/keyScan.nextLine();

    System.out.print("재직여부:(y/N) ");
    if (/*this.*/keyScan.nextLine().equals("y") ) {
      member.working = true;
    } else {
      member.working = false;
    }

    member.registeredDate = new Date();

    this.memberList.append(member);

    System.out.println("회원을 등록했습니다.");
  }

  void list() { 
    System.out.println("[회원 목록]");

    Object[] arr = /*this.*/memberList.toArray();

    for (int i = 0; i < arr.length; i++) {
      Member member = (Member) arr[i];
      System.out.printf("%d, %s, %s, %b\n", 
          i, 
          member.name,
          String.format("%1$tY-%1$tm-%1$td", member.registeredDate),//2021-06-21
          member.working);
    }
  }

  void view() {
    System.out.println("[회원 조회]");
    System.out.print("번호? ");
    int index = Integer.parseInt(this.keyScan.nextLine());

    if (index < 0 || index >= /*this.*/memberList.size) {
      System.out.println("무효한 회원 번호입니다.");
      return;
    }

    Member member = (Member) /*this.*/memberList.retrieve(index);

    System.out.printf("이름: %s\n", member.name);
    System.out.printf("이메일: %s\n", member.email);
    System.out.printf("등록일: %1$tY-%1$tm-%1$td\n", member.registeredDate);
    System.out.printf("재직중: %s\n",member.working ? "예" : "아니오");
  } 

  void update() {

    System.out.println("[회원 변경]");

    System.out.print("번호? ");
    int index = Integer.parseInt(/*this*/keyScan.nextLine());

    if (index < 0 || index >= /*this.*/memberList.size) {
      System.out.println("무효한 회원 번호입니다.");
      return;
    }

    Member member = (Member) /*this.*/memberList.retrieve(index);

    System.out.printf("이름(%s)? ", member.name);
    //titles[index] = keyScan.nextLine();
    String name = /*this*/keyScan.nextLine();

    System.out.printf("이메일(%s)? ", member.email);
    //contents[index] = keyScan.nextLine();
    String email = /*this*/keyScan.nextLine();

    System.out.printf("암호? ");
    String password = /*this.*/keyScan.nextLine();

    System.out.printf("재직중(%s)? (y/N) ", member.working ? "예" : "아니오");
    boolean working = false;
    if (/*this.*/keyScan.nextLine().equals("y")) {
      working = true;
    }
    System.out.print("정말 변경하시겠습니까(y/N) ");
    //String input = keyScan.nextLine();
    if (!/*this.*/keyScan.nextLine().equals("y")) {
      System.out.println("회원 변경을 취소하였습니다.");
      return;
    }

    // 배열에서 꺼낸 인스턴스의 각 변수 값을 바꾼다.
    member.name = name;
    member.email = email;
    member.password = password;
    member.working = working;

    System.out.println("회원을 변경하였습니다.");

  }

  void delete() {
    System.out.println("[회원 삭제]");

    System.out.print("번호? ");
    int index = Integer.parseInt(/*this.*/keyScan.nextLine());

    if (index < 0 || index >= /*this.*/memberList.size) {
      System.out.println("무효한 회원 번호입니다.");
      return;
    }

    System.out.print("정말 삭제하시겠습니까(y/N) ");
    //String input = keyScan.nextLine();
    if (!/*this.*/keyScan.nextLine().equals("y")) {
      System.out.println("회원 삭제를 취소하였습니다.");
      return;
    }

    /*this*/memberList.remove(index);

    System.out.println("회원을 삭제하였습니다.");
  }
}
