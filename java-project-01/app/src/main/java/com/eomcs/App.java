package com.eomcs;

import java.util.Date;
import java.util.Scanner;


public class App{
  public static void main(String[] args) {

    final int BOARD_LENGTH = 3;
    String[] titles = new String[BOARD_LENGTH];
    String[] contents = new String[BOARD_LENGTH];
    String[] passwords = new String[BOARD_LENGTH];
    int[] viewCounts = new int[BOARD_LENGTH]; 
    Date[] createdDates = new Date[BOARD_LENGTH];

    int size = 0;

    System.out.println("게시판 관리");

    Scanner sc = new Scanner(System.in);

    while(true) {
      System.out.println("명령: ");
      String command = sc.nextLine();

      loop : switch (command) {
        case "list" : 
          System.out.println("게시글 목록");
          for (int i = 0; i<size; i++) {
            System.out.printf("%d, %s, %d",i,titles[i], viewCounts[i]);
          }

          break;
        case "add" :
          System.out.println("게시글 등록");

          if (size == BOARD_LENGTH) {
            System.out.println("더이상 글을 추가할 수 없습니다.");
            break;
          }

          System.out.println("제목 :");
          titles[size] = sc.nextLine();

          System.out.println("내용 :");
          contents[size] = sc.nextLine();

          System.out.println("비밀번호");
          passwords[size] = sc.nextLine();

          createdDates[size] = new Date();

          System.out.println("게시글을 등록 했습니다.");

          size++;

          break;

        case "update" :
          System.out.println("게시글 변경");
          System.out.println("번호: ");
          break;
        case "delete" :
          System.out.println("게시글 삭제");
          break;
        case "view" :
          System.out.println("게시글 조회");
          System.out.print("번호:");
          int index = Integer.parseInt(sc.nextLine());

          if(index < 0 || index>=size) {
            System.out.println("무효한 게시글 번호입니다.");
            break;
          } 

          viewCounts[index]++;

          System.out.printf("제목: %s\n", titles[index]);
          System.out.printf("내용: %s\n", contents[index]);
          System.out.printf("조회수: %s\n", viewCounts[index]);
          System.out.printf("등록일: %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n", createdDates[index]);

          break;
        case "quit" :
          break loop;
        default :
          System.out.println("지원하지 않는 명령입니다.");

      }
    }
  }
}