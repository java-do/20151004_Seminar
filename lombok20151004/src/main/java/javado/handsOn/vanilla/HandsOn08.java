package javado.handsOn.vanilla;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * フィールド修飾子の自動生成（コード例）
 */
@Slf4j
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
// lombok.experimental.FieldDefaultsアノテーション (makeFinal = true, level = AccessLevel.PRIVATE)
public class HandsOn08 {

  // TODO: private final を削除
  private final String name;
  // TODO: private final を削除
  private final String state;

  public static void main(String[] args) {
    HandsOn08 target1 = new HandsOn08("JavaDo", "札幌");
    HandsOn08 target2 = new HandsOn08("JavaDo", "札幌");
    log.info("target1: " + target1.toString());
    log.info("target2: " + target2.toString());
    log.info("contains: " + target1.equals(target2));
  }

}
