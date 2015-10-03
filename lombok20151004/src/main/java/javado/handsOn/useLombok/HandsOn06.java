package javado.handsOn.useLombok;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * toString メソッドの自動生成（コード例）
 */
@Slf4j
@AllArgsConstructor
@ToString
public class HandsOn06 {

  private String name;
  private String state;

  public static void main(String[] args) {
    HandsOn06 target = new HandsOn06("JavaDo", "札幌");
    log.info(target.toString());
  }

}
