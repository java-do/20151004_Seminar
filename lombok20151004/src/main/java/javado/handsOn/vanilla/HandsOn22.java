package javado.handsOn.vanilla;

import java.util.Scanner;

/**
 * Auto Close
 * 
 */
public class HandsOn22 {

  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("文字を入力してください");
      System.out.println("文字数:" + scan.next().length());
    }

  }
}
