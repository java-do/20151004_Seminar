package javado.handsOn.vanilla;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

/**
 * バリューオブジェクト向けの設定を一度に行う（コード例）
 */
@Slf4j
//TODO: 削除
@AllArgsConstructor
//TODO: 削除
@EqualsAndHashCode
//TODO: 削除
@Getter
//TODO: 削除
@ToString
//TODO: 削除
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
//TODO: lombok.Valueアノテーション
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
