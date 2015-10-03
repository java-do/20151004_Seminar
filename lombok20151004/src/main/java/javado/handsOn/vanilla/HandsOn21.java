package javado.handsOn.vanilla;

import java.util.Random;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * あるクラスのstaticメソッドを、そのメソッドの第一引数の型クラスのメソッドとして使える
 * 
 * 黒魔術っぽい...
 */
@Slf4j
@ToString
// TODO: lombok.experimental.ExtensionMethod アノテーション
public class HandsOn21 {

  public static void main(String[] args) {
    Integer arg0 = new Random().nextInt(100);
    Integer arg1 = new Random().nextInt(100);

    log.info("A is " + arg0);
    log.info("B is " + arg1);
    // TODO: log.info(arg0.measure(arg1)) に書き換える
    log.info(Extentions.measure(arg0, arg1));
  }

}

class Extentions {
  public static String measure(Integer left, Integer right) {
    if (left.intValue() == right.intValue()) {
      return "Drow!";
    }
    if (left.intValue() > right.intValue()) {
      return "A is Bigger!";
    }
    return "B is Bigger!";
  }
}
