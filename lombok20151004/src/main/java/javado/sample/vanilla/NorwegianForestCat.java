package javado.sample.vanilla;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ノルウェイジャンフォレストキャットという種類の猫クラス
 */
public class NorwegianForestCat {

  private static final Logger log = LoggerFactory.getLogger(NorwegianForestCat.class);

  private String name;
  private int age;
  private String hair;

  /**
   * 引数付きコンストラクタ
   *
   * @param name
   *          名前
   * @param age
   *          年齢
   * @param hair
   *          毛並
   */
  public NorwegianForestCat(String name, Integer age, String hair) {
    if (name == null) {
      throw new NullPointerException("name");
    }
    if (age == null) {
      throw new NullPointerException("age");
    }
    if (hair == null) {
      throw new NullPointerException("hair");
    }
    this.name = name;
    this.age = age;
    this.hair = hair;
  }

  public void setName(String name) {
    if (name == null) {
      throw new NullPointerException("name");
    }
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(Integer age) {
    if (age == null) {
      throw new NullPointerException("age");
    }
    this.age = age;
  }

  public Integer getAge() {
    return age;
  }

  public void setHair(String hair) {
    if (hair == null) {
      throw new NullPointerException("hair");
    }
    this.hair = hair;
  }

  public String getHair() {
    return hair;
  }

  /**
   * 鳴く
   */
  public void mew() {
    log.info(hair + "で" + age + "才の" + name + "がニャーと鳴いた!");
  }

}
