package javado.handsOn.useLombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * 引数付きコンストラクタでファクトリメソッドを作る（コード例）
 */
@Slf4j
@AllArgsConstructor(staticName = "of")
@Getter
public class HandsOn04b {

  private String info;

  public static void main(String[] args) {
    HandsOn04b target = HandsOn04b.of("成功!");
    log.info(target.getInfo());
  }

}
