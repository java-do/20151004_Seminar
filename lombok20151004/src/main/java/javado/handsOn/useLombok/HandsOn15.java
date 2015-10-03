package javado.handsOn.useLombok;

import lombok.SneakyThrows;

/**
 * throws 宣言の省略（コード例）
 * 
 * lombok 1.16.6 現在、NetBeansでは動作しない？
 */
public class HandsOn15 {

  public static void main(String[] args) {
    throwException();
  }

  @SneakyThrows
  public static void throwException() {
    throw new Exception("チェック例外!");
  }

}
