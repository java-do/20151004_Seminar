package javado.handsOn.useLombok;

import java.util.Scanner;

import lombok.Cleanup;

/**
 * Auto Close
 */
public class HandsOn22 {

  public static void main(String[] args) {
    @Cleanup
    Scanner scan = new Scanner(System.in);

    System.out.println("文字を入力してください");
    System.out.println("文字数:" + scan.next().length());
  }
}
