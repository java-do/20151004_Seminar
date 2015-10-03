package javado.handsOn.useLombok;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

/**
 * インスタンス化する必要のないユーティリティクラスの作成（コード例）
 */
@Slf4j
@UtilityClass
public class HandsOn18 {

  public static boolean isBlank(String arg0) {
    return arg0 == null || arg0.length() == 0;
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
