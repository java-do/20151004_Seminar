package javado.handsOn.useLombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * equals, hashCodeメソッドの自動生成（コード例）
 */
@Slf4j
@AllArgsConstructor
@EqualsAndHashCode
@Getter
public class HandsOn07 {

  private String name;
  private String state;

  public static void main(String[] args) {
    HandsOn07 target1 = new HandsOn07("JavaDo", "札幌");
    HandsOn07 target2 = new HandsOn07("JavaDo", "札幌");
    log.info("target1: " + target1.toString());
    log.info("target2: " + target2.toString());
    log.info("contains: " + target1.equals(target2));
  }

}
