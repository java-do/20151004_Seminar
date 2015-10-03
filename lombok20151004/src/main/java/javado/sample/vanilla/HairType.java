package javado.sample.vanilla;

//本来、この用途なら enum でやるような気がしますが...
public class HairType {

  public static final String BOSA = "ボサボサ";
  public static final String FUWA = "フワフワ";

  private HairType() {
    throw new AssertionError("don't instantiation!");
  }

  /**
   * コンストラクタをわざと呼び出すためのメソッド！
   */
  public static void callIntantiation() {
    new HairType();
  }

}
