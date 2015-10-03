package javado.handsOn.useLombok;

import lombok.Getter;
import lombok.Setter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Getter, Setterの自動生成（コード例）
 */
@Getter
@Setter
public class HandsOn01 {

  private static final Logger log = LoggerFactory.getLogger(HandsOn01.class);

  private String info;

  public static void main(String[] args) {
    HandsOn01 target  = new HandsOn01();
    target.setInfo("成功！");
    log.info(target.getInfo());
  }

}
