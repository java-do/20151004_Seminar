package javado.handsOn.useLombok;

import java.util.ArrayList;
import java.util.List;

import javado.handsOn.vanilla.HandsOn17;
import lombok.ToString;
import lombok.experimental.Delegate;
import lombok.extern.slf4j.Slf4j;

/**
 * 処理の委譲（コード例）
 * 
 * HandsOn17#add(String) の処理を stack#add(String) に委譲する
 */
@Slf4j
@ToString
public class HandsOn17Impl implements HandsOn17 {

  @Delegate(types = HandsOn17.class)
  private final List<String> stack = new ArrayList<>();

  public static void main(String[] args) {
    HandsOn17 target = new HandsOn17Impl();
    target.add("a");
    target.add("b");
    log.info(target.toString());
  }

}
