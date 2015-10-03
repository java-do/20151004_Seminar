package javado.handsOn.vanilla;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.val;
import lombok.extern.slf4j.Slf4j;

/**
 * ヘルパークラスのインスタンス化・呼び出しの簡略化
 */
@Slf4j
public class HandsOn19 {

  List<String> getDateMessage(String... args) {
    // TODO: classの前に lombok.experimental.Helper アノテーション
    class Helpers extends CollectionsHelper {
      @Override
      protected <T> List<T> collect(T[] args) {
        return super.collect(args);
      }
    }
    // TODO: 下の二行を消して、return collect(args); に書き換え
    Helpers helpers = new Helpers();
    return helpers.collect(args);
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
