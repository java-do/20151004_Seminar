package javado.handsOn.vanilla;

import java.util.ArrayList;
import java.util.List;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * 処理の委譲
 */
@Slf4j
@ToString
public class HandsOn17Impl implements HandsOn17 {

  // TODO: Delegate アノテーション (types = HandsOn17.class)
  private List<String> stack = new ArrayList<String>();

  // TODO: addメソッドを削除
  @Override
  public boolean add(String item) {
    return stack.add(item);
  }

  public static void main(String[] args) {
    HandsOn17 target = new HandsOn17Impl();
    target.add("a");
    target.add("b");
    log.info(target.toString());
  }

}
