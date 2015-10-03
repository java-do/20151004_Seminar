package javado.handsOn.vanilla;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Getter, Setter
 */
// TODO: lombok.Getter, lombok.Setter アノテーション
public class HandsOn01 {

  private static final Logger log = LoggerFactory.getLogger(HandsOn01.class);

  private String info;

  // TODO: メソッド削除
  public void setInfo(String info) {
    this.info = info;
  }

  // TODO: メソッド削除
  public String getInfo() {
    return info;
  }

  public static void main(String[] args) {
    HandsOn01 target = new HandsOn01();
    target.setInfo("成功！");
    log.info(target.getInfo());
  }

}
