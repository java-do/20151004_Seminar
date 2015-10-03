package javado.handsOn.useLombok;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Loggerの自動生成（コード例）
 * 
 * この例では SLF4J を使っている
 */
@Slf4j
@Getter
@Setter
public class HandsOn03 {

  private String info;

  public static void main(String[] args) {
    HandsOn03 target = new HandsOn03();
    target.setInfo("成功！");
    log.info(target.getInfo());
  }

}
