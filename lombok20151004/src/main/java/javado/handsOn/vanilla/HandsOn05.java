package javado.handsOn.vanilla;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * final（とNonNull） なフィールドだけの引数付きコンストラクタ
 */
@Slf4j
// TODO: lombok.RequiredArgsConstructor アノテーション
@Getter
public class HandsOn05 {

  private final String name;
  // TODO: lombok.Setter アノテーション
  private String state;

  // TODO: コンストラクタ削除
  public HandsOn05(String name) {
    this.name = name;
  }

  // TODO: メソッド削除
  public void setState(String state) {
    this.state = state;
  }

  public static void main(String[] args) {
    HandsOn05 target = new HandsOn05("JavaDo");
    target.setState("札幌");
    log.info(target.getName() + ", " + target.getState());
  }

}
