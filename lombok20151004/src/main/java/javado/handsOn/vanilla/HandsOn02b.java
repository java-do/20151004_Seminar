package javado.handsOn.vanilla;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ParameterのNullチェック
 */
public class HandsOn02b {
  private static final Logger log = LoggerFactory.getLogger(HandsOn02b.class);

  public static void main(String[] args) {

    mew("ネコ", "ニャー");

    try {
      mew(null, null);
    } catch (NullPointerException e) {
      log.error(e.toString());
    }

  }

  // TODO: NonNull アノテーションを引数それぞれの型の前に追加
  public static void mew(String animal, String voice) {
    // TODO: ifブロックを削除
    if (animal == null) {
      throw new NullPointerException("animal");
    }

    // TODO: ifブロックを削除
    if (voice == null) {
      throw new NullPointerException("voice");
    }

    log.info(animal + "が" + voice + "と鳴いた");
  }

}
