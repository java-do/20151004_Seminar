package javado.handsOn.useLombok;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Beanやデータオブジェクト向けの設定を一度に行う（コード例）
 * 
 * <dl>
 * <dt>Dataに含まれるlombokアノテーション</dt>
 * <dd>ToString</dd>
 * <dd>EqualsAndHashCode</dd>
 * <dd>RequiredArgsConstructor</dd>
 * <dd>Getter</dd>
 * <dd>Setter</dd>
 * </dl>
 */
@Slf4j
@Data
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
