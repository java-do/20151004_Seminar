package javado.handsOn.useLombok;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.val;
import lombok.experimental.Helper;
import lombok.extern.slf4j.Slf4j;

/**
 * ヘルパークラスのインスタンス化・呼び出しの簡略化（コード例）
 */
@Slf4j
public class HandsOn19 {

  List<String> getDateMessage(String... args) {
    @Helper
    class Helpers extends CollectionsHelper {
      @Override
      protected <T> List<T> collect(T[] args) {
        return super.collect(args);
      }
    }
    return collect(args);
  }

  public static void main(String[] args) {
    val target = new HandsOn19();
    log.info(target.getDateMessage("Java", "Do", "#02").toString());
  }

}

class CollectionsHelper {
  protected <T> List<T> collect(T[] values) {
    return Arrays.stream(values).collect(Collectors.toList());
  }
}
