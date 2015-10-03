package javado.handsOn.vanilla;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Beanやデータオブジェクト向けの設定を一度に行う（コード例）
 */
@Slf4j
// TODO: 削除
@RequiredArgsConstructor
// TODO: 削除
@EqualsAndHashCode
// TODO: 削除
@Getter
// TODO: 削除
@Setter
// TODO: 削除
@ToString
// TODO: lombok.Dataアノテーション
public class HandsOn10 {

  private String name;
  private String state;

  public static void main(String[] args) {
    HandsOn10 target1 = new HandsOn10();
    target1.setName("JavaDo");
    target1.setState("札幌");

    HandsOn10 target2 = new HandsOn10();
    target2.setName("JavaDo");
    target2.setState("札幌");

    log.info("target1: " + target1.toString());
    log.info("target2: " + target2.toString());
    log.info("contains: " + target1.equals(target2));
  }

}
