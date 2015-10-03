package javado.sample.useLombok;

import java.util.Objects;

import lombok.NonNull;

public class ShowerMachine {

  /**
   * ボサボサキャッツをフワフワキャッツにする
   *
   * （LombokのNonNullアノテーションがパラメータについている例）
   *
   * @param cat NorwegianForestCat
   * @return フワフワになった NorwegianForestCat
   * @throw NullPointerException catがnullのとき
   */
  public NorwegianForestCat wash(@NonNull NorwegianForestCat cat) {
    if (Objects.equals(cat.getHair(), HairType.BOSA)) {
      cat.setHair(HairType.FUWA);
    }
    return cat;
  }

}
