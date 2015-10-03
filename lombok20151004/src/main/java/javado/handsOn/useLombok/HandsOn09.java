package javado.handsOn.useLombok;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;

/**
 * バリューオブジェクト向けの設定を一度に行う（コード例）
 * 
 * <dl>
 * <dt>Valueに含まれるlombokアノテーション</dt>
 * <dd>ToString</dd>
 * <dd>EqualsAndHashCode</dd>
 * <dd>AllArgsConstructor</dd>
 * <dd>FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)</dd>
 * <dd>Getter</dd>
 * </dl>
 */
@Slf4j
@Value
public class HandsOn09 {

  String name;
  String state;

  public static void main(String[] args) {
    HandsOn09 target1 = new HandsOn09("JavaDo", "札幌");
    HandsOn09 target2 = new HandsOn09("JavaDo", "札幌");
    log.info("target1: " + target1.toString());
    log.info("target2: " + target2.toString());
    log.info("contains: " + target1.equals(target2));
  }

}
