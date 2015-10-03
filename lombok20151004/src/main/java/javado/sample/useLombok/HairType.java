package javado.sample.useLombok;

import lombok.experimental.UtilityClass;

/**
 * 本来、この用途なら enum でやるような気がしますが...
 * 
 * <dl>
 * <dt>クラス用のLombokアノテーション</dt>
 * <dd>UtilityClass : ユーティリティ用にインスタンス化を不能にする</dd>
 * </dl>
 */
@UtilityClass
public class HairType {

  public static final String BOSA = "ボサボサ";
  public static final String FUWA = "フワフワ";

  /**
   * コンストラクタをわざと呼び出すためのメソッド！
   */
  public static void callIntantiation() {
    new HairType();
  }

}
