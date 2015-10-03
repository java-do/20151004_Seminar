package javado.handsOn.vanilla;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
// TODO: lombok.ToString アノテーション
public class HandsOn06 {

  private String name;
  private String state;

  // TODO: 削除
  @Override
  public String toString() {
    return "HandsOn06(name=" + name + ", state=" + state + ")";
  }

  public static void main(String[] args) {
    HandsOn06 target = new HandsOn06("JavaDo", "札幌");
    log.info(target.toString());
  }

}
