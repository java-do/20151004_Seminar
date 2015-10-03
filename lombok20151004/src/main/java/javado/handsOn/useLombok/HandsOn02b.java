package javado.handsOn.useLombok;

import lombok.NonNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ParameterのNullチェック（コード例）
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

  public static void mew(@NonNull String animal, @NonNull String voice) {
    log.info(animal + "が" + voice + "と鳴いた");
  }

}
