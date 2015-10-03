package javado.handsOn.useLombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * 全フィールドを持つ引数付きコンストラクタ（コード例）
 * 
 * なお、引数なしコンストラクタは NoArgsConstructor で生成できる
 */
@Slf4j
@AllArgsConstructor
@Getter
public class HandsOn04a {

  private String info;

  public static void main(String[] args) {
    HandsOn04a target = new HandsOn04a("成功!");
    log.info(target.getInfo());
  }

}
