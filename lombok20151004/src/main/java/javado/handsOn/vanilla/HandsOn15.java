package javado.handsOn.vanilla;

/**
 * lombok 1.16.6 現在、NetBeansでは動作しない？
 */
public class HandsOn15 {

  // TODO: throws Exception を削除
  public static void main(String[] args) throws Exception {
    throwException();
  }

  // TODO: SneakyThrows アノテーション
  // TODO: throws Exception を削除
  public static void throwException() throws Exception {
    throw new Exception("チェック例外!");
  }

}
