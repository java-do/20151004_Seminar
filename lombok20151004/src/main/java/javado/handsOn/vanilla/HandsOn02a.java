package javado.handsOn.vanilla;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * NonNull（コード例）
 */
// TODO: lombok.Getter, lombok.Setter アノテーション
public class HandsOn02a {

  private static final Logger log = LoggerFactory.getLogger(HandsOn02a.class);

  // TODO: NonNullアノテーション
  private String info;

  // TODO: メソッド削除
  public String getInfo() {
    return info;
  }

  // TODO: メソッド削除
  public void setInfo(String info) {
    if (info == null) {
      throw new NullPointerException("info");
    }
    this.info = info;
  }

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
