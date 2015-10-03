package javado.sample.useLombok;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.val;
import lombok.extern.slf4j.Slf4j;

/**
 * <dl>
 * <dt>クラス用のLombokアノテーション</dt>
 * <dd>Slf4j : log という変数でslf4j を利用できるようにする</dd>
 * <dt>Lombok変数</dt>
 * <dd>val : インスタンス化される型でのfinalなローカル変数を作成する</dd>
 * </dl>
 */
@Slf4j
public class App {

  /**
   * 処理の開始
   */
  public static void main(String[] args) {
    val cats = makeTestData();

    val saburo = new NorwegianForestCat("サブロー", 3, HairType.BOSA);

    // NorwegianForestCat#toString()
    cats.stream().forEach(System.out::println);

    // equals, hashcode が作成されているので、true になる
    if (cats.contains(saburo)) {
      log.info(saburo.toString() + "はすでに存在します.");
    } else {
      log.info(saburo.toString() + "は存在しません.");
    }

    //NorwegianForestCat#mew()
    cats.stream().forEach(cat -> cat.mew());

    log.info("------------ お風呂 ------------");

    // ボサボサ猫をフワフワ猫にして mew()
    val shower = new ShowerMachine();
    cats.stream()
            .map(cat -> shower.wash(cat))
            .forEach(cat -> cat.mew());
  }

   /**
   * 猫を作成する
   * @return NorwegianForestCatのタローとジローとサブローのList
   */
  public static List<NorwegianForestCat> makeTestData() {
    return Stream.of(
            new NorwegianForestCat("タロー", 10, HairType.BOSA),
            new NorwegianForestCat("ジロー", 5, HairType.FUWA),
            new NorwegianForestCat("サブロー", 3, HairType.BOSA)
    ).collect(Collectors.toList());
  }

}
