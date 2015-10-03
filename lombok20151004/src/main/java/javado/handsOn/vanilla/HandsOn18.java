package javado.handsOn.vanilla;

import lombok.extern.slf4j.Slf4j;

/**
 * インスタンス化する必要のないユーティリティクラスの作成
 */
@Slf4j
// lombok.experimental.UtilityClass アノテーション
public class HandsOn18 {

  public static boolean isBlank(String arg0) {
    return arg0 == null || arg0.length() == 0;
  }

  // TODO: コンストラクタを削除
  private HandsOn18() {
    throw new UnsupportedOperationException("ユーティリティクラスなのでインスタンス化しない");
  }

  public static void main(String[] args) {

    log.info("foo is" + isBlank("foo"));
    log.info("null is" + isBlank(null));

    try {
      callInstantiation();
    } catch (Exception ex) {
      log.error(ex.toString());
    }
  }

  public static void callInstantiation() {
    new HandsOn18();
  }

}
