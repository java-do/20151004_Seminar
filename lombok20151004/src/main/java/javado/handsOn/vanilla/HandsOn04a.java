package javado.handsOn.vanilla;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * 引数付きコンストラクタ - AllArgsConstructor
 */
@Slf4j
// TODO: lombok.AllArgsConstructor アノテーション
@Getter
public class HandsOn04a {

  private String info;

  // TODO: メソッド削除
  public HandsOn04a(String info) {
    this.info = info;
  }
  
  public static void main(String[] args) {
    HandsOn04a target = new HandsOn04a("成功!");
    log.info(target.getInfo());
  }

}
