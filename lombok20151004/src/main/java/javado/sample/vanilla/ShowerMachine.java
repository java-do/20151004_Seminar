package javado.sample.vanilla;

import java.util.Objects;

/**
 * シャワーマシン
 */
public class ShowerMachine {

  /**
   * ボサボサキャッツをフワフワキャッツにする
   *
   * @param cat NorwegianForestCat
   * @return フワフワになった NorwegianForestCat
   * @throw NullPointerException catがnullのとき
   */
  public NorwegianForestCat wash(NorwegianForestCat cat) {
    if (cat == null) {
      throw new NullPointerException("cat");
    }
    if (Objects.equals(cat.getHair(), HairType.BOSA)) {
      cat.setHair(HairType.FUWA);
    }
    return cat;
  }

}
