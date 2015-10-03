package javado.handsOn.vanilla;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * 引数付きコンストラクタでファクトリメソッドを作る
 */
@Slf4j
// TODO: lombok.AllArgsConstructorアノテーション (staticName="of")
@Getter
public class HandsOn04b {

  private String info;

  // TODO: コンストラクタ削除
  public HandsOn04b(String info) {
    this.info = info;
  }

  // TODO: メソッド削除
  public static HandsOn04b of(String info) {
    return new HandsOn04b(info);
  }

  public static void main(String[] args) {
    HandsOn04b target = HandsOn04b.of("成功!");
    log.info(target.getInfo());
  }

}
