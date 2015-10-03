package javado.sample.vanilla;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

  private static final Logger log = LoggerFactory.getLogger(App.class);

  /**
   * 処理の開始
   */
  public static void main(String[] args) {
    List<NorwegianForestCat> cats = makeCats();

    // NorwegianForestCat#toString()
    cats.stream().forEach(System.out::println);

    NorwegianForestCat saburo = new NorwegianForestCat("サブロー", 3, HairType.BOSA);

    // false になる
    if (cats.contains(saburo)) {
      log.warn(saburo.toString() + "はすでに存在します.");
    } else {
      log.info(saburo.toString() + "は存在しません.");
    }

    // NorwegianForestCat#mew()
    cats.stream().forEach(cat -> cat.mew());

    log.info("------------ お風呂 ------------");

    // ボサボサ猫をフワフワ猫にして mew()
    ShowerMachine shower = new ShowerMachine();
    cats.stream()
            .map(cat -> shower.wash(cat))
            .forEach(cat -> cat.mew());
  }

  /**
   * 猫を作成する
   *
   * @return NorwegianForestCatのタローとジローとサブローのList
   */
  public static List<NorwegianForestCat> makeCats() {
    return Stream.of(
            new NorwegianForestCat("タロー", 10, HairType.BOSA),
            new NorwegianForestCat("ジロー", 5, HairType.FUWA),
            new NorwegianForestCat("サブロー", 3, HairType.BOSA)
    ).collect(Collectors.toList());
  }

}
