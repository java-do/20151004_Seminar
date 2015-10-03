package javado.handsOn.vanilla;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * getter/setter のメソッドチェーン、Fluentインターフェース化
 */
@Slf4j
@Data
// TODO: lombok.experimental.Accessorsアノテーション (mchain = true, fluent = true)
public class HandsOn11 {

  private String name;
  private String state;
  
  // TODO: メソッド削除
  public HandsOn11 name(String name) {
    this.name = name;
    return this;
  }
  
  // TODO: メソッド削除
  public HandsOn11 state(String state) {
    this.state = state;
    return this;
  }

  public static void main(String[] args) {
    HandsOn11 target1 = new HandsOn11()
            .name("JavaDo")
            .state("札幌");

    log.info("target1: " + target1.toString());
  }

}
