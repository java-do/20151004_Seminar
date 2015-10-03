package javado.handsOn.useLombok;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * final（とNonNull） なフィールドだけの引数付きコンストラクタ（コード例）
 */
@Slf4j
@RequiredArgsConstructor
@Getter
public class HandsOn05 {

  private final String name;
  @Setter
  private String state;

  public static void main(String[] args) {
    HandsOn05 target = new HandsOn05("JavaDo");
    target.setState("札幌");
    log.info(target.getName() + ", " + target.getState());
  }

}
