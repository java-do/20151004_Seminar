package javado.handsOn.useLombok;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * getter/setter のメソッドチェーン、Fluentインターフェース化（コード例）
 */
@Slf4j
@Data
@Accessors(chain = true, fluent = true)
public class HandsOn11 {

  private String name;
  private String state;

  public static void main(String[] args) {
    HandsOn11 target1 = new HandsOn11()
            .name("JavaDo")
            .state("札幌");

    log.info("target1: " + target1.toString());
  }

}
