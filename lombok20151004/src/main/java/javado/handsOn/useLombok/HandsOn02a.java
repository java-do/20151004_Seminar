package javado.handsOn.useLombok;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * フィールド変数のNullチェック（コード例）
 */
@Getter
@Setter
public class HandsOn02a {

  private static final Logger log = LoggerFactory.getLogger(HandsOn02a.class);

  @NonNull
  private String info;

  public static void main(String[] args) {
    HandsOn02a target = new HandsOn02a();
    target.setInfo("成功!");
    log.info(target.getInfo());
    try {
      target.setInfo(null);
    } catch (NullPointerException e) {
      log.info("nullチェックも成功");
    }

  }

}
